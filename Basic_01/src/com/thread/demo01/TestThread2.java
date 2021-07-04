package com.thread.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

// P4
public class TestThread2 extends Thread{

    private String url;
    private String name;

    public TestThread2(String url, String name){
        this.url = url;
        this.name = name;

    }

    @Override
    public void run() {
        WebDownload download = new WebDownload();
        download.downloader(url, name);
        System.out.println("the file " + name + " was downloaded");
    }


    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://pic.netbian.com/uploads/allimg/210622/123504-1624336504b13b.jpg", "kml.png");
        TestThread2 t2 = new TestThread2("https://pic.netbian.com/uploads/allimg/210621/235012-1624290612f859.jpg", "yy.png");

        t1.start();
        t2.start();
    }
}


// 下载器
class WebDownload{
    // 下载方法
    public void downloader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO exception, downloader method was fail");
        }
    }
}
