package com.Coach.coach

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import cn.jzvd.Jzvd
import cn.jzvd.JzvdStd
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.activity_lesson.*

class LessonActivity : AppCompatActivity(){

    private lateinit var videoView: JzvdStd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)

        video_player.setUp("https://firebasestorage.googleapis.com/v0/b/coach-3d236.appspot.com/o/adultgyan_-20170810-0001.mp4?alt=media&token=1b91c256-b0b4-41f1-976c-75ce4f16cc1a"
                ,"Lesson 1",JzvdStd.SCREEN_STATE_OFF)


        val btn = findViewById<Button>(R.id.finishlesson)
        btn.setOnClickListener{
            val intnt = Intent(this,LessonListActivity::class.java)
            Toast.makeText(getApplicationContext(),"Go To Next Lesson", Toast.LENGTH_LONG).show();
            startActivity(intnt)

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


