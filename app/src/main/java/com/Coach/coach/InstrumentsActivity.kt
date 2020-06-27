package com.Coach.coach

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import androidx.cardview.widget.CardView

class InstrumentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruments)
        val inst = findViewById<CardView>(R.id.gtrbtn)
        inst.setOnClickListener {
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst2 = findViewById<CardView>(R.id.viobtn)
        inst2.setOnClickListener {
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst3 = findViewById<CardView>(R.id.keybtn)
        inst3.setOnClickListener {
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst4 = findViewById<CardView>(R.id.drumbtn)
        inst4.setOnClickListener {
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
    }
}