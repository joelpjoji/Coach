package com.joey.coach;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.navigation.NavigationView;



public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    private CardView instrumentsmenu,gamesmenu,sportsmenu,origamimenu,paintingmenu,dancingmenu;
    static final float END_SCALE = 0.7f;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuIcon;
    ConstraintLayout content;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        menuIcon = findViewById(R.id.menu_icon);
        content = findViewById(R.id.content);
        naviagtionDrawer();
        instrumentsmenu = (CardView) findViewById(R.id.instrumentsmenu);
        gamesmenu = (CardView) findViewById(R.id.gamesmenu);
        sportsmenu = (CardView) findViewById(R.id.sportsmenu);
        origamimenu = (CardView) findViewById(R.id.origamimenu);
        paintingmenu = (CardView) findViewById(R.id.paintingmenu);
        dancingmenu = (CardView) findViewById(R.id.dancingmenu);

        instrumentsmenu.setOnClickListener(this);
        gamesmenu.setOnClickListener(this);
        sportsmenu.setOnClickListener(this);
        origamimenu.setOnClickListener(this);
        paintingmenu.setOnClickListener(this);
        dancingmenu.setOnClickListener(this);

    }
    private void naviagtionDrawer(){

        //Naviagtion Drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        animateNavigationDrawer();
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch(item.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_profile:
                intent = new Intent(getApplicationContext(),UserProfile.class);
                startActivity(intent);
                break;
            case R.id.nav_certificate:
                intent = new Intent(getApplicationContext(),Certificates.class);
                startActivity(intent);
                break;
        }

        return true;
    }
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
    }
    private void animateNavigationDrawer() {

        //Add any color or remove it to use the default one!
        //To make it transparent use Color.Transparent in side setScrimColor();
        //drawerLayout.setScrimColor(Color.TRANSPARENT);
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

                // Scale the View based on current slide offset
                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                content.setScaleX(offsetScale);
                content.setScaleY(offsetScale);

                // Translate the View, accounting for the scaled width
                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = content.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                content.setTranslationX(xTranslation);
            }
        });

    }


     @Override
     public void onClick(View v) {
         Intent i;
         switch (v.getId()) {
             case R.id.instrumentsmenu:
                 i = new Intent(this, InstrumentsActivity.class);
                 startActivity(i);
                 break;
             case R.id.gamesmenu:
                 i = new Intent(this, GamesActivity.class);
                 startActivity(i);
                 break;
             case R.id.sportsmenu:
                 i = new Intent(this, SportsActivity.class);
                 startActivity(i);
                 break;
             case R.id.origamimenu:
                 i = new Intent(this, OrigamiActivity.class);
                 startActivity(i);
                 break;
             case R.id.paintingmenu:
                 i = new Intent(this, PaintingActivity.class);
                 startActivity(i);
                 break;
             case R.id.dancingmenu:
                 i = new Intent(this, DancingActivity.class);
                 startActivity(i);
                 break;
             default:
                 break;
         }
     }

}