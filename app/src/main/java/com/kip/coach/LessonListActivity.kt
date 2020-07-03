package com.kip.coach

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import androidx.cardview.widget.CardView
import com.skydoves.transformationlayout.onTransformationStartContainer
import kotlinx.android.synthetic.main.activity_main.*

class LessonListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        onTransformationStartContainer()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessonlist)
        val inst1 = findViewById<CardView>(R.id.lesson1)
        inst1.setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, LessonActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)
        }
        val inst2 = findViewById<CardView>(R.id.lesson2)
        inst2.setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, LessonActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)
        }
        val inst3 = findViewById<CardView>(R.id.lesson3)
        inst3.setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, LessonActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)
        }
        val inst4 = findViewById<CardView>(R.id.lesson4)
        inst4.setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, LessonActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)
        }
        val inst5 = findViewById<CardView>(R.id.lesson5)
        inst5.setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, LessonActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)
        }
    }
}