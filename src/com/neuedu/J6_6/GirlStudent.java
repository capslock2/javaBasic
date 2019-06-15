package com.neuedu.J6_6;

public class GirlStudent extends Student implements Host {

        @Override
        public void host() {
            System.out.println("女士们，先生们，大家好，我是主持人......");
        }

        @Override
        public void eat() {
            System.out.println("我是女同学，我嗑瓜子，吃水果...");
        }
    }


