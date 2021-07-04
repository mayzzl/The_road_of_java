package com.basic.Method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();  // 快捷键 Alt + Enter
        demo04.test(1, 2, 4, 7, 9);


    }
    public void test (int ... i){
        System.out.println(i[0]);  // 1
        System.out.println(i[1]);  // 2
        System.out.println(i[2]);  // 4
        System.out.println(i[3]);  // 7
        System.out.println(i[4]);  // 9
    }
}
