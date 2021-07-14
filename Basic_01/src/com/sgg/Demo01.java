package com.sgg;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int positiveNum = 0;
        int negativeNum = 0;

        while (true){
            int num = scanner.nextInt();
            if (num > 0){
                positiveNum ++;
            }else if (num < 0){
                negativeNum ++;
            }else {
                break;
            }
        }

        System.out.println(positiveNum);
        System.out.println(negativeNum);
    }
}
