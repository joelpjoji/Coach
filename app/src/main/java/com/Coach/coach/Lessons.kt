package com.Coach.coach

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lessons.*

class Lessons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)

        progress_circular.apply{
            progressMax = 100f
            setProgressWithAnimation(50f,1000)
            progressBarWidth = 5f
            progressBarColor = Color.CYAN
            backgroundProgressBarWidth= 7f


        }
    }
}