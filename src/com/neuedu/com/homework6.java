package com.neuedu.com;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个年份");
        int  N=input.nextInt();
        if (N<=0){
            System.out.println("输入无效，请重新输入");
        }else if (N%4==0){
            System.out.println(N+"这个年份是闰年");
        } else {
            System.out.println(N+"这个年份是平年");
        }
         {
        }
    }

}
