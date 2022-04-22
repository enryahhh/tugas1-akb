package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
/*
* Tanggal : 20/04/2022
* NIM : 10119294
* Nama : Lingga Juliansyah
* */
class MainActivity : AppCompatActivity() {
    private lateinit var btnProfile: Button
    private lateinit var btnLogout : Button

    private fun initComponents(){
        btnProfile = findViewById(R.id.btn_profile)
        btnLogout = findViewById(R.id.btn_logout)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()

        btnProfile.setOnClickListener{
            startActivity(Intent(this,ProfileActivity::class.java))
        }

        btnLogout.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }
    }
}