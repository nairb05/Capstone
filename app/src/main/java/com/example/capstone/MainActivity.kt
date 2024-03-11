package com.example.capstone

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.capstone.ui.theme.SignUPActivity
import com.example.capstone.ui.theme.ui.theme.LoginActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_main)

        val btn_SignUp = findViewById<Button>(R.id.btnSignUp)
        val btn_Login: TextView = findViewById(R.id.BtnLogin)

        btn_Login.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        btn_SignUp.setOnClickListener{
            val intent = Intent(this, SignUPActivity::class.java)
            startActivity(intent)
            }
        }



        }



