package com.pluralsight;

import java.util.Scanner;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    static Scanner myScanner = new Scanner(System.in);

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = isOccupied;
        this.dirty = isDirty;
    }

    public Room() {
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public double getPrice () {
        return price;
    }
    public boolean getOccupied () {
        return occupied;
    }
    public boolean isDirty () {
        return dirty;
    }

    public boolean isAvailable () {
        if (!dirty && !occupied) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkIn() {
        // If the room is already occupied
        if (this.isAvailable()) {
            this.occupied = true;
            this.dirty = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkOut() {
        if (this.occupied) {
            this.dirty = true;
            this.occupied = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean cleanRoom() {
        if (this.dirty) {
            this.dirty = false;
            return true;
        }
        else {
            return false;
        }
    }

}
