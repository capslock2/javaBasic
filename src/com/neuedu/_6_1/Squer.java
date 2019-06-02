package com.neuedu._6_1;

public class Squer extends Graphical {
    private int bianchang;

    public int getBianchang() {
        return bianchang;
    }

    public void setBianchang(int bianchang) {
        this.bianchang = bianchang;
    }

    @Override
    public void Perimeter() {
        System.out.println("正方形的周长为：" + 4 * bianchang);
    }

    @Override
    public void area() {
        System.out.println("正方形的周长为：" + bianchang * bianchang);
    }
}
