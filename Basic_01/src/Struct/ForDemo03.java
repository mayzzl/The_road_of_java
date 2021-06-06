package Struct;

public class ForDemo03 {
    public static void main(String[] args) {
        // 用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个
        for (int i = 1; i <= 1000; i++) {
            if ( i % 5 == 0){
                System.out.print(i + "\t");
            }
            if (i % (5 * 3) == 0){
                System.out.print("\n");
//                System.out.println();  // 也可以实现换行
            }
        }
        // println 输出完会换行
        // print 输出完不会换行
    }
}
