package com.example.trainiggum_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn: Button
        lateinit var btn1: Button
        lateinit var btn2: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        btn = findViewById(R.id.button9)
        btn1 = findViewById(R.id.button10)
        btn2 = findViewById(R.id.button13)
        btn.setOnClickListener { startActivity(Intent(this,MainActivity11::class.java)) }
        btn1.setOnClickListener { startActivity(Intent(this,MainActivity4::class.java)) }
        btn2.setOnClickListener { startActivity(Intent(this,MainActivity13::class.java)) }
    }
}