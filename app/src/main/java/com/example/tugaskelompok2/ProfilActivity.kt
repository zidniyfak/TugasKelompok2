package com.example.tugaskelompok2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_daftar.*
import kotlinx.android.synthetic.main.activity_profil.*

class ProfilActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val bundle = intent.getExtras()
        tvNama.setText(bundle?.getString("Nama"))
        tvTglLahir.setText(bundle?.getString("TglLahir"))
        tvEmail.setText(bundle?.getString("Email"))
        if (bundle?.getString("JKelamin") == "Laki - laki" ){
            Log.d("Kelamin", "LAKI")
            rbLaki.isChecked = true
        }else {
            Log.d("Kelamin", "PEREMPUAN")
            rbPerempuan.isChecked = true
        }

    }
}
//gjjjj
// topik
//djdjdjd