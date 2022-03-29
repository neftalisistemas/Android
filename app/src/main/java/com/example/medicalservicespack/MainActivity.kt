package com.example.medicalservicespack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1=findViewById<Button>(R.id.irp)
        boton1.setOnClickListener {
            val intento1 = Intent(this, Productos::class.java)
            startActivity(intento1)
        }
        val boton2=findViewById<Button>(R.id.irv)
        boton2.setOnClickListener {
            val intento2 = Intent(this, Ventas::class.java)
            startActivity(intento2)
        }
    }
}