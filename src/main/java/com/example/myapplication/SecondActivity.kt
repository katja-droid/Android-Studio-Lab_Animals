package com.example.myapplication

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Animal
import com.example.myapplication.R

class SecondActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val animalName = intent.getParcelableExtra("animal", Animal::class.java)
        val animalInfo = intent.getParcelableExtra("animal", Animal::class.java)
        val animalAge = intent.getParcelableExtra("animal", Animal::class.java)

        val textViewName = findViewById<TextView>(R.id.textView)
        val textViewInfo = findViewById<TextView>(R.id.textView2)
        val textViewAge = findViewById<TextView>(R.id.tvAge)

        textViewName.text = animalName?.name
        textViewInfo.text = animalInfo?.info
        textViewAge.text = animalAge?.age
    }
}