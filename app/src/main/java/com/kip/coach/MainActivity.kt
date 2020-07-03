package com.kip.coach

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Vibrator
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.bumptech.glide.Glide
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class MainActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener {
    var drawerLayout: DrawerLayout? = null
    var navigationView: NavigationView? = null
    private lateinit var mAuth: FirebaseAuth




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navigation_drawer)
        var toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        mAuth = FirebaseAuth.getInstance()
        val currentUser = mAuth.currentUser

        //added toolbar
        toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        //drawer initialisation
        drawerLayout = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        navigationView = findViewById<View>(R.id.navigation_view) as NavigationView
        navigationView!!.setNavigationItemSelectedListener(this)


        val fullname = currentUser?.displayName
        val parts = fullname?.split("\\s+".toRegex())?.toTypedArray()
        val firstname = parts?.get(0)

        name_txt.text = currentUser?.displayName
        email_txt.text = currentUser?.email
        name_txt1.text = firstname
        Glide.with(this).load(currentUser?.photoUrl).into(profile_image)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer)
        drawerLayout!!.setDrawerListener(toggle)
        toggle.syncState()


        val inst = findViewById<CardView>(R.id.instrumentstab)
        inst.setOnClickListener{
            val intnt = Intent(this, InstrumentsActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst2 = findViewById<CardView>(R.id.crafttab)
        inst2.setOnClickListener{
            val intnt = Intent(this, CraftsActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst3 = findViewById<CardView>(R.id.singingtab)
        inst3.setOnClickListener {
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst4 = findViewById<CardView>(R.id.gamestab)
        inst4.setOnClickListener{
            val intnt = Intent(this, GamesActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst5 = findViewById<CardView>(R.id.dancingtab)
        inst5.setOnClickListener {
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }
        val inst6 = findViewById<CardView>(R.id.sportstab)
        inst6.setOnClickListener{
            val intnt = Intent(this, SchoolActivity::class.java)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(35)
            startActivity(intnt)
        }



    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }
    override fun onBackPressed() {
        if (drawerLayout!!.isDrawerOpen(GravityCompat.START)) {
            drawerLayout!!.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
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


