package com.ccp.hotel;

public class Main {


    public static void main(String[] args) {

        com.ccp.hotel.Hotel hotel = new com.ccp.hotel.Hotel();

        // Add rooms
        hotel.addRoom(new com.ccp.hotel.Room(101, com.ccp.hotel.RoomType.STANDARD, 3000));
        hotel.addRoom(new com.ccp.hotel.Room(102, com.ccp.hotel.RoomType.DELUXE, 5000));
        hotel.addRoom(new com.ccp.hotel.Room(103, com.ccp.hotel.RoomType.SUITE, 8000));

        // Show available rooms
        System.out.println("Available rooms:");
        hotel.showAvailableRooms();

        // Book a room
        hotel.bookRoom(102);

        System.out.println("\nAfter booking room 102:");
        hotel.showAvailableRooms();
    }
}