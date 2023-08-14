package TP_Hotel;

public class Client {
    private static int count=0;
    private int idClient;

    private String name;
    private String lastName;

    private String phoneNumber;


    public Client(int idClient, String name, String lastName, String phoneNumber) {
        this.idClient = ++count;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;

    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public String getClientInfo() {
        return  "clientId : " + idClient + " name: " + name +
                ", lastName: " + lastName +
                ", phoneNumber: " + phoneNumber ;
    }

}
