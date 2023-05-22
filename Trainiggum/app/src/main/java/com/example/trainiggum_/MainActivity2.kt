package com.example.trainiggum_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn: Button
        lateinit var btn1: Button
        lateinit var btn2: Button
        lateinit var btn3: Button
        lateinit var btn4: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn = findViewById(R.id.button8)
        btn1 = findViewById(R.id.button7)
        btn2 = findViewById(R.id.button5)
        btn3 = findViewById(R.id.button12)
        btn4 = findViewById(R.id.button11)
        btn.setOnClickListener { startActivity(Intent(this,MainActivity3::class.java)) }
        btn1.setOnClickListener { startActivity(Intent(this,MainActivity10::class.java)) }
        btn2.setOnClickListener { startActivity(Intent(this,MainActivity5::class.java)) }
        btn3.setOnClickListener { startActivity(Intent(this,MainActivity14::class.java)) }
        btn4.setOnClickListener { startActivity(Intent(this,MainActivity15::class.java)) }
    }


}