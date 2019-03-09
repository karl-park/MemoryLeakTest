package com.eungpang.android.memoryleaktest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock

class MyKotlinLeakActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_kotlin_leak)

        startAsyncTask()
    }

    private fun startAsyncTask() {
        val task = Runnable {
            SystemClock.sleep(20000)
        }
        Thread(task).start()
    }
}
