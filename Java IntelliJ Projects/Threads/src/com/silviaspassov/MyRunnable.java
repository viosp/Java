package com.silviaspassov;

import static com.silviaspassov.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from my runnable's implementation of run");

    }
}
