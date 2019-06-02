package com.neuedu._6_1;

public class GhostValleyConjecture {
    //验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是
    //
    //偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，一直进
    //
    //行下去，最终必然得到 1。
    private int num;

    public int getNnum() {
        return num;
    }

    public void setNnum(int num) {
        this.num = num;
    }

    public void guigu() {
        while (num != 1) {
            if (num % 2 == 0) {
                //偶数
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            System.out.println("产生的新数是" + num);
        }
        System.out.println("验证鬼谷猜想");
    }
}

