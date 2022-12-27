package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun harry(view: View) {
        val i = Intent(applicationContext, HPCategory::class.java)
        startActivity(i)
    }

    fun hermione(view: View) {
        val i = Intent(applicationContext, HGCategory::class.java)
        startActivity(i)
    }

    fun ron(view: View) {
        val i = Intent(applicationContext, RWCategory::class.java)
        startActivity(i)
    }

    fun login(view: View){
        val i = Intent(applicationContext, Login::class.java)
        startActivity(i)
    }
}