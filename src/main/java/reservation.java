public class reservation package com;


class Reservation {
    private final com.ccp.hotel.Customer customer;
    private com.ccp.hotel.Room room;

    public Reservation(com.ccp.hotel.Customer customer, com.ccp.hotel.Room room) {
        this.customer = customer;
        this.room = room;
    }

    public com.ccp.hotel.Customer getCustomer() {

        return customer;
    }

    public com.ccp.hotel.Room getRoom() {
        return room;
    }
}{
}


