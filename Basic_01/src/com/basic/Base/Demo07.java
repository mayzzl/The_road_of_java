package com.basic.Base;

public class Demo07 {
    // 常量
    // Java中，修饰符不区分先后顺序
    // final static double PI = 3.14;
    static final double PI = 3.14;

    // 类变量 static
    static double salary = 2500;
    // 属性：变量

    // 实例变量：从属于对象，如果不初始化，会有默认值 0 0.0
    // 布尔值：默认为false
    // 除了基本类型，其余的默认值都是null
    String name;
    int age;

    // main方法
    public static void main(String[] args) {
        System.out.println(PI);

        // 局部变量：必须声明和初始化
        int i = 10;
        System.out.println(i);

        // 变量类型  变量名 = new com.com.basic.Base.Demo07
        Demo07 demo = new Demo07();
        System.out.println(demo.name);
        System.out.println(demo.age);

        // 类变量
        System.out.println(salary);
    }
    public void haha(){

    }
}
