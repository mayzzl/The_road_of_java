package com.thread.demo01;

/*
    自定义线程继承Thread类
    重写run()方法，编写线程执行体
    创建线程对象，调用start()方法启动线程

    注意：线程开启不一定立即执行，需要CPU调度
 */

public class TestThread1 extends Thread{
    @Override
    public void run() {
        // run方法线程体，继承Thread需要重写run()方法
        for (int i = 0; i < 20; i++) {
            System.out.println("I am levi " + i);
        }
    }

    public static void main(String[] args) {
        // main 主线程

        // 创建一个线程对象
        TestThread1 thread1 = new TestThread1();
        // 调用start()方法开启线程
        thread1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("I am Alen " + i);
        }
    }
}
