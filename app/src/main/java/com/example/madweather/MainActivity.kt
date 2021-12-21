package com.example.madweather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.appbar.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.tool))
        supportActionBar?.title = ""
        tool.setNavigationOnClickListener{
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.rigth_in, R.anim.left_out)
        }
        supportActionBar!!.addOnMenuVisibilityListener {
          if (it)  imageView211.visibility = View.VISIBLE
            else imageView211.visibility = View.INVISIBLE
        }
//        fun onclick(){
//            val intent = Intent(this@MainActivity, SetActiviti::class.java)
//            startActivity(intent)
//        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}