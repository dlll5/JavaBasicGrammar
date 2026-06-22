package com.lei.operator;

public class Demo04 {
    public static void main(String[] args) {
        //++自增 --自减  一元运算符
        int a = 3;
        int b = a++; //a=a+1,先赋值后运算
        int c = ++a;  //先运算后赋值
        System.out.println(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c);

        //幂运算 java里会使用一些工具类来操作
        double pow = Math.pow(2,3);
        System.out.println(pow);
    }
}
