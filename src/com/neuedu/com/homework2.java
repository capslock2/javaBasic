package com.neuedu.com;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int score=input.nextInt();
        if (score>=90&&score<=100){
            System.out.println("A");
        }else if (score>=60&&score<90){
            System.out.println("B");
        }else if (score>=0&&score<60){
            System.out.println("C");
        }else{
            System.out.println("输入成绩无效，请确认后重新输入");
        }
    }
}
