package com.Coach.coach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class CraftsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crafts)
        val inst = findViewById<CardView>(R.id.paintingtab)
        inst.setOnClickListener{
            val intnt = Intent(this, PaintingActivity::class.java)
            startActivity(intnt)
        }
        val inst2 = findViewById<CardView>(R.id.origamitab)
        inst2.setOnClickListener{
            val intnt = Intent(this, OrigamiActivity::class.java)
            startActivity(intnt)
        }
        val inst3 = findViewById<CardView>(R.id.calligraphytab)
        inst3.setOnClickListener{
            val intnt = Intent(this, CalligraphyActivity::class.java)
            startActivity(intnt)
        }
    }
}