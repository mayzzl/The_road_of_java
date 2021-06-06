package Array;

public class Demo02 {
    public static void main(String[] args) {
        // for each 循环 取不出下标，即索引
        int[] arrays = {1, 2, 3, 4, 5};
        // arrays.for --> 相当于python的  for in
//        for (int array : arrays) {
//            System.out.println(array);
//        }
        // res = reverse(arrays); 错误写法
        int [] res = reverse(arrays);
        printArray(res);

    }
    //反转数组并输出，即返回数组类型的方法
    public static int[] reverse(int [] arrays){
        // 注意定义时的返回类型为 int[]，而不是int
        int [] result = new int [arrays.length];
        for (int i = 0, j = arrays.length - 1; i < arrays.length; i++, j--) {
            result[j] = arrays[i];
        }
        return result;
    }

    // 作为参数传入
    public static void printArray(int [] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

    }
}
