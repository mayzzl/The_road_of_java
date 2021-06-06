package Struct;

public class ForDemo02 {
    // 计算0~100之间的奇数和偶数的和
    public static void main(String[] args) {
        int oddSum = 0; // 奇数  注意java变量的写法：首字母小写+驼峰
        int evenSum = 0;  // 偶数
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                evenSum += i;
            }
            else {
                oddSum += i;
            }
        }
        if (oddSum + evenSum == 5050){
            System.out.println("True");
        }
    }
}
