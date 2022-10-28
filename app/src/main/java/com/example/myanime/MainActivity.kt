package com.example.myanime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnBuka: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBuka = findViewById(R.id.btn_intent)

        btnBuka.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.btn_intent ->{
                val intentBiasa = Intent(this@MainActivity, HalamanDepan::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}