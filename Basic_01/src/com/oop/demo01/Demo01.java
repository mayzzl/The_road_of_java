package com.oop.demo01;

public class Demo01 {
    // static修饰的为静态方法，可以通过类名.方法调用
    public static void main(String[] args) {
        /*
            非静态方法则不能
         */
//        Student.say();
        // 非静态方法需要先实例化
        Student student = new Student();
        student.say();
    }

    /*
    // 非静态方法可以直接调用
    public void a(){
        b();
    }
    public void b(){

    }
     */

    /*
    // 静态方法不能直接调用非静态方法
    // 静态方法是和类一起加载的
    public static void a(){
        b();
    }
    // 类实例化之后才存在
    public void b(){
    }
     */

    /*
    // 静态方法间可以直接调用
    public static void a(){
        b();
    }
    public static void b(){

    }
    */
}
