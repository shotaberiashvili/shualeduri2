package com.example.myapplication1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Ron2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ron2)

        val rightmediumron1=findViewById<Button>(R.id.rightmediumron1)
        val wrongmediumron1=findViewById<Button>(R.id.wrongmediumron1)
        val wrongmediumron2=findViewById<Button>(R.id.wrongmediumron2)


        rightmediumron1.setOnClickListener{
            rightmediumron1.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, "Correct answer", Toast.LENGTH_LONG).show()
        }
        wrongmediumron1.setOnClickListener{
            wrongmediumron1.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }
        wrongmediumron2.setOnClickListener{
            wrongmediumron2.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong answer", Toast.LENGTH_LONG).show()
        }

    }
}