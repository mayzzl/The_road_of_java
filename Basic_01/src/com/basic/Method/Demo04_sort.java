package com.basic.Method;

public class Demo04_sort {
    public static void main(String[] args) {
        printMax(1, 2, 7, 4, 19, 6);
        printMax(new double[]{1, 6 ,98, 6757, 889});
    }

    public static void printMax(double ... numbers){
        if (numbers.length == 0){
            System.out.println("No Numbers");
            return;
        }
        double res = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > res){
                res = numbers[i];
            }
        }
        System.out.println("The max value is :" + res);
    }
}
