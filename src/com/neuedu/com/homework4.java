package com.neuedu.com;

public class homework4 {
    public static void main(String[] args) {
        int t=0;
        System.out.println("可以组合的数分别为");
        for (int a=1;a<=4;a++){
            for (int b=1;b<=4;b++){
                for (int c=1;c<=4;c++){
                    if (a!=b&&a!=c&&b!=c){
                        t+=1;
                        System.out.println((a*100+b*10+c));
                    }
                }
            }

        }
        System.out.println("一共有"+t+"个可以组合的数");
    }
    }

