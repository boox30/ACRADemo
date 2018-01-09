package com.onyx.android.acrademo;

import android.app.Application;
import android.content.Context;

import org.acra.ACRA;
import org.acra.annotation.AcraCore;
import org.acra.annotation.AcraMailSender;

@AcraCore(
        buildConfigClass = BuildConfig.class,
        attachmentUriProvider = OnyxAttachmentUriProvider.class
)
@AcraMailSender(
        // TODO: 2018/1/9 set you email
        mailTo = "xxx@onyx-international.com"
)
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        // The following line triggers the initialization of ACRA
        ACRA.init(this);
    }


    @Override
    public void onCreate() {
        super.onCreate();

        AppUtils.init(this);
    }
}