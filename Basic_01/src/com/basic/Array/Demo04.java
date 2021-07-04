package com.basic.Array;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        int[] a = {1344, 5, 67, 3, 5353, 76, 234, 64567, 64};
        System.out.println(a);  // hashcode:[I@1b6d3586
        // 打印数组元素
        System.out.println(Arrays.toString(a));
        // 排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // 二分查找，返回索引值
        System.out.println(Arrays.binarySearch(a, 76));
        // fill方法，相当于python的zeros、ones
        Arrays.fill(a, 7);
        System.out.println(Arrays.toString(a));  // [7, 7, 7, 7, 7, 7, 7, 7, 7]
    }
}
