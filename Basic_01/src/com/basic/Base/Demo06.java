package com.basic.Base;

public class Demo06 {
    public static void main(String[] args) {
        // 操作比较大的数值，需要注意溢出问题
        // JDK7新特性，数字之间可用_分割
        int i = 10_0000_0000;  // 1000000000 下划线不输出
        System.out.println(i);
        int j = 20;
        int k = i * j;
        System.out.println(k);  // -1474836480 计算时出现溢出
        long m = i * j;
        System.out.println(m);  // -1474836480 默认是int，转换之前已经存在问题了
        long n = i * (long)j;   // 先把一个转为long类型
        System.out.println(n);  // 20000000000

    }
}
