package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Hermione3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hermione3)

        val righthardhermione1=findViewById<Button>(R.id.righthardhermione1)
        val wronghardhermione1=findViewById<Button>(R.id.wronghardhermione1)
        val wronghardhermione2=findViewById<Button>(R.id.wronghardhermione2)
        val wronghardhermione3=findViewById<Button>(R.id.wronghardhermione3)

        righthardhermione1.setOnClickListener{
            righthardhermione1.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, "Correct answer", Toast.LENGTH_LONG).show()
        }
        wronghardhermione1.setOnClickListener{
            wronghardhermione1.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wronghardhermione2.setOnClickListener{
            wronghardhermione2.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wronghardhermione3.setOnClickListener{
            wronghardhermione3.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
    }
}