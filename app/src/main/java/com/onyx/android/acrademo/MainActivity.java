package com.onyx.android.acrademo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import org.acra.ACRA;
import org.acra.ErrorReporter;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendReport(View view) {
        ErrorReporter reporter = ACRA.getErrorReporter();
        reporter.putCustomData("edu-error", "test");
        Log.d(TAG, "ErrorReporter");
        reporter.handleException(null);
    }

    public void crashReport(View view) {
        throw new RuntimeException("test crash");
    }
}
