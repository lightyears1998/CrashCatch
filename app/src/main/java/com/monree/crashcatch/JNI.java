package com.monree.crashcatch;

import android.util.Log;

public class JNI {
    public static native String test();
    public static native void test2();

    public static void normalCallback() {
        Log.i("JNITEST","In Java: invoke normalCallback.");
    }


    public static void exceptionCallback() {
        Log.i("JNITEST","In Java: invoke exceptionCallback.");
        int a = 20 / 0;
        Log.i("JNITEST","--->" + a );
    }

    static {
        System.loadLibrary("jni_test");
    }
}