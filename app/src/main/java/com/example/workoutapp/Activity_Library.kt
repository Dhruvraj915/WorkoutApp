package com.example.workoutapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Activity_Library : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_library)

        val imageView8: ImageView = findViewById(R.id.imageView8)
        imageView8.setOnClickListener {
            val intent = Intent(this, Activity_First::class.java)
            startActivity(intent)
        }

        val imageView9: ImageView = findViewById(R.id.imageView9)
        imageView9.setOnClickListener {
            val intent = Intent(this, Activity_Second::class.java)
            startActivity(intent)
        }

        val imageView10: ImageView = findViewById(R.id.imageView10)
        imageView10.setOnClickListener {
            val intent = Intent(this, Activity_Third::class.java)
            startActivity(intent)
        }

        val homeicon: ImageView = findViewById(R.id.homeicon)
        homeicon.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
