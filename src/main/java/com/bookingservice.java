package com.

class BookingService {

    public void book(com.ccp.hotel.Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room not found");
        }
        room.bookRoom();
    }
}{
}
