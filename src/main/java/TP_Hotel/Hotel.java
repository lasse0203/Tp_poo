package TP_Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private ArrayList<Client> clients=new ArrayList<>();
    private ArrayList<Room> rooms=new ArrayList<>();
    private ArrayList<Reservation> reservations=new ArrayList<>();

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void listClient(){
        for (Client client:clients) {
            System.out.println(client.getClientInfo());
        }
    }
    public void listReservation(){
        for (Reservation reservation:reservations) {
            reservation.getReservationInfo();
        }
    }
    public void listRoom(){
        for (Room room:rooms) {
            System.out.println(room.roomInfo());
        }
    }
    public Room findRoomById(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoom() == roomNumber) {
                return room;
            }
        }
        return null;
    }
    public Reservation findReservationById(int reservationNumber) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationNumber() == reservationNumber) {
                return reservation;
            }
        }
        return null;
    }

    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }

    public List<Reservation> getReservationsByClientId(int clientId){
        ArrayList<Reservation> reservationsByClient = new ArrayList<>();
        for (Reservation reservation:reservations) {
            if(clientId == reservation.getClient().getIdClient()){
                reservationsByClient.add(reservation);

            }
        }
        return reservationsByClient;
    }

    public void getReservationInfo(List<Reservation> reservations) {
        for (Reservation reservation:reservations) {
            System.out.println(" Reservation " +
                    " reservationNumber " + reservation.getReservationNumber() +
                    ", statutReservation est " + reservation.isStatutReservation() +
                    ", rooms" + reservation.getRoomReservationInfo(reservation.getRooms()) +
                    ", client" + reservation.getClient().getClientInfo()) ;
        }
    }
}

