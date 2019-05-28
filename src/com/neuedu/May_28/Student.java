package com.neuedu.May_28;

public class Student {
    //1 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），
    // 计算出平均成绩
    private String  sname;
    private int  sno;
    private int  sachievement1;
    private int  sachievement2;
    private int  sachievement3;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getSachievement1() {
        return sachievement1;
    }

    public void setSachievement1(int sachievement1) {
        this.sachievement1 = sachievement1;
    }

    public int getSachievement2() {
        return sachievement2;
    }

    public void setSachievement2(int sachievement2) {
        this.sachievement2 = sachievement2;
    }

    public int getSachievement3() {
        return sachievement3;
    }

    public void setSachievement3(int sachievement3) {
        this.sachievement3 = sachievement3;
    }

    @Override
    public String toString() {
        return "姓名为："+getSname()+"  "+"学号为"+getSno()+"  "+"成绩1为"+getSachievement1()+"  "+"成绩2为"+getSachievement2()+"  "+"成绩3为"+getSachievement3()+"  "+"平均成绩为："+(getSachievement1()+getSachievement2()+getSachievement3())/3;
    }
}
