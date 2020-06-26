package com.Coach.coach

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Vibrator
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class LessonList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessonlist)
        val inst1 = findViewById<CardView>(R.id.lesson1)
        inst1.setOnClickListener {
            val intnt = Intent(this, Lessons::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst2 = findViewById<CardView>(R.id.lesson2)
        inst2.setOnClickListener {
            val intnt = Intent(this, Lessons::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst3 = findViewById<CardView>(R.id.lesson3)
        inst3.setOnClickListener {
            val intnt = Intent(this, Lessons::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst4 = findViewById<CardView>(R.id.lesson4)
        inst4.setOnClickListener {
            val intnt = Intent(this, Lessons::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst5 = findViewById<CardView>(R.id.lesson5)
        inst5.setOnClickListener {
            val intnt = Intent(this, Lessons::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
    }
}