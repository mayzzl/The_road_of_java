package com.basic.Base;

public class Demo05 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i; // 内存溢出
        // 强制转换  （类型）变量名   高 ->低
        double d = i;  // 自动转换，
        // 自动转换  低 -> 高
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);

        System.out.println("=======================");
        char c = 'a';
        int cc = c + 1;
        System.out.println(cc);
        System.out.println((char)cc);

    }
}
