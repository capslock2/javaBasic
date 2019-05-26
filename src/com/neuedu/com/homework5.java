package com.neuedu.com;

import java.util.Scanner;

public class homework5 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个五位数");
        int p=input.nextInt();

        int a=p%10;//个位上的数
        int b=(p%100-a)/10;//十位上的数
        int c=(p/100)%10;//百位
        int  m=(p/1000)%10;//千位
        int  n=p/10000;//万位
        if (p<10000||p>99999){
            System.out.println("输入错误");
        } else if (a==n&&b==m) {
            System.out.println("这是一个回文数，回文数为："+p);
        }else{
            System.out.println("这不是一个回文数");
        }

    }


}
