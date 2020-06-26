package com.Coach.coach

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lessons.*

class Lessons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)

        progress_circular.apply{
            progressMax = 100f
            setProgressWithAnimation(70f,1000)
            progressBarWidth = 9f
            progressBarColor = Color.CYAN
            backgroundProgressBarWidth= 5f


            val uri =
                Uri.parse("https://firebasestorage.googleapis.com/v0/b/coach-3d236.appspot.com/o/adultgyan_-20170810-0001.mp4?alt=media&token=1b91c256-b0b4-41f1-976c-75ce4f16cc1a")
            vid.setVideoURI(uri)
            vid.start()



            }
        val btn = findViewById<Button>(R.id.finishlesson)
        btn.setOnClickListener{
            val intnt = Intent(this,LessonReview::class.java)
            startActivity(intnt)

        }
    }
}