package com.basic.Operator;

public class Demo02 {
    public static void main(String[] args) {
        int a = 10;
        // 先赋值，再自增，即放后面就是后加
        int b = a++;  // int b = a; a = a + 1;
        // 先自增，再赋值，放前面代表先加再赋值
        int c = ++a; //  a = a + 1; int b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        double d = Math.pow(2, 3);
        System.out.println(d);
    }
}
