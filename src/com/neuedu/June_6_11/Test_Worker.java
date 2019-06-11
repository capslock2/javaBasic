package com.neuedu.June_6_11;

import java.util.LinkedList;
import java.util.List;

public class Test_Worker {
    public static void main(String[] args) {
        List<Worker> list1 = new LinkedList<>();
        list1.add(new Worker("zhang3",18,3000));
        list1.add(new Worker("li4",25,3500));
        list1.add(new Worker("wang5",22,3200));
        list1.add(1,new Worker("zhao6",24,3300));
        ((LinkedList<Worker>) list1).remove(3);
        for (Worker a:list1
             ) {
            System.out.println(a);
        }
        for (int a=0; a < list1.size(); a++){
   list1.get(a).Work();
        }
    }
}
