package com.example07;

import com.example07.entity.TicketOffice;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        TicketOffice ticketOffice1 = new TicketOffice("哈尔滨西站");
        TicketOffice ticketOffice2 = new TicketOffice("哈尔滨站");
        TicketOffice ticketOffice3 = new TicketOffice("哈尔滨东站");
        int count =600;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0;i < 600 / 3; i++){
            new Thread(()->{
                ticketOffice1.sell();
                countDownLatch.countDown();
            }).start();
        }
        for (int i = 0;i < 600 / 3; i++){
            new Thread(()->{
                ticketOffice2.sell();
                countDownLatch.countDown();
            }).start();
        }
        for (int i = 0;i < 600 / 3; i++){
            new Thread(()->{
                ticketOffice3.sell();
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println(ticketOffice1.getName() + " " + ticketOffice1.getCount());
        System.out.println(ticketOffice2.getName() + " " + ticketOffice2.getCount());
        System.out.println(ticketOffice3.getName() + " " + ticketOffice3.getCount());
        int sum = ticketOffice1.getCount() + ticketOffice2.getCount() + ticketOffice3.getCount();
        System.out.println("票的总数");
        System.out.println(sum);
    }

}
