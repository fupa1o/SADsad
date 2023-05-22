package com.example.trainiggum_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activiy12)
        btn = findViewById(R.id.button14)
        btn.setOnClickListener { startActivity(Intent(this,MainActivity2::class.java)) }
    }
}