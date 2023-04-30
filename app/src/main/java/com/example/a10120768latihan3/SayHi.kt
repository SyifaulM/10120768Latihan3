package com.example.a10120768latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SayHi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_say_hi)

        val brs = getString(R.string.beres)
        val udahBisa = getString(R.string.udah_bisa)
        val setiapBuat = getString(R.string.setiap)
        val bt = getString(R.string.buat)

        val getNama = intent.getStringExtra("nama")
        val done = findViewById<TextView>(R.id.done)
        if (getNama == ""){
            done.text = "Maaf kamu belum memasukkan nama, harap kembali dan isi yaa :)"
        } else {
            done.text = brs +" "+ getNama + " "+ udahBisa + " " + setiapBuat + " "+ getNama + " "+bt
        }
    }
}