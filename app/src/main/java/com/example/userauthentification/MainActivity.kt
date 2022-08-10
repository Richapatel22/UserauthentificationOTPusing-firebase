package com.example.userauthentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonpress = findViewById<Button>(R.id.button)
        buttonpress.setOnClickListener {
            val Intent = Intent(this,enternumber::class.java)
            startActivity(Intent)
        }

    }
}