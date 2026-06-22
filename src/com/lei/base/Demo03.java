package com.lei.base;

public class Demo03 {
    public static void main(String[] args) {
        int i=128;
        byte b = (byte)i;  //内存溢出
        double h = i; //由低转高
        //强制转换 从高到低
        //自动转换 从低到高
        //优先级为byte,short,char ->int ->long ->float ->double
        /*
        注意点
        1. 不能对布尔值进行转换
        2. 不能把对象类型转换为不相干的类型
        3. 在把高容量转换到低容量的时候，强制转换
        4.转换的时候可能存在内存溢出，或者精度问题
         */
        System.out.println("==========================");
        System.out.println((int)23.7); //23
        System.out.println((int)-45.89f); //-45
        System.out.println("===========================");
        char c = 'a';
        int d = c+1;
        System.out.println(d);
        System.out.println((char)d);

        System.out.println("===========================");
        int money = 10_0000_0000;
        int years = 20;
        int total = money*years; // 计算的时候溢出了
        long total2 = money*years; //转换之前就已经存在问题
        long total3 = money*((long)years); //先把一个数转换为Long
        long total4 = (long)money*years;
        long total5 = (long)money*(long)years;
        System.out.println(total3);
        System.out.println(total4);
        System.out.println(total5);
    }
}
