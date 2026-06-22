package com.lei.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 123123123123123L;
        int b =123;
        short c=10;
        byte d=8;
        System.out.println(a+b+c+d); //long 当参与运算的值由long类型那么结果就为long类型否则为Int类型。
        System.out.println(b+c+d);   //int
        System.out.println(c+d);//int
        System.out.println(d%c);//取余或者叫模运算
    }
}
