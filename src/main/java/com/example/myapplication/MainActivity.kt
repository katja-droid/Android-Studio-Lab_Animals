package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Animal
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cat = Animal("Dog", "dog info", "10")
        val dog = Animal("Cat", "cat info", "5")
        val bird = Animal("Mouse", "mouse info", "1")

        val buttonCat = findViewById<Button>(R.id.button)
        buttonCat.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("animal", cat)
            startActivity(intent)
        }

        val buttonDog = findViewById<Button>(R.id.button2)
        buttonDog.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("animal", dog)
            startActivity(intent)
        }

        val buttonBird = findViewById<Button>(R.id.button3)
        buttonBird.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("animal", bird)
            startActivity(intent)
        }
    }
}

private fun Intent.putExtra(s: String, cat: Animal) {

}
