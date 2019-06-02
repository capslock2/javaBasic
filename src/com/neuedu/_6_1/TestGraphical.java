package com.neuedu._6_1;

import java.util.Scanner;

public class TestGraphical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入半径");
        int radius = input.nextInt();
        Graphical graphical = new circular();
        ((circular) graphical).setRadius(radius);
        ((circular) graphical).Perimeter();
        ((circular) graphical).area();
        System.out.println("输入边长");
        int bianchang = input.nextInt();
        Graphical graphical1 = new Squer();
        ((Squer) graphical1).setBianchang(bianchang);
        ((Squer) graphical1).Perimeter();
        ((Squer) graphical1).area();
    }
}

