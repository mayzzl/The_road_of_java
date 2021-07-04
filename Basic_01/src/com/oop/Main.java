package com.oop;

import com.oop.demo01.Demo03;
import com.oop.demo03.Student;
import com.oop.demo03.Person;

import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
/*
        // 一个对象的实际类型是确定的
//        new Person();
//        new Student();

        // 可以指向的引用类型就不确定了
        Student s1 = new Student();  // Student能调用的方法都是自己的或者继承父类的
        // 父类的引用指向子类
        Person s2 = new Student();  // Person 父类，可以指向子类，但不能调用子类独有的方法
        Object s3 = new Student();


        // 对象能执行那些方法，主要看对象的左边的类型，和右边关系不大
        s1.run(); // student run
        // 子类重写了父类的方法，执行子类的方法
        s2.run(); // student run
//        s3.run(); // 此处调用时错误的

        s1.eat();
        ((Student) s2).eat();  // 强制类型转换
//        s2.eat();  // 报错
        */

//        student.test1();
//        student.test("一平");
//        System.out.println(student.money);
//        student.say();
//        student.bye();  // 无法继承
    }
}

/*
  多态注意事项：
  1.多态时方法的多态，属性没有多态
  2.不能重写的方法：
    1. static 静态方法，属于类，不属于实例
    2. final 常量
    3. private方法 私有
 */