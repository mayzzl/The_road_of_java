package com.oop.demo05;

// interface关键字修饰
public interface UserService {

    public static final int levi = 0;

    // 接口中所有的定义其实都是抽象的 public abstract
    public abstract void add(String name);
    // 可以直接写成下面形式
//    void add();
    void delete(String name);
    void update(String name);
    void query(String name);


}
