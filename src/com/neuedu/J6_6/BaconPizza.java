package com.neuedu.J6_6;

public class BaconPizza extends Pizza {
    private int gramNum; //克数

    private int getGramNum() {
        return gramNum;
    }

    public void setGramNum(int gramNum) {
        this.gramNum = gramNum;
    }

    public BaconPizza() {
        super();
        System.out.println("名称: "+getName()+"价格为："+getPrice()+"元"+"大小为："+getSize()+"寸");
        
    }
}
