package com.example.trainiggum_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)
        btn = findViewById(R.id.button15)
        btn.setOnClickListener { startActivity(Intent(this,MainActivity2::class.java)) }
    }
}