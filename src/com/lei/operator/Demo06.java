package com.lei.operator;

public class Demo06 {
    public static void main(String[] args) {
        //位运算
        /*
        A= 0011 1100
        B= 0000 1101
        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001 异或相同为0不相同为1
        ~B = 1111 0010

        <<左移 *2  >>右移 /2
        0000 0000 0
        0000 0000 1
        0000 0010 2
        0000 0011 3
        0000 0100 4
        0000 1000 8
        0001 0000 16
         */
        System.out.println(2<<3);
    }
}
