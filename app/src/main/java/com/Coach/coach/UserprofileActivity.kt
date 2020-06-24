package com.Coach.coach


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth

class UserprofileActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userprofile)

        mAuth = FirebaseAuth.getInstance()
        val currentUser = mAuth.currentUser

        id_txt.text = currentUser?.uid
        name_txt.text = currentUser?.displayName
        email_txt.text = currentUser?.email

        Glide.with(this).load(currentUser?.photoUrl).into(profile_image)

        sign_out_btn.setOnClickListener {
            mAuth.signOut()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}