package com.reflection;

public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Stutent();
        System.out.println("这个人是：" + person.name);

        // 第一种方式：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 第二种方式：forname获得
        Class c2 = Class.forName("com.reflection.Stutent");
        System.out.println(c2.hashCode());

        // 第三种方式：通过类名.class获得
        Class c3 = Stutent.class;
        System.out.println(c3.hashCode());

        // 方式四：基本内置类型的包装类都有一个TYPE属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        // 获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
    /*
    这个人是：学生
    1956725890
    1956725890
    1956725890
    int
    class com.reflection.Person
     */
}

class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Stutent extends Person{
    public Stutent(){
        super.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        super.name = "教师";
    }
}