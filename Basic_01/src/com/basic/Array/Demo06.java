package com.basic.Array;
// P59

/*
  该练习使用了太多的for循环，需要改进优化！！！
 */
public class Demo06 {
    public static void main(String[] args) {
        // 稀疏数组
        // 数组11*11， 无棋子：0，黑棋：1，白棋：2
        int[][] hit = new int[11][11];
        hit[1][2] = 1;
        hit[2][3] = 2;
        // 输出原始数组
        System.out.println("原始数组为：");

        for (int[] ints : hit) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("==================");
        int cnt = getValue(hit);
        System.out.println("有效值的个数为：" + cnt);
        System.out.println("稀疏矩阵为：");
        int[][] spare_array = sparseArray(cnt, hit);
        for (int i = 0; i < spare_array.length; i++) {
                System.out.println(spare_array[i][0] + "\t" +
                        spare_array[i][1] + "\t" +
                        spare_array[i][2]);
        }
        System.out.println("==================");
        int[][] notSpareArray = new int [spare_array[0][0]][spare_array[0][1]];
        for (int i = 1; i < spare_array.length; i++) {
                notSpareArray[spare_array[i][0]][spare_array[i][1]] = spare_array[i][2];
        }
        for (int[] ints : notSpareArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static int getValue(int[][] arrays){
         /*
        1. 判断数组的有效值个数
         */
        int cnt = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                if (arrays[i][j] != 0){
                    cnt ++;
                }
            }
        }
        return cnt;
    }

    public static int[][] sparseArray(int cnt, int[][] arrays){
        // 稀疏数组的size
        int[][] spare_array = new int[cnt + 1][3];
        spare_array[0][0] = arrays.length;
        spare_array[0][1] = arrays[0].length;
        spare_array[0][2] = cnt;
        int num = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                if (arrays[i][j] != 0){
                    num ++;
                    spare_array[num][0] = i;
                    spare_array[num][1] = j;
                    spare_array[num][2] = arrays[i][j];
                }
            }
        }
        return spare_array;
    }

    public static int[] bubbleSort(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
        return a;
    }
}
