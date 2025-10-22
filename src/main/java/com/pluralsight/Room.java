package com.pluralsight;

import java.util.Scanner;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    static Scanner myScanner = new Scanner(System.in);

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }
    public double getPrice () {
        return this.price;
    }
    public boolean getOccupied () {
        return this.isOccupied;
    }
    public boolean isDirty () {
        return this.isDirty;
    }
    public boolean isAvailable () {
        return !(isDirty) && !(isOccupied); //if room is not dirty and not occupied return true -otherwise return false
    }
    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", isOccupied=" + isOccupied +
                ", isDirty=" + isDirty +
                '}';

    }

    public void checkIn() {
        System.out.println("Will you be checking in?  Enter Yes or No.");
        String userInput = myScanner.nextLine().trim();

        if (userInput.equalsIgnoreCase("yes")) {
            if (isAvailable()) {
                isOccupied = true;
                isDirty = true;
                System.out.println("You have been checked in.");
            }else {
                System.out.println("This room is not available.");
            }
        }
    }

}
