package com.example.user.roomrent.authentication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.user.roomrent.R
import com.example.user.roomrent.R.*
import com.example.user.roomrent.drawer.DrawerActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin = findViewById<Button>(R.id.email_login)
        var btnSignup = findViewById<Button>(R.id.go_sign_up)

        btnSignup.setOnClickListener {

            var intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)

        }
        btnLogin.setOnClickListener {

            var intent = Intent(this, DrawerActivity::class.java)
            startActivity(intent)

        }
    }
}
