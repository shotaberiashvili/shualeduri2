package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Hermione2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hermione2)

        val rightmediumhermione1=findViewById<Button>(R.id.rightmediumhermione1)
        val wrongmediumhermione1=findViewById<Button>(R.id.wrongmediumhermione1)
        val wrongmediumhermione2=findViewById<Button>(R.id.wrongmediumhermione2)
        val wrongmediumhermione3=findViewById<Button>(R.id.wrongmediumhermione3)

        rightmediumhermione1.setOnClickListener{
            rightmediumhermione1.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, "Correct answer", Toast.LENGTH_LONG).show()
        }
        wrongmediumhermione1.setOnClickListener{
            wrongmediumhermione1.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wrongmediumhermione2.setOnClickListener{
            wrongmediumhermione2.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wrongmediumhermione3.setOnClickListener{
            wrongmediumhermione3.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
    }
}