package com.lei.base;

public class Demo05 {
    //类变量从属于类 static
    static double salary = 5000;

    //实例变量：从属于对象；如果不自行初始化，则为这个类型的默认值0 0.0；布尔值默认是false；除了基本类型，其余的默认值都是null。
    String name;
    int age;
    //main 方法
    public static void main(String[] args) {
        //局部变量；必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //实例变量，必须先创建对象
        Demo05 x1 = new Demo05();
        System.out.println(x1.age);
        System.out.println(x1.name);

        //类变量 static
        System.out.println(salary);
    }

    //普通的成员方法，它定义了对象能做什么，比如计算加法，但必须等对象创建后才能调用，不能用来启动程序
    public void add(){
    }
}


