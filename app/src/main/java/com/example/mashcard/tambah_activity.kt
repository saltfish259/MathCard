package com.example.mashcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class tambah_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah)

        val btn_tambah = findViewById<Button>(R.id.btn_tambah)
        val ed_angka = findViewById<EditText>(R.id.ed_angka)
        btn_tambah.setOnClickListener {
            if (ed_angka.text.toString().toInt() == 30){
                Toast.makeText(this, "Selamat kamu benar", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Yah jawaban kamu salah", Toast.LENGTH_SHORT).show()
            }
        }

    }
}