package com.lei.base;

public class Demo02 {
    public static void main(String[] args) {
        //整数拓展： 二进制0b  十进制  八进制0    十六进制0x
        int i = 10;
        int i_2 = 010;
        int i_3 = 0x10;

        System.out.println(i);
        System.out.println(i_2);
        System.out.println(i_3);
        System.out.println("================================================");

        //浮点数拓展  float:有限，离散，舍入误差，大约，接近但不等于，所以最好完全避免使用浮点数去比较
        //BigDecimal 数学工具类
        float d1 = 0.1f; //0.1
        double d2 = 1.0/10; //0.1
        System.out.println(d1==d2); //flase
        float d3 = 231313123123123113f;
        float d4 = d3+1;
        System.out.println(d3==d4); // ture
        System.out.println("================================================");

        //字符拓展
        char c1 ='a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1);  //强制转换
        System.out.println(c2);
        System.out.println((int)c2); //强制转换
        //所有的字符本质还是数字
        //编码 Unicode 2字节 65536
        //U0000 UFFFF
        char c3 = '\u0061';
        System.out.println(c3);//a

        //转义字符
        // \t  制表符
        // \n 换行
        System.out.println("Hello\nWorld!");

        //布尔值拓展
        boolean flag = true;
        if (flag==true){
            System.out.println("Hello World");
        }

    }
}
