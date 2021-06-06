package Base;

public class Demo04 {
    public static void main(String[] args) {
        // 整数拓展
        int i = 10;
        int i_a = 010;  // 八进制0开头，1*8+0*8=8 octal：八进制
        int i_b = 0x10; // 十六进制0x开头

        System.out.println(i);
        System.out.println(i_a);
        System.out.println(i_b);

        // 浮点数拓展 注：银行业务用什么类型表示钱
        // BigDecimal 数学工具类
        // float 有限 离散 舍入误差 大约 接近但不等于
        // double
        // *** 最好完全使用浮点数进行比较

        float a = 0.1f;
        double b = 1.0 / 10;
        System.out.println(a == b); // false

        float d1 = 32682364276482f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2); // true

        // 字符拓展
        char c1 = 'a';
        char c2 = '雷';
        System.out.println(c1);
        // 强制换行
        System.out.println((int) c1); // 注意此处的括号是括的int
        System.out.println(c2);
        System.out.println((int) c2);

        // 所有的字符本质上还是数字
        // 编码 Unicode 97=a 65=A
        char c3 = '\u0061';
        System.out.println(c3); // a

        //转义字符
        // \t \n 制表符 换行符
        System.out.println("hello\tworld");
        System.out.println("hello\nworld");

        String s_a = new String("hello world");
        String s_b = new String("hello world");
        // 注：此处的original不需要手动输入，直接输入变量值就好
        String s_c = new String("hhahaahahah");
        System.out.println(s_a == s_b); // false

        String s_e = "hello world";
        String s_f = "hello world";
        System.out.println(s_e == s_f); // true
        // 对象 从内存分析

        // 布尔值拓展
        boolean flag = true;
        if (flag) {
            System.out.println("ha");
        } // 老手
        if (flag==true){
            System.out.println("haha");
        } // 新手
        // Less is More！
    }
}