package com.example.tugas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
/*
* Tanggal : 20/04/2022
* NIM : 10119294
* Nama : Lingga Juliansyah
* */
class ProfileActivity : AppCompatActivity() {

    private lateinit var descTxt: TextView

    private fun initComponents(){
        descTxt = findViewById(R.id.desc_diri)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        initComponents()
        descTxt.text = "Saya adalah seorang mahasiswa Universitas Komputer Indonesia.Hobby saya adalah bermain game.Saya bermimpi menjadi seorang developer yang hebat"
    }
}