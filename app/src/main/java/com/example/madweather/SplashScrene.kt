package com.example.madweather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_splash_screne.*

class SplashScrene : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screne)

        val timer = object : CountDownTimer(4000, 1000){
            override fun onTick(millUF: Long) {
                textView5.text = (millUF/ 1000).toString()
            }

            override fun onFinish() {
                val intent = Intent(this@SplashScrene ,MainActivity::class.java)
                startActivity(intent)
            }

        }.start()
    }
}