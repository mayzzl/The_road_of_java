package com.basic.Method;

public class Demo01 {
    // main方法 void代表没有返回值
    // static的实例在Base.Demo07
    public static void main(String[] args) {
        int sum = add(1, 2);
        System.out.println(sum);
    }
    // 加法
    public static int add(int a, int b){
        return a + b;
    }
}
