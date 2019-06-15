package com.neuedu.M_29;

public class Chart {
    private int r;



    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }



    @Override
    public String toString() {
        return "圆的面积为："+Math.PI*r*r+"圆的周长为:"+2*Math.PI*r;
    }

}

