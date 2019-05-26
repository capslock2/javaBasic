package com.neuedu.com;

import java.util.Scanner;

public class homework7 {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("请输入英文字符");
            String    str=input.next();
            char a = str.charAt(0);
            if (str.length()>1){
                System.out.println("请输入一个字符");
            }else if (a>=97&&a<=122){
                a-=32;
                System.out.println(a);
            }else {
                System.out.println(str);
            }
        }
}
