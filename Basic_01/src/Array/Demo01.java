package Array;

public class Demo01 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};
        // 打印
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        // 求和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println("sum=" + sum);
        // 最大值
        int max = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (max < arrays[i]){
                max = arrays[i];
            }
        }
        System.out.println("The max value is " + max);
    }
}
