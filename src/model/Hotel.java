package model;

import java.io.Serializable;

public class Hotel implements Serializable {
    private int idRoom;
    private int boardingDay;
    private String kindOfRoom;
    private double price;
    private Client client;

    public Hotel() {
    }

    public Hotel(int idRoom, int boardingDay, String kindOfRoom, double price) {
        this.idRoom = idRoom;
        this.boardingDay = boardingDay;
        this.kindOfRoom = kindOfRoom;
        this.price = price;
        this.client = new Client();
    }

    public Hotel(int idRoom, int boardingDay, String kindOfRoom, double price, String name, int age, String cMND) {
        this.idRoom = idRoom;
        this.boardingDay = boardingDay;
        this.kindOfRoom = kindOfRoom;
        this.price = price;
        this.client = new Client(name, age, cMND);
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getBoardingDay() {
        return boardingDay;
    }

    public void setBoardingDay(int boardingDay) {
        this.boardingDay = boardingDay;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "idRoom=" + idRoom +
                ", boardingDay=" + boardingDay +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", price=" + price +
                ", client=" + client +
                '}';
    }
}