package com.example.hw6;


public class Games {
    private String gameName;
    private int price;

    public Games() {
    }

    public Games(String gameName, int price) {
        this.gameName = gameName;
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
