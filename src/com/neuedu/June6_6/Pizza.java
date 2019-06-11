package com.neuedu.June6_6;

public class Pizza {
    private int size;
    private int price;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Pizza() {
        super();
    }
    public Pizza(int size,int price,String name){
        super();
        this.size=size;
        this.price=price;
        this.name=name;

    }

}
