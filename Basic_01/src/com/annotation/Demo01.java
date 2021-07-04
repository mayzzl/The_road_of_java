package com.annotation;

import java.util.ArrayList;
import java.util.List;

public class Demo01 extends Object{
    @Override   // 重写的注解
    public String toString(){
        return super.toString();
    }

    @Deprecated   // 不建议使用，使用时会提示横线
    public static void test(){
        System.out.println("Depercated");
    }

    @SuppressWarnings("all")   // 对比下有该注解和注释掉该注解的区别，取消警告
    public void test02(){
        List list = new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }

}
