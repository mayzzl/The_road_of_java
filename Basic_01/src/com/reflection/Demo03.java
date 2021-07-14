package com.reflection;

import java.lang.annotation.ElementType;

public class Demo03 {
    // 所有类型的class
    public static void main(String[] args) {
        // Alt键可以复制多行，即按alt可以直接选中c1-c9
        Class c1 = Object.class;  // 类
        Class c2 = Comparable.class;  // 接口
        Class c3 = String [].class;  // 一维数组
        Class c4 = int [][].class;  // 二维数组
        Class c5 = Override.class;  // 注解
        Class c6 = ElementType.class;  // 枚举
        Class c7 = Integer.class;  // 基本数据类型
        Class c8 = void.class;  // void
        Class c9 = Class.class;  // class

        // 粘贴也可以 alt选中竖列
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        /*
        class java.lang.Object
        interface java.lang.Comparable
        class [Ljava.lang.String;
        class [[I
        interface java.lang.Override
        class java.lang.annotation.ElementType
        class java.lang.Integer
        void
        class java.lang.Class
         */

        // 只要元素类型与维度一样，就是同一个Class
        int [] a = new int [10];
        int [] b = new int [100];

        System.out.println(a.getClass().hashCode()); // 1956725890
        System.out.println(b.getClass().hashCode()); // 1956725890


    }
}
