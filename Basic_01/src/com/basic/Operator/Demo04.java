package com.basic.Operator;

public class Demo04 {
    public static void main(String[] args) {
        /*
        A = 0001 1100
        B = 1100 0010
        A %/|/~ B

        面试题？2*8怎么计算最快 2*2*2*2
        2*8 = 16
        即位运算效率极高
        <<   *2  左移，1往高位走，增大  0000 0001 --> 0000 0010
        >>   /2
         */
        System.out.println(2 << 3);
    }
}
