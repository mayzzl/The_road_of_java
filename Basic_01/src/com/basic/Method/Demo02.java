package com.basic.Method;
// P46
public class Demo02 {

    // 注意：Java都是值传递，不是引用传递！！！

    public static void main(String[] args) {
        int res = max(20, 20);
        System.out.println(res);
    }
    public static int max(int a, int b){
        int res = a;
        if (res < b){
            res = b;
        }
        return res;
    }
}
