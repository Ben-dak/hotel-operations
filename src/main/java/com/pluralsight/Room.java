package com.pluralsight;

import java.util.Scanner;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean isDirty;

    static Scanner myScanner = new Scanner(System.in);

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }
    public double getPrice () {
        return this.price;
    }
    public boolean getOccupied () {
        return this.occupied;
    }
    public boolean isDirty () {
        return this.isDirty;
    }
    public boolean isAvailable () {
        if (!isDirty && !occupied) {

        }; //if room is not dirty and not occupied return true -otherwise return false
        return false;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", isOccupied=" + occupied +
                ", isDirty=" + isDirty +
                '}';
    }


    public boolean checkIn() {
        // If the room is already occupied
        if (this.isAvailable()) {
            this.occupied = true;
            this.isDirty = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkOut() {
        if (this.occupied) {
            this.isDirty = true;
            this.occupied = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean cleanRoom() {
        if (this.isDirty) {
            this.isDirty = false;
            return true;
        }
        else {
            return false;
        }
    }
//    public void checkIn() {
//        System.out.println("Will you be checking in?  Enter Yes or No.");
//        String userInput = myScanner.nextLine().trim();
//
//        if (userInput.equalsIgnoreCase("yes")) {
//            if (isAvailable()) {
//                occupied = true;
//                isDirty = true;
//                System.out.println("You have been checked in.");
//            }else {
//                System.out.println("This room is not available.");
//            }
//        }
//    }

}
