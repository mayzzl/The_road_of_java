package com.oop.demo02;

public class Person {

    protected String name = "相麻堇";
    /*
    // default
    int house = 1; // 无法继承
    // public 可以继承
    public int money = 10000000;
//    public int money = 10_000_000;
    // private 无法继承
    private int cars = 2;
    // protected 无法继承
    protected int company = 3;
    public void say(){
        System.out.println("say hello");
    }

    private void bye(){
        System.out.println("say byebye");
    }
     */

    public Person() {
        System.out.println("Person Constructor no param");
    }

    public void print(){
        System.out.println("Person");
    }
}
