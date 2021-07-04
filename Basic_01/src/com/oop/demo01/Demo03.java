package com.oop.demo01;

// .java --> .class
public class Demo03 {
    /*
    一个类即使什么也不写，它也会存在一个方法
    显式的定义构造器
    // 默认的构造器如下：
    public Demo03() {
        }
     */
    public static String name;
    public static int age;

    // 调出构造器定义的快捷键：alt+insert
    /*
    1. 使用new关键字，本质上就是调用构造器
    2. 用来初始化值
     */
    // 此为无参构造的显式定义
    public Demo03() {
        this.name = "levi";
    }

    // 有参构造
    // 一旦定义了有参构造，无参构造必须显式定义，即要要写出来
    // 1. 构造器必须和类名相同
    // 2。无返回值，也不能写void
    public Demo03(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/*
    public static void main(String[] args) {
//        Demo03 zz = new Demo03();
        Demo03 zz = new Demo03("levi", 14);
        System.out.println(zz.name);  // levi
    }

    1. 构造器必须和类名相同
    2。无返回值，也不能写void
 */