package com.neuedu._6_1;

public class circular extends Graphical {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void Perimeter() {
        System.out.println("圆的周长为：" + 2 * Math.PI * radius);
    }

    @Override
    public void area() {
        System.out.println("圆的面积为：" + Math.PI * radius * radius);
    }
}

