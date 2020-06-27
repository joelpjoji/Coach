package com.Coach.coach

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import androidx.cardview.widget.CardView

class SchoolActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school)
        val inst1 = findViewById<CardView>(R.id.school1)
        inst1.setOnClickListener {
            val intnt = Intent(this, SchoolDetailsActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst2 = findViewById<CardView>(R.id.school2)
        inst2.setOnClickListener {
            val intnt = Intent(this, SchoolDetailsActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
    }
}