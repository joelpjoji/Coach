package com.Coach.coach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.bumptech.glide.Glide
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_profile.*

class LessonActivity : AppCompatActivity(){
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