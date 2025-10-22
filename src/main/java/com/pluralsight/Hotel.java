package com.pluralsight;

public class Hotel {
    private String hotelName;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    //2 types of rooms - King Suite and Basic Double room

    public Hotel(String Name, int numberOfSuites, int numberOfRooms) {
    }

    public Hotel(String Name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if ()
    }

}
