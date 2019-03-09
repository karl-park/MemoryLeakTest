package com.eungpang.android.memoryleaktest;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

public class MyJavaLambdaLeakActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_java_leak);

        startAsyncTask();
    }

    private void startAsyncTask() {
        Runnable task = () -> {
            SystemClock.sleep(20000);
        };

        new Thread(task).start();
    }
}
