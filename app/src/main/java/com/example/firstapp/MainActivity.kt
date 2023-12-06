package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var coolBtn = findViewById<Button>(R.id.coolBtn)
        var hotBtn = findViewById<Button>(R.id.hotBtn)
        var ll = findViewById<LinearLayout>(R.id.ll)

        coolBtn.setOnClickListener{
            ll.setBackgroundColor(R.color.black)
        }
        hotBtn.setOnClickListener {
            ll.setBackgroundColor(R.color.white)
        }
    }
}