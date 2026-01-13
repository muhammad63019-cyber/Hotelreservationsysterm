package com.ccp.hotel;

public class Room {

    private int roomNumber;
    private com.ccp.hotel.RoomType roomType;
    private double price;
    private boolean available;

    public Room(int roomNumber, com.ccp.hotel.RoomType roomType, double price) {

        if (roomNumber <= 0) {
            throw new IllegalArgumentException("Room number must be positive.");
        }

        if (roomType == null) {
            throw new IllegalArgumentException("Room type cannot be null.");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public com.ccp.hotel.RoomType getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        if (!available) {
            throw new IllegalStateException("Room is already booked.");
        }
        available = false;
    }

    public void releaseRoom() {
        available = true;
    }
}