package com.Coach.coach

    import android.annotation.SuppressLint
    import android.content.Intent
    import android.os.Bundle
    import android.view.MenuItem
    import android.widget.Toast
    import androidx.appcompat.app.ActionBarDrawerToggle
    import androidx.appcompat.app.AppCompatActivity
    import androidx.cardview.widget.CardView
    import com.google.android.material.navigation.NavigationView
    import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

        lateinit var toggle: ActionBarDrawerToggle



        @SuppressLint("RestrictedApi")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)


            val inst = findViewById<CardView>(R.id.instrumentstab)
           inst.setOnClickListener{
               val intnt = Intent(this, InstrumentsActivity::class.java)
               startActivity(intnt)
           }


            toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open , R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()


            supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener(this)

        }


            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.profile -> {
                        val profile = Intent(this, UserprofileActivity::class.java)
                        startActivity(profile)
                    }

                }
            }

                override fun onOptionsItemSelected(item: MenuItem): Boolean {
                    if (toggle.onOptionsItemSelected(item)) {
                        return true
                    }
                    return super.onOptionsItemSelected(item)
                }


}


