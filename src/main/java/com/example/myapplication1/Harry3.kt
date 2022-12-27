package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Harry3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harry3)

        val righthardharry1=findViewById<Button>(R.id.righthardharry1)
        val wronghardharry1=findViewById<Button>(R.id.wronghardharry1)
        val wronghardharry2=findViewById<Button>(R.id.wronghardharry2)

        righthardharry1.setOnClickListener {
            righthardharry1.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, "Correct answer", Toast.LENGTH_LONG).show()
        }
        wronghardharry1.setOnClickListener {
            wronghardharry1.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wronghardharry2.setOnClickListener{
            wronghardharry2.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }

    }
}