package com.example07.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TicketOffice {
    private String name;
    private List<Ticket> ticketList = new LinkedList<>();
    private static Random random = new Random();
    public TicketOffice(String name) {
        this.name = name;
    }
    public synchronized Ticket sell(){
        Ticket ticket = null;
        try {
            Thread.sleep(random.nextInt(50));
            ticket = Railways.getTicket();
            if(ticket != null){
                ticketList.add(ticket);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return ticket;
    }
    public int getCount(){
        return ticketList.size();
    }

    public String getName() {
        return name;
    }
}
