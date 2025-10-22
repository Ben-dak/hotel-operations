package com.pluralsight;

public class Reservation {
    // instance variables
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double price;

    //constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend, double price) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.price = price;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public boolean getIsWeekend() {
        return this.isWeekend;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }

    public double getPrice() {
//        double basePrice;
        if (getRoomType().equalsIgnoreCase("king")) {
            setPrice(139.00);
        } else {
            setPrice(124.00);
        }
        return this.price;
    }

    // setter
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Methods

}
