package com.neuedu.b;

public class a1 {
    //1 定义长方形类，含：
    //  特征：宽、高（整型）；
    //  方法：求周长、面积；
    //  方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；（3）2个参数——宽、高各为参数值。
    //并对其进行测试
    public void a() {
        int height = 1;
        int width = 1;
        System.out.println("它的面积是：" + (height * width));
        System.out.println("它的周长是：" + (height + width) * 2);
    }

    public void b(long a) {
        long height = a;
        long width = a;
        System.out.println("它的面积是：" + (height * width));
        System.out.println("它的周长是：" + (height + width) * 2);
    }
    public void c(long a ,long b) {
        long height = a;
        long width = b;
        System.out.println("它的面积是：" + (height * width));
        System.out.println("它的周长是：" + (height + width) * 2);
    }

}