package com.oop.demo01;
// 引用传递：对象，本质上还是值传递
public class Demo02 {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);  // null

        Demo02.change(person);

        System.out.println(person.name);  // 相麻堇
    }

    public static void change(Person person) {
        person.name = "相麻堇";
    }
}

class Person {
    String name; //null
}
