package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Ron : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ron)

        val rightron1=findViewById<Button>(R.id.rightron1)
        val wrongron1=findViewById<Button>(R.id.wrongron1)
        val wrongron2=findViewById<Button>(R.id.wrongron2)
        val wrongron3=findViewById<Button>(R.id.wrongron3)

        rightron1.setOnClickListener{
            rightron1.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, "Correct answer", Toast.LENGTH_LONG).show()
        }
        wrongron1.setOnClickListener{
            wrongron1.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wrongron2.setOnClickListener{
            wrongron2.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wrongron3.setOnClickListener{
            wrongron3.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
    }
}