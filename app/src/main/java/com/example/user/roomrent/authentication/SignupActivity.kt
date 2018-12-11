package com.example.user.roomrent.authentication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.user.roomrent.R

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var btnLogin = findViewById<Button>(R.id.back_email_login)

        btnLogin.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
