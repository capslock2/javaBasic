package com.neuedu.May5_29;

public class spuare {
    private  int width;
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;

    }
    public void Square(int width){
        this.width =width;
        System.out.println("正方形的面积为："+width*width+"正方形的周长为:"+4*width);

    }
}
