package com.neuedu._6_1;

import java.util.Scanner;

public class Number {
    // 输入两个正整数m和n，求其最大公约数和最小公倍数。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a:");
        int a = scanner.nextInt();
        System.out.println("请输入b:");
        int b = scanner.nextInt();
        System.out.println("最大公约数：" + new Number().getGcd(a, b));
    }

    public int getGcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

