package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(1, 124.00, false, false);

        System.out.println(room);
        boolean isRoomAvailable = room.isAvailable();
        System.out.println("Is room available: " + isRoomAvailable);




    }
}
