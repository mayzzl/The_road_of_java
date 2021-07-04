package com.basic.Scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // Alt + Enter快速生成前面的变量
        // 创建一个扫描器对象，用于接收键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");

        // 判读用户有没有输入字符串
        if (scanner.hasNext()){
            // 使用next方式接收
            String str = scanner.next();  // 程序会等待用户输入完毕
            System.out.println("输出的内容为：" + str);
        }

        scanner.close();

    }
}
