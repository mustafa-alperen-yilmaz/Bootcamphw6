package com.example.hw6;


public class Games {
    private String gameName;
    private int price;
    private int image;

    public Games() {
    }

    public Games(String gameName, int price, int image) {
        this.gameName = gameName;
        this.price = price;
        this.image = image;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
