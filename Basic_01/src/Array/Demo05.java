package Array;

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        int a[] = {234, 56, 2, 76, 123, 6};
        // bubbleSort(a); Alt + Enter 快速定义变量
        int[] res = bubbleSort(a);
        System.out.println(Arrays.toString(res));

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
