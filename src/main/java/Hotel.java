package com.ccp.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<com.ccp.hotel.Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    public void addRoom(com.ccp.hotel.Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null.");
        }
        rooms.add(room);
    }

    public com.ccp.hotel.Room findRoomByNumber(int roomNumber) {
        for (com.ccp.hotel.Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public void bookRoom(int roomNumber) {
        com.ccp.hotel.Room room = findRoomByNumber(roomNumber);
        if (room == null) {
            throw new IllegalArgumentException("Room not found.");
        }
        room.bookRoom();
    }

    public void showAvailableRooms() {
        for (com.ccp.hotel.Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println(
                        "Room " + room.getRoomNumber() +
                                " | Type: " + room.getRoomType() +
                                " | Price: " + room.getPrice()
                );
            }
        }
    }
}