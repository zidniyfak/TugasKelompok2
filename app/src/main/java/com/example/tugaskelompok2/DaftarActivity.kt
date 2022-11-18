package com.example.tugaskelompok2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_daftar.*

class DaftarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        btnDaftar.setOnClickListener(){
            val checkJKelamin  = rgJenisKelamin.checkedRadioButtonId
            val jKelamin = findViewById<RadioButton>(checkJKelamin)

            val intent = Intent(this, ProfilActivity::class.java)

            val bundle = Bundle()
            bundle.putString("Nama", etNama.text.toString())
            bundle.putString("TglLahir",etTglLahir.text.toString())
            bundle.putString("Email",etEmail.text.toString())
            bundle.putString("JKelamin", jKelamin.text.toString())
            intent.putExtras(bundle)

            startActivity(intent)
        }
    }
}