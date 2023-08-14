package TP_Hotel;

public class Room {
    private int room;

    private boolean booked;
    private int bedNumber;

    private Double price;


    public Room(int room, int bedNumber, Double price) {
        this.room = room;
        this.bedNumber = bedNumber;
        this.price = price;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public String roomInfo() {
        return "Room" +
                " room " + room +
                ", booked " + booked +
                ", bedNumber " + bedNumber +
                ", price " + price ;
    }
}
