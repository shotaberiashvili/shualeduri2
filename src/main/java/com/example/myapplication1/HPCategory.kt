package com.example.myapplication1


import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View



class HPCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hpcategory)
    }

    fun easyharry(view: View) {
        val i = Intent(applicationContext, Harry::class.java)
        startActivity(i)
    }

    fun mediumharry(view: View) {
        val i = Intent(applicationContext, Harry2::class.java)
        startActivity(i)
    }

    fun hardharry(view: View) {
        val i = Intent(applicationContext, Harry3::class.java)
        startActivity(i)
    }
}