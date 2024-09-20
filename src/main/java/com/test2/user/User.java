package com.test2.user;

import java.util.UUID;

public class User {

    private String name;
    private UUID id;

    private int coins;

    public User(String name, int coins) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.coins = coins;
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

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
