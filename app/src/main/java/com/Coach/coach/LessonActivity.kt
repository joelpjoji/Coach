package com.Coach.coach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LessonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)
        val btn = findViewById<Button>(R.id.finishlesson)
        btn.setOnClickListener{
            val intnt = Intent(this,LessonListActivity::class.java)
            Toast.makeText(getApplicationContext(),"Go To Next Lesson", Toast.LENGTH_LONG).show();
            startActivity(intnt)

        }
    }
}