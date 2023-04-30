package com.example.a10120768latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val masuk = findViewById<Button>(R.id.btnMasuk)
        masuk.setOnClickListener {
            val intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
    }
}