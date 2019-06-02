package com.neuedu.May5_29;

public class People extends Monkey{
    private People(String s){
        super(s);
    }
    public void think(){
        System.out.println("别说话！认真思考！");
    }
    public void speak(){
        System.out.println("小样的，不错嘛！会说话了！");
    }
}
