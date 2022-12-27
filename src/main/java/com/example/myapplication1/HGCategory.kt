package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HGCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hgcategory)
    }

    fun easyhermione(view: View) {
        val i = Intent(applicationContext, Hermione::class.java)
        startActivity(i)
    }

    fun mediumhermione(view: View) {
        val i = Intent(applicationContext, Hermione2::class.java)
        startActivity(i)
    }

    fun hardhermione(view: View) {
        val i = Intent(applicationContext, Hermione3::class.java)
        startActivity(i)
    }
}