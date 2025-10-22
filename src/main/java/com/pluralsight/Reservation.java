package com.pluralsight;

public class Reservation {
    // instance variables
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    //constructor
    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal ) {
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

    // setter
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double basePrice;
        if (roomType.equalsIgnoreCase("king")) {
            basePrice = 139.00;
        } else {
            basePrice = 124.00;
        }
        return basePrice;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}
