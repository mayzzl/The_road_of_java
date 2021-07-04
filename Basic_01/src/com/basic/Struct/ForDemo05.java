package com.basic.Struct;

public class ForDemo05 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4}; // 数组
        for (int x : numbers){
            System.out.println(x);
        }
        System.out.println("=============");

        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }
    }
}
