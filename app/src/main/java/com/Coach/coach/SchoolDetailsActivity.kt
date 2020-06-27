package com.Coach.coach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SchoolDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school_details)

        val btn = findViewById<Button>(R.id.applyforschool)
        btn.setOnClickListener{
            val intnt = Intent(this,LessonListActivity::class.java)
            startActivity(intnt)

        }
    }
}