package com.test;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    public static void main(String[] args) {

        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();


    }




}

