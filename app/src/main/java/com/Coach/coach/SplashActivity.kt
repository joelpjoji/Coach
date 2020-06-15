package com.Coach.coach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import androidx.constraintlayout.motion.widget.MotionLayout



public class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            /* Create an Intent that will start the Menu-Activity. */

            val mainIntent = Intent(this, LoginActivity::class.java)
            startActivity(mainIntent)
            finish()

        }, 3000)
    }
    fun  onTransitionChange (motionLayout: MotionLayout){
        motionLayout.setTransitionListener( object: MotionLayout.TransitionListener {

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
            }
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
            }
            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
            }
            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            }
        })
    }
}
