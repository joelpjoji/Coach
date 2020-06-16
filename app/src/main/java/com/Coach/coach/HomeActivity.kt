package com.Coach.coach

    import android.content.Context
    import android.content.Intent
    import android.os.Bundle
    import androidx.appcompat.app.AppCompatActivity
    import com.google.firebase.auth.FirebaseAuth
    import kotlinx.android.synthetic.main.activity_home.*
    import com.facebook.AccessToken
    import com.facebook.GraphRequest
    import com.facebook.HttpMethod
    import com.facebook.login.LoginManager

    class HomeActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_login)
        }


    }
