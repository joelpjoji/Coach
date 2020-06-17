package com.Coach.coach

    import android.annotation.SuppressLint
    import android.os.Bundle
    import android.view.MenuItem
    import android.widget.Toast
    import androidx.appcompat.app.ActionBarDrawerToggle
    import androidx.appcompat.app.AppCompatActivity
    import androidx.appcompat.widget.Toolbar
    import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

        lateinit var toggle: ActionBarDrawerToggle

        lateinit var toolbar: Toolbar

        @SuppressLint("RestrictedApi")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)
           // toolbar = findViewById(R.id.toolbar)
            //setSupportActionBar(toolbar)
            toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open , R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()


            supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when(it.itemId){
                R.id.group_one -> Toast.makeText(applicationContext,
                    "Clicked Item 1",Toast.LENGTH_SHORT).show()
                    R.id.group_two -> Toast.makeText(applicationContext,
                        "Clicked Item 2",Toast.LENGTH_SHORT).show()
                    R.id.group_three -> Toast.makeText(applicationContext,
                        "Clicked Item 3",Toast.LENGTH_SHORT).show()
                    R.id.group_four -> Toast.makeText(applicationContext,
                        "Clicked Item 4",Toast.LENGTH_SHORT).show()
                }
                true
            }

        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    }
