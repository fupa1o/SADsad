package com.example.trainiggum_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn: Button
        lateinit var btn1: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btn = findViewById(R.id.button2)
        btn1 = findViewById(R.id.button3)
        btn.setOnClickListener { startActivity(Intent(this,MainActivity8::class.java)) }
        btn1.setOnClickListener { startActivity(Intent(this,MainActivity9::class.java)) }
    }


}