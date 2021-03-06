package com.basic.Struct;

public class ForDemo01 {
    public static void main(String[] args) {
        // 100.for可用于快速生成一个for循环结构
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        /*
        关于for循环的几点说明：
        最先执行初始化步骤，可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句
        然后，检测布尔表达式的值，若为true，循环体被执行，否则，循环终止，开始执行循环体后面的语句
        执行一次循环后，更新循环控制变量（迭代因子控制循环变量的增减）
        再次检测布尔表达式，循环执行上面的过程
        i=0(只执行一次) --> i<100 --> {循环体} --> i++ --> i<100 --> {循环体} --> i<100 --> ...
         */
        //死循环
        for ( ; ; ){

        }
    }
}
