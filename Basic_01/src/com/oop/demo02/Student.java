package com.oop.demo02;

public class Student extends Person{
    /*
    Ctrl + H 可以调出继承关系
     */
    private String name = "Rebone";

    public Student() {
        // 隐藏代码：调用父类的无参构造
        /*
        当父类定义了有参构造时
        子类调用时需显式定义，即
        super(param),调用父类的有参
         */
        super(); // 父类的构造方法，且只能在第一行
//        this(); // 只能使用一个，因为它只能放在第一行
        System.out.println("Student Constructor no param");
    }

    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
