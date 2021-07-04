package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Demo02 {
    @MyAnnotation("levi")
    public void test(){}

    /**
     * 传参的时候需要写参数名，但只有一个参数且当参数名为value的时候，可以省略参数名
     */
    @MyAnnotation2(age = 18)
    public void test02(){};

}

// 如果只有一个参数名，可以直接写成value，到时传参的时候可以直接写
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    // 参数命名规范 数据类型 + 参数名 + ()
    String value();
}

// 如果只有一个参数名，可以直接写成value，到时传参的时候可以直接写
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    // 参数命名规范 数据类型 + 参数名 + ()
    String name() default "";  // 默认值，传参的时候可以不写
    int age();
    int id() default -1;  // 如果默认值为-1，代表它不存在，和indexof一样，无值返回-1
}
