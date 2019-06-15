package com.neuedu.M_28;

public class a {

        int x;
        int y;

        public a(){

        }

        public a(int x,int y){
            this.x=x;
            this.y=y;
        }

        public void movePoint(int dx,int dy){
            x=dx;
            y=dy;
            System.out.println("移动之后的位置：（"+x+"，"+y+"）");
        }


    }


