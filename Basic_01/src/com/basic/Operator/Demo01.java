package com.basic.Operator;

public class Demo01 {
    public static void main(String[] args) {
        long a = 12324556;
        int b = 123;
        short c = 20;
        byte d = 8;

        // 如果多个变量中有一个为Double，那结果即为Double
        // 如果多个变量中有一个为long，那结果即为long
        // 如果没有long的时候，结果都为Int
        System.out.println(a + b + c + d);  // Long
        System.out.println(b + c + d);  // Int
        System.out.println(c + d);  // Int
    }
}
