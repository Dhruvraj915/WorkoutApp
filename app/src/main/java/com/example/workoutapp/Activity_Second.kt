package com.example.workoutapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity_Second : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val fullWorkoutButton: Button = findViewById(R.id.button3)

        fullWorkoutButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLgSp6QZBviDxtAa6ZmgqLteEFbUcLlzqo"))
            startActivity(intent)
        }

        val startWorkoutButton: Button = findViewById(R.id.button2)

        startWorkoutButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLgSp6QZBviDxtAa6ZmgqLteEFbUcLlzqo"))
            startActivity(intent)
        }
    }
}
