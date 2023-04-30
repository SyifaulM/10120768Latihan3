package com.example.a10120768latihan3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class Biodata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val nama = findViewById<EditText>(R.id.nama_panggilan) as EditText
        val buttonClick = findViewById<Button>(R.id.btnSelanjutnya)

        buttonClick.setOnClickListener {
            val nama_panggilan = nama.text.toString()
            val intent = Intent(this, SayHi::class.java)
            intent.putExtra("nama",nama_panggilan)
            startActivity(intent)
        }
    }
}