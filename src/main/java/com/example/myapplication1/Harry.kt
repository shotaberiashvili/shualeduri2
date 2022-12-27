package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Harry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harry)

        val rightharry1=findViewById<Button>(R.id.rightharry1)
        val wrongharry1=findViewById<Button>(R.id.wrongharry1)
        val wrongharry2=findViewById<Button>(R.id.wrongharry2)
        val wrongharry3=findViewById<Button>(R.id.wrongharry3)

        rightharry1.setOnClickListener {
            rightharry1.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, "Correct answer", Toast.LENGTH_LONG).show()
        }
        wrongharry1.setOnClickListener {
            wrongharry1.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wrongharry2.setOnClickListener{
            wrongharry2.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
    }
        wrongharry3.setOnClickListener {
            wrongharry3.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }

    }


}