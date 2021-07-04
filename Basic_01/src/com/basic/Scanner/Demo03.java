package com.basic.Scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        // 输入多个数，计算其和、平均值，通过输入非数字结束
        double sum = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            sum = sum + x;
            num = num + 1; // num ++
        }
        System.out.println(num + "个数的和为：" + sum);
        System.out.println(num + "个数的平均值为：" + (sum / num));

        scanner.close();
    }
}
