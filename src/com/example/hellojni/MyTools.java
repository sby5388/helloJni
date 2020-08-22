package com.example.hellojni;

/**
 * @author by5388  on 2020/8/22.
 */
public class MyTools {
    static {
        System.loadLibrary("hello-jni");
    }

    public native static String stringFromJNI();
}
