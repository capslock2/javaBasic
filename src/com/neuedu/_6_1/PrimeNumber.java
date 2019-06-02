package com.neuedu._6_1;

public class PrimeNumber {
    //判断101-200之间有多少个素数，并输出所有素数。
    static int num = 0;

    public static void PrimeNumber() {
        for (int i = 101; i <= 200; i++) {
            if (i % i == 0 && i / 1 == i && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 != 0) {
                num++;
                System.out.println(i);
            }
        }
        System.out.println("一共有：" + num + "个素数");
    }
}

