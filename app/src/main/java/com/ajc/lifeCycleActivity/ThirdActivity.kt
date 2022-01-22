package com.ajc.lifeCycleActivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAG", "onCreate - ThirdActivity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "onRestart - ThirdActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart - ThirdActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume - ThirdActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause - ThirdActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop - ThirdActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        val d = Log.d("TAG", "onDestroy - ThirdActivity")
    }
}