package com.neuedu.May5_29;

import java.util.Scanner;

public class testchart {
    public static void main(String[] args) {
        Chart circle=new Chart();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入圆的半径");
        int r=input.nextInt();
        circle.setR(r);
        System.out.println(circle.toString());

        Square square1=new Square();
        System.out.println("请输入正方形的边长");
        int  width=input.nextInt();
        square1.Square(width);
    }
}
