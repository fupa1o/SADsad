package com.example.trainiggum_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)
        btn = findViewById(R.id.button19)
        btn.setOnClickListener { startActivity(Intent(this,MainActivity2::class.java)) }
    }
}