package com.neuedu.com;

public class homework1 {
    public static void main(String[] args) {
     for (int i=100;i<=999;i++){
int  a=i%10;
int  b=(i%100-a)/10;
int  c=i/100;
int  m=a*a*a+b*b*b+c*c*c;
    if (m==i){
        System.out.println(m);
    }
     }
        System.out.println("以上均为水仙花数");
    }
}
