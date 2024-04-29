package com.example07.entity;
import java.util.LinkedList;
import java.util.List;

public class Railways {
   private static List<Ticket> tickets = create();
   private static List<Ticket> create(){
       List<Ticket> ticketList = new LinkedList<>();
       for(int i = 0; i < 200;i++){
           ticketList.add(new Ticket(i+1,"哈尔滨","北京"));
       }
       return ticketList;
   }
   public static synchronized Ticket getTicket(){
       Ticket ticket = null;
       if(!tickets.isEmpty()){
           ticket = tickets.remove(0);
       }
       return ticket;
   }

}
