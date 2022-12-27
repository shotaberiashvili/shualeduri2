package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Hermione : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hermione)

        val righthermione1=findViewById<Button>(R.id.righthermione1)
        val wronghermione1=findViewById<Button>(R.id.wronghermione1)
        val wronghermione2=findViewById<Button>(R.id.wronghermione2)
        val wronghermione3=findViewById<Button>(R.id.wronghermione3)

        righthermione1.setOnClickListener{
            righthermione1.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, "Correct answer", Toast.LENGTH_LONG).show()
        }
        wronghermione1.setOnClickListener{
            wronghermione1.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wronghermione2.setOnClickListener{
            wronghermione2.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wronghermione3.setOnClickListener{
            wronghermione3.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
    }
}