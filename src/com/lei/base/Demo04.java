package com.lei.base;

public class Demo04 {
    public static void main(String[] args) {
        int a=1,b=2,c=3; //不建议这样写
        int a1=1;
        int b1=2;
        int c1=3; //建议这样写(考虑程序可读性)
        String name = "denglei";  //String是JDK内置的类java.lang.String，遵循对象规则：栈上的String变量，只存堆内存中字符串对象的地址二进制编号，字符串真正的字符数据存在堆里，所以它是引用类型。
        char x = 'X';
        double pi = 3.14;
    }
}
