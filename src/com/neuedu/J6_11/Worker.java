package com.neuedu.J6_11;


public class Worker {

    private String name;
    private int age;
    private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Worker(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
public void Work(){}

    @Override
    public String toString() {
        return "Worker{" +
                "名字='" + name + '\'' +
                ", 年龄=" + age +
                ", 工资=" + salary +
                '}';
    }
}
