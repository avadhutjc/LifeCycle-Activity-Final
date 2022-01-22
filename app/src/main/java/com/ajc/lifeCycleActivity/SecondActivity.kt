package com.ajc.lifeCycleActivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    //var btnGoThirdActivity: Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAG", "onCreate - SecondActivity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnGoThirdActivity.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intent)
        })
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "onRestart - SecondActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart - SecondActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume - SecondActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause - SecondActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop - SecondActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy - SecondActivity")
    }
}
/*
Before rotating activity was in :-
2022-01-22 12:42:37.574 23786-23786/com.ajc.lifecycleactivity D/TAG: onCreate - MainActivity
2022-01-22 12:42:37.581 23786-23786/com.ajc.lifecycleactivity D/TAG: onStart - MainActivity
2022-01-22 12:42:37.584 23786-23786/com.ajc.lifecycleactivity D/TAG: onResume - MainActivity

After rotating  in horizontal activity is in :-
2022-01-22 12:43:33.697 23786-23786/com.ajc.lifecycleactivity D/TAG: onPause - MainActivity
2022-01-22 12:43:33.700 23786-23786/com.ajc.lifecycleactivity D/TAG: onStop - MainActivity
2022-01-22 12:43:33.706 23786-23786/com.ajc.lifecycleactivity D/TAG: onDestroy - MainActivity
2022-01-22 12:43:33.923 23786-23786/com.ajc.lifecycleactivity D/TAG: onCreate - MainActivity
2022-01-22 12:43:33.932 23786-23786/com.ajc.lifecycleactivity D/TAG: onStart - MainActivity
2022-01-22 12:43:33.938 23786-23786/com.ajc.lifecycleactivity D/TAG: onResume - MainActivity

 */