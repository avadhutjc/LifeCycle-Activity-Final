package com.ajc.lifeCycleActivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //  var btnToGOSecondPage: Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "onCreate - MainActivity")

        btnGoSecondActivity.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        })
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "onRestart - MainActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart - MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume - MainActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause - MainActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop - MainActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy - MainActivity")
    }
}