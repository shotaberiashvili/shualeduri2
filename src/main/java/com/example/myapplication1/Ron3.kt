package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Ron3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ron3)

        val righthardron1=findViewById<Button>(R.id.righthardron1)
        val wronghardron1=findViewById<Button>(R.id.wronghardron1)
        val wronghardron2=findViewById<Button>(R.id.wronghardron2)
        val wronghardron3=findViewById<Button>(R.id.wronghardron3)

        righthardron1.setOnClickListener{
            righthardron1.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, "Correct answer", Toast.LENGTH_LONG).show()
        }
        wronghardron1.setOnClickListener{
            wronghardron1.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wronghardron2.setOnClickListener{
            wronghardron2.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wronghardron3.setOnClickListener{
            wronghardron3.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
    }
}