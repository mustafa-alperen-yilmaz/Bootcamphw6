package com.example.hw6;

public class Menus {
    private String menuName;
    private int img;

    public Menus() {
    }

    public Menus(String menuName, int img) {
        this.menuName = menuName;
        this.img = img;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
