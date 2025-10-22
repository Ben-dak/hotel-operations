package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal ) {

    }

    public String getRoomType() {
        return this.roomType;
    }

    public double getPrice() {
        return this.price;
    }

    public int numberOfNights() {
        return this.numberOfNights;
    }

    public boolean getIsWeekend() {
        return this.isWeekend;
    }

    public double getReservationTotal() {
        return this.reservationTotal;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

}
