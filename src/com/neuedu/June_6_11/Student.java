package com.neuedu.June_6_11;

public class Student {
    private String name;

    private int age;

    private int score;

    private String classNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;

    }
    public Student(String name,int age,int score,String classNum){
        this.age=age;
        this.classNum=classNum;
        this.name=name;
        this.score=score;
    }
}

