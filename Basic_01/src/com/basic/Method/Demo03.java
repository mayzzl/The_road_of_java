package com.basic.Method;

public class Demo03 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]：" + args[i]);
        }
    }
}
// 关于命令行传参，在文件夹打开，cmd运行：
// 1. javac filename 编译生成 filename.class
// 2. java com.com.basic.Method.Demo03   // 注意此时的路径为src下