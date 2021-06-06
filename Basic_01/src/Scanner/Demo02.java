package Scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextline方式接收：");

        // next接收空格之前的所有输入
        // nextline接收回车之前的所有输入
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出：" + str);
        }

        scanner.close();
    }
}
