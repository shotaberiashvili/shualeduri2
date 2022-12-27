package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Harry2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harry2)

        val rightmediumharry1=findViewById<Button>(R.id.rightmediumharry1)
        val wrongmediumharry1=findViewById<Button>(R.id.wrongmediumharry1)
        val wrongmediumharry2=findViewById<Button>(R.id.wrongmediumharry2)
        val wrongmediumharry3=findViewById<Button>(R.id.wrongmediumharry3)

        rightmediumharry1.setOnClickListener {
            rightmediumharry1.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, "Correct answer", Toast.LENGTH_LONG).show()
        }
        wrongmediumharry1.setOnClickListener {
            wrongmediumharry1.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wrongmediumharry2.setOnClickListener{
            wrongmediumharry2.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wrongmediumharry3.setOnClickListener {
            wrongmediumharry3.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
    }
}