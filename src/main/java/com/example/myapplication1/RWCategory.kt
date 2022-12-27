package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RWCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rwcategory)
    }
    fun easyron(view: View) {
        val i = Intent(applicationContext, Ron::class.java)
        startActivity(i)
    }

    fun mediumron(view: View) {
        val i = Intent(applicationContext, Ron2::class.java)
        startActivity(i)
    }

    fun hardron(view: View) {
        val i = Intent(applicationContext, Ron3::class.java)
        startActivity(i)
    }
}