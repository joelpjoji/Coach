package com.kip.coach

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Vibrator
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import cn.jzvd.JzvdStd
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.skydoves.transformationlayout.onTransformationStartContainer
import kotlinx.android.synthetic.main.activity_lesson.*
import kotlinx.android.synthetic.main.activity_lesson.transformationLayout
import kotlinx.android.synthetic.main.activity_main.*

class LessonActivity : AppCompatActivity(){

    private lateinit var videoView: JzvdStd
    override fun onCreate(savedInstanceState: Bundle?) {
        onTransformationStartContainer()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)
        findViewById<FloatingActionButton>(R.id.chatbutton).setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intent = Intent(this, ChatActivity::class.java)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intent, bundle)
        }

        video_player.setUp("https://firebasestorage.googleapis.com/v0/b/coach-3d236.appspot.com/o/adultgyan_-20170810-0001.mp4?alt=media&token=1b91c256-b0b4-41f1-976c-75ce4f16cc1a"
                ,"Lesson 1",JzvdStd.SCREEN_STATE_OFF)


        val btn = findViewById<Button>(R.id.finishlesson)
        btn.setOnClickListener{
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, LessonListActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)

        }
    }
    override fun onPause() {
        super.onPause()
        JzvdStd.releaseAllVideos()
    }


    override fun onBackPressed() {
        super.onBackPressed()
        JzvdStd.backPress()
    }

}


