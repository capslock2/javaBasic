package com.neuedu.June_6_11;

import java.util.ArrayList;
import java.util.List;

public class Test_Student {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("Tom", 18, 100, "class05"));

        list.add(new Student("Jerry", 22, 70, "class04"));

        list.add(new Student("Owen", 25, 90, "class05"));

        list.add(new Student("Jim", 30, 80, "class05"));

        list.add(new Student("Steve", 28, 66, "class06"));

        list.add(new Student("Kevin", 24, 100, "class04"));

        int b = 0;
        for (int a = 0; a < list.size(); a++) {
            b += list.get(a).getAge();
        }
        System.out.println(b / list.size());
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);

            if (student.getClassNum() == "class04") {//此处也可以用list.get(i).getclassNum()
                t1++;
                score1 += student.getScore();
            } else if (student.getClassNum() == "class05") {
                t2++;
                score2 += student.getScore();
            } else if (student.getClassNum() == "class06") {
                t3++;
                score3 += student.getScore();
            }
        }

        System.out.println("class04班级的平均分数：" + score1 / t1);
        System.out.println("class05班级的平均分数：" + score2 / t2);
        System.out.println("class06班级的平均分数：" + score3 / t3);
    }
}
