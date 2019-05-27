package com.neuedu.b;

public class a2 {
//定义圆类，它有一个变量(半径)。从键盘输入数据，将半径传递给radius，编程计算并输出圆的周长和面积（确保输入的数据不为负数）。
//并对其进行测试
    int radius;
    public void b(int b){
        double pai=3.1415926;
    if (b>0){
    radius=b;
}else{
        System.out.println("请重新输入");
    }
        System.out.println("圆的面积"+pai*radius*radius);
        System.out.println("圆的周长"+2*pai*radius);

    }
}
