package com.example.zazy

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label = findViewById<TextView>(R.id.namere)
        val button = findViewById<Button>(R.id.button)
        var editText = findViewById<EditText>(R.id.dela)

        button.setOnClickListener{
            val text = editText.text.toString().trim()
            if(text == "")
                Toast.makeText(this, "Введите что нибудь", Toast.LENGTH_SHORT).show()
            else
                label.text = text
        }
    }
}