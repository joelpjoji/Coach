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


class HomeActivity : AppCompatActivity(){

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
            val inst2 = findViewById<CardView>(R.id.crafttab)
            inst2.setOnClickListener{
                val intnt = Intent(this, CraftsActivity::class.java)
                startActivity(intnt)
            }
            val inst3 = findViewById<CardView>(R.id.dancingtab)
            inst3.setOnClickListener{
                val intnt = Intent(this, DancingActivity::class.java)
                startActivity(intnt)
            }
            val inst4 = findViewById<CardView>(R.id.gamestab)
            inst4.setOnClickListener{
                val intnt = Intent(this, GamesActivity::class.java)
                startActivity(intnt)
            }
            val inst5 = findViewById<CardView>(R.id.singingtab)
            inst5.setOnClickListener{
                val intnt = Intent(this, SingingActivity::class.java)
                startActivity(intnt)
            }
            val inst6 = findViewById<CardView>(R.id.sportstab)
            inst6.setOnClickListener{
                val intnt = Intent(this, SportsActivity::class.java)
                startActivity(intnt)
            }





            toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open , R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()


            supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)

        }




                override fun onOptionsItemSelected(item: MenuItem): Boolean {
                    if (toggle.onOptionsItemSelected(item)) {
                        return true
                    }
                    return super.onOptionsItemSelected(item)
                }


}


