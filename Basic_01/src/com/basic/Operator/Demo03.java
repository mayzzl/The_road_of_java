package com.basic.Operator;

 /*
    逻辑运算符：与&& 非！或||
 */
public class Demo03 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        System.out.println("a && b: " +(a && b));  // 同真为真
        System.out.println("a || b: " +(a || b));  // 有真即为真
        System.out.println("! (a && b): " +!(a && b));

        // 短路运算
        /*
        * 即判断时若a为假，则不会去计算&&后面的表达式
        * */
        int c = 5;
        boolean d = (c < 4) && (c++ < 4);
        System.out.println(c);  // c=5,由此可判断当前面为假时，其并不会计算&&后面的表达式
        System.out.println(d);
        boolean e = (c < 7) && (c++ > 7);
        System.out.println(c);  // c=6,由此可判断当前面为真时，才会计算&&后面的表达式
        System.out.println(e);
        // 以上即为短路运算的思想
    }
}
