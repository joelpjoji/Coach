package com.Coach.coach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.bumptech.glide.Glide
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_profile.*

class HelpActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
        mAuth = FirebaseAuth.getInstance()
        val currentUser = mAuth.currentUser


        name_txt.text = currentUser?.displayName
        email_txt.text = currentUser?.email

        Glide.with(this).load(currentUser?.photoUrl).into(profile_image)
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val i = Intent()
        when (item.itemId) {
            R.id.home -> {
                i.setClass(this, MainActivity::class.java)
                startActivity(i)
            }
            R.id.signout -> {
                startActivity(LoginActivity.getLaunchIntent(this))
                FirebaseAuth.getInstance().signOut();
            }
            R.id.certificates -> {
                i.setClass(this, CertificatesActivity::class.java)
                startActivity(i)
            }
            R.id.recommended -> {
                i.setClass(this, RecommendedActivity::class.java)
                startActivity(i)
            }
            R.id.profile -> {
                i.setClass(this, ProfileActivity::class.java)
                startActivity(i)
            }

            R.id.schools -> {
                i.setClass(this, SchoolActivity::class.java)
                startActivity(i)
            }
            R.id.nav_settings -> {
                i.setClass(this, SettingsActivity::class.java)
                startActivity(i)
            }
            R.id.nav_feedback -> {
                i.setClass(this, FeedbackActivity::class.java)
                startActivity(i)
            }
            R.id.nav_help -> {
                i.setClass(this, HelpActivity::class.java)
                startActivity(i)
            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}