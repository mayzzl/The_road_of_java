package com.basic.Operator;

public class Demo05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a += b;  // a = a + b
        a -= b;  // a = a - b

        System.out.println(a);

        // 字符串连接符  + ， String
        // 当+号左边为字符串类型时，它会把右边的元素全变为字符串连接起来
        System.out.println("" + a + b);  // 1020
        System.out.println(a + b + "");  // 30

        // 三元运算符
        // x ? y : z
        // 如果x为真则结果为y，否则为z
        int score = 80;
        String type = score < 60 ? "不及格" : "及格";
        System.out.println(type);
    }
}
