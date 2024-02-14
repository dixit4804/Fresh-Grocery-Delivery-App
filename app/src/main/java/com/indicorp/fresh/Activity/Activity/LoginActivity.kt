package com.indicorp.fresh.Activity.Activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.indicorp.fresh.R

class LoginActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val textDontHaveAccount = findViewById<TextView>(R.id.textdonthaveacount)
        val textForgetPassword = findViewById<TextView>(R.id.textForgetpass)

        buttonLogin.setOnClickListener {
            // Handle the login button click
      val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()

        }

        textDontHaveAccount.setOnClickListener {
            val intent =Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        textForgetPassword.setOnClickListener {
            val intent =Intent(this,ForgetActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
