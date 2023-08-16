package TP_Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppHotel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Hotel creation
        Hotel hotel = new Hotel();
        ArrayList<Room> rooms= new ArrayList<>();
        rooms.add(new Room(1,2,60.));
        rooms.add(new Room(2,3,80.));
        rooms.add(new Room(3,1,100.));
        rooms.add(new Room(4,1,50.));
        rooms.add(new Room(5,2,100.));
        rooms.add(new Room(6,1,50.));
        hotel.setRooms(rooms);


        // Menu
        System.out.println("=== Main menu ===");

        // Menu choice

        int choice =-1;
        while (choice != 0) {
            System.out.println( "1. Add Client ");
            System.out.println( "2. Client's list ");
            System.out.println( "3. Client reservation ");
            System.out.println( "4. Add reservation ");
            System.out.println( "5. Cancel reservation ");
            System.out.println( "6. List of reservations ");
            System.out.println( "Make your choice : ");
            choice = scanner.nextInt();

            switch (choice){

                case 1 : {
                    addClientInfo(scanner, hotel);
                    break;
                }
                case 2 : {
                    System.out.println("=== Client's List === ");
                    // List of clients
                    hotel.listClient();
                    break;
                }
                case 3 : {
                    System.out.println("=== Client reservation === ");
                    // Client reservation
                    System.out.println("witch client would you like to check his reservation? :");
                    hotel.listClient();
                    int clientId = scanner.nextInt();
                    List<Reservation> reservationClient = hotel.getReservationsByClientId(clientId);
                    if (reservationClient.isEmpty()){
                        System.out.println("client: " + clientId + " doesn't have a reservation ");
                    }else {

                        hotel.getReservationInfo(reservationClient);
                    }

                    break;

                }
                case 4 :{
                    System.out.println("=== Add reservation ===");
                    // add reservation
                    if(hotel.getClients().isEmpty()){
                        System.out.println("Client list is empty please add a new client!");
                        addClientInfo(scanner,hotel);
                    }
                    System.out.println("for which client do you want to create a reservation?");
                    hotel.listClient();
                    int clientId = scanner.nextInt();
                    Client client = hotel.findClientById(clientId);
                    while (client == null){
                        System.out.println("No client founded, please choose another client!");
                        clientId = scanner.nextInt();
                        client = hotel.findClientById(clientId);
                    }

                    System.out.println("Which room would you like to book: ");
                    hotel.listRoom();
                    int roomId = scanner.nextInt();
                    Room room = hotel.findRoomById(roomId);
                    while(room==null || room.isBooked()){
                        System.out.println("No room founded or this room is already booked please choose another one!");
                        roomId= scanner.nextInt();
                        room = hotel.findRoomById(roomId);
                    }
                    room.setBooked(true);
                    ArrayList roomsReservation = new ArrayList();
                    roomsReservation.add(room);
                    System.out.println("Would you like to book another room: Y/N ?");
                    String rep = scanner.next();
                    while ("Y".equalsIgnoreCase(rep)) {
                        System.out.println("Which room would you like to book: ");
                        roomId = scanner.nextInt();
                        room = hotel.findRoomById(roomId);
                        if(room == null){
                            System.out.println("this room does not exist!");
                        }
                        room.setBooked(true);
                        roomsReservation.add(room);
                        System.out.println("Would you like to book another room: Y/N ?");
                        rep = scanner.next();
                    }
                    Reservation reservation = new Reservation(true,roomsReservation,client);

                    hotel.addReservation(reservation);
                    System.out.println("Reservation has been created");
                    break;
                }
                case 5 :{
                    System.out.println("witch reservation would you like to cancel ?");
                    hotel.listReservation();
                    int reservationId = scanner.nextInt();
                    Reservation reservation = hotel.findReservationById(reservationId);
                    reservation.setStatutReservation(false);
                    for (Room room:reservation.getRooms()) {
                        room.setBooked(false);
                    }
                    System.out.println("reservation: " + reservationId +" has been canceled");

                    break;
                }
                case 6 :{
                    hotel.listReservation();
                    break;
                }
                default:
                    System.out.println("Invalide Value");
            }

        }
    }



    private static Client addClientInfo(Scanner scanner, Hotel hotel) {
        System.out.println("Enter Client name : ");
        String clientName = scanner.next();
        System.out.println("Enter Client last name :");
        String clientLastName = scanner.next();
        System.out.println("Enter Client phone number: ");
        String clientPhoneNumber = scanner.next();
        Client client = new Client(1,clientName,clientLastName,clientPhoneNumber);
        // add client
        hotel.addClient(client);
        System.out.println("Client " + clientLastName+" has been created successfully! ");
        return client;
    }
}
