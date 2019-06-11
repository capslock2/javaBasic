package com.neuedu.fuxi1;

import java.util.Scanner;

public class test001 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String string = input.next();
        char[] chars=string.toCharArray();
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<chars.length;i++){
            if (chars [i]>=65&&chars[i]<=90){
                count++;
            }else if (chars [i]>=97&&chars[i]<=122){
                count1++;
            }else if (chars [i]>=48&&chars[i]<=57){
                count2++;
            }
        }

    }
}
