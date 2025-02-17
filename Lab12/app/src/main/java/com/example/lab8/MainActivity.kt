package com.example.lab8

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.service_start).setOnClickListener { v: View? ->
            val intent = Intent(this, MyService::class.java)
            startService(intent)
            Toast.makeText(this, "啟動Service", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}