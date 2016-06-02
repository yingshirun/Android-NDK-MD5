package com.shirun.jnitest33;

/**
 * ==========================================
 * <p/>
 * 作    者 : ying
 * <p/>
 * 创建时间 ： 2016/5/17.
 * <p/>
 * 用   途 :
 * <p/>
 * <p/>
 * ==========================================
 */
public class TestJni {
    static {
        System.loadLibrary("test");
    }
    public native String getJniString(String json);
}
