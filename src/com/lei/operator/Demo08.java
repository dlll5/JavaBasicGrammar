package com.lei.operator;

public class Demo08 {
    public static void main(String[] args) {
        //三元运算符
        //x ? y : z  如果x==true,z则结果围为y,否则结果为z
        int score = 80;
        String type = score <60 ? "不及格":"及格";
        System.out.println(type);
    }
}
