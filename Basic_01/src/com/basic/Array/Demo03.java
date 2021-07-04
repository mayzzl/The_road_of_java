package com.basic.Array;

public class Demo03 {
    public static void main(String[] args) {
        // 多维数组
        // 3*4
        int [][] arrays = {{1,2},{2,3},{3,4}};
        System.out.println(arrays[0]);  // [I@1b6d3586，输出是一个对象，是一个hashcode
        System.out.println(arrays[1]);  // [I@4554617c
        System.out.println(arrays[2]);  // [I@74a14482
    }
}