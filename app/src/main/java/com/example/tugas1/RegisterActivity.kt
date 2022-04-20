package com.example.tugas1
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

class RegisterActivity : AppCompatActivity() {

    private lateinit var btnRegister: Button
    private lateinit var textLogin : TextView

    private fun initComponents(){
        btnRegister = findViewById(R.id.btn_register)
        textLogin = findViewById(R.id.text_login)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initComponents()

        btnRegister.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        textLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}