package com.neuedu.June6_6;

public class SeaPizza extends Pizza implements Show{

        @Override
        public void show() {

            System.out.println("名称: "+getName()+"价格为："+getPrice()+"元"+"大小为："+getSize()+"寸");
        }
    }


