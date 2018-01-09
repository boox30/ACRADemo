package com.onyx.android.acrademo;

import android.content.Context;

/**
 * <pre>
 *     author : liao lin tao
 *     time   : 2018/1/9 11:56
 *     desc   :
 * </pre>
 */

public class AppUtils {
    private static Context appContext;

    public static void init(Context context){
        appContext = context.getApplicationContext();
    }

    public static String getPackageName(){
        return appContext.getPackageName();
    }
}
