package com.example.tugas1_10119294
/*
* Tanggal : 20/04/2022
* NIM : 10119294
* Nama : Lingga Juliansyah
* */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import tugas1_10119294.R

class LoginActivity : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var textRegister : TextView

    private fun initComponents(){
        btnLogin = findViewById(R.id.btn_login)
        textRegister = findViewById(R.id.text_register)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initComponents()

        btnLogin.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        textRegister.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}