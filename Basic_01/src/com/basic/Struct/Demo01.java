package com.basic.Struct;

public class Demo01 {
    public static void main(String[] args) {
        String name = "相麻堇";
        // switch...case的穿透性：当case语句中没有break时，程序会自动执行满足条件的case及以下的所有case
        // 反编译 .java-->class(字节码文件)----反编译(IDEA)
        // 注意对比其.class文件，字符串的本质也是数字的
        // switch (name.hashCode())
        switch (name){
            case "相麻堇":
                System.out.println("daisikei");
            case "西野七濑":
                System.out.println("haidaiyiou");
                break;
            default:
                System.out.println("okayili");
        }
    }
}
