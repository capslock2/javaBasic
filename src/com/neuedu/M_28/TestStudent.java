package com.neuedu.M_28;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner inupt = new Scanner(System.in);

        System.out.println("请输入姓名");
        String str = inupt.next();
        System.out.println("请输入学号");
        int a = inupt.nextInt();
        System.out.println("请输入成绩一");
        int scour1 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int scour2 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int scour3 = inupt.nextInt();

        Student student1 = new Student();
        student1.setSname(str);
        student1.setSno(a);
        student1.setSachievement1(scour1);
        student1.setSachievement2(scour2);
        student1.setSachievement3(scour3);
        System.out.println(student1.toString());

        System.out.println("请输入姓名");
        String str1 = inupt.next();
        System.out.println("请输入学号");
        int a1 = inupt.nextInt();
        System.out.println("请输入成绩一");
        int scour11 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int scour21 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int scour31 = inupt.nextInt();

        Student student2 = new Student();
        student2.setSname(str1);
        student2.setSno(a1);
        student2.setSachievement1(scour11);
        student2.setSachievement2(scour21);
        student2.setSachievement3(scour31);
        System.out.println(student2.toString());

        System.out.println("请输入姓名");
        String str2 = inupt.next();
        System.out.println("请输入学号");
        int a2 = inupt.nextInt();
        System.out.println("请输入成绩一");
        int scour12 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int scour22 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int scour32 = inupt.nextInt();
        Student student3 = new Student();
        student3.setSname(str2);
        student3.setSno(a2);
        student3.setSachievement1(scour12);
        student3.setSachievement2(scour22);
        student3.setSachievement3(scour32);
        System.out.println(student3.toString());

        System.out.println("请输入姓名");
        String str3 = inupt.next();
        System.out.println("请输入学号");
        int a3 = inupt.nextInt();
        System.out.println("请输入成绩一");
        int scour13 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int scour23 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int scour33 = inupt.nextInt();
        Student student4 = new Student();
        student4.setSname(str3);
        student4.setSno(a3);
        student4.setSachievement1(scour13);
        student4.setSachievement2(scour23);
        student4.setSachievement3(scour33);
        System.out.println(student4.toString());

        System.out.println("请输入姓名");
        String str4 = inupt.next();
        System.out.println("请输入学号");
        int a4 = inupt.nextInt();
        System.out.println("请输入成绩一");
        int scour14 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int scour24 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int scour34 = inupt.nextInt();
        Student student5 = new Student();
        student5.setSname(str4);
        student5.setSno(a4);
        student5.setSachievement1(scour14);
        student5.setSachievement2(scour24);
        student5.setSachievement3(scour34);
        System.out.println(student5.toString());
    }
}

