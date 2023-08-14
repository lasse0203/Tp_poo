package TP_Hotel;

import Tp_Biblio.Livre;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private static int count=0;
    private int reservationNumber;

    private boolean statutReservation ;

    private ArrayList<Room> rooms;

    private Client client;

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public boolean isStatutReservation() {
        return statutReservation;
    }

    public void setStatutReservation(boolean statutReservation) {
        this.statutReservation = statutReservation;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Reservation(boolean statutReservation, ArrayList<Room> rooms, Client client) {
        this.reservationNumber = ++count;
        this.statutReservation = statutReservation;
        this.rooms = rooms;
        this.client = client;
    }

    public void getReservationInfo() {
        System.out.println(" Reservation " +
                " reservationNumber " + reservationNumber +
                ", statutReservation est " + statutReservation +
                ", rooms" + getRoomReservationInfo(rooms) +
                ", client" + client.getClientInfo()) ;
    }



    public String getRoomReservationInfo(List<Room> rooms){
        String roomsString = "";
        for (Room room:rooms) {
            roomsString += room.roomInfo();
        }
        return roomsString;
    }

}
