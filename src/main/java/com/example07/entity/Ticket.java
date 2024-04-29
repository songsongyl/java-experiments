package com.example07.entity;

public class Ticket {
    private int id;
    private String nameStart;
    private String nameEnd;

    public Ticket(int id, String nameStart, String nameEnd) {
        this.id = id;
        this.nameStart = nameStart;
        this.nameEnd = nameEnd;
    }

    public int getId() {
        return id;
    }

    public String getNameStart() {
        return nameStart;
    }

    public String getNameEnd() {
        return nameEnd;
    }
}
