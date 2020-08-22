package com.example.hellojni.module2;

/**
 * @author Administrator  on 2020/8/22.
 */
public class Module2 {
    static {
        System.loadLibrary("module2");
    }

    /**
     * 加法
     */
    public static native int addNative(int a, int b);

    /**
     * 减法
     */
    public static native int subNative(int a, int b);

}
