package com.example.ntlong.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import sl.lib.uc.*;
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = SLCounter()
        System.out.print(count.getName());
    }
}
