package com.Coach.coach

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Vibrator
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class CraftsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crafts)
        val inst = findViewById<CardView>(R.id.paintingtab)
        inst.setOnClickListener {
            val intnt = Intent(this, LessonList::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst2 = findViewById<CardView>(R.id.origamitab)
        inst2.setOnClickListener {
            val intnt = Intent(this, LessonList::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst3 = findViewById<CardView>(R.id.calligraphytab)
        inst3.setOnClickListener {
            val intnt = Intent(this, LessonList::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
    }
}