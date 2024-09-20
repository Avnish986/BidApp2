package com.test2.event;

import com.test2.bid.Bid;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.UUID;

public class Event {
    String name;
    UUID id;
    LocalDate date;
    String prize;
    HashSet<UUID> participants;
    Bid winner;
    boolean isActive;

    public Event( LocalDate date, String prize, String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.date = date;
        this.prize = prize;
        this.participants = new HashSet<>();
        this.isActive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public HashSet<UUID> getParticipants() {
        return participants;
    }

    public void setParticipants(HashSet<UUID> participants) {
        this.participants = participants;
    }

    public Bid getWinner() {
        return winner;
    }

    public void setWinner(Bid winner) {
        this.winner = winner;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
