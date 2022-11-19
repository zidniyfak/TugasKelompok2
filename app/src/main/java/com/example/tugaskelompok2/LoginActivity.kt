package com.example.tugaskelompok2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.acitivity_login.*

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_login)

        linkDaftar.setOnClickListener() {
            val intent = Intent(this, DaftarActivity::class.java)
            startActivity(intent)
        }
    }
}