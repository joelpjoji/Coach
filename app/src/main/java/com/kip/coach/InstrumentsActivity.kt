package com.kip.coach

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout
import com.bumptech.glide.Glide
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import com.skydoves.transformationlayout.onTransformationStartContainer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class InstrumentsActivity : AppCompatActivity() {
    var drawerLayout: DrawerLayout? = null
    var navigationView: NavigationView? = null
    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        onTransformationStartContainer()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruments)
        mAuth = FirebaseAuth.getInstance()
        val currentUser = mAuth.currentUser


        name_txt.text = currentUser?.displayName
        email_txt.text = currentUser?.email

        Glide.with(this).load(currentUser?.photoUrl).into(profile_image)
        val inst = findViewById<CardView>(R.id.gtrbtn)
        inst.setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)
        }
        val inst2 = findViewById<CardView>(R.id.viobtn)
        inst2.setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)
        }
        val inst3 = findViewById<CardView>(R.id.keybtn)
        inst3.setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)
        }
        val inst4 = findViewById<CardView>(R.id.drumbtn)
        inst4.setOnClickListener {
            val bundle = transformationLayout.withActivity(this, "myTransitionName")
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            intent.putExtra("TransformationParams", transformationLayout.getParcelableParams())
            startActivity(intnt,bundle)
        }
    }

}