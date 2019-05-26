package com.neuedu.com;
import java.util.Scanner;
public class homework9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a=input.nextInt();
        int b=0;
        while (a>0){
            b+=a%10;
            a=a/10;
        }
        if (b%9==0){
            System.out.println("能被9整除");
        }else {
            System.out.println("不能被9整除");
        }
    }

}
