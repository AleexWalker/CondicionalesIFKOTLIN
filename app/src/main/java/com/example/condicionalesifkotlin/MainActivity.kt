package com.example.condicionalesifkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val tv1 = findViewById<TextView>(R.id.tv1)

        et2.doAfterTextChanged {
            val primerNumero = et1.text.toString()
            val segundoNumero = et2.text.toString()

            if (primerNumero > segundoNumero){
                tv1.text = "El PRIMER numero es mayor."
            } else {
                tv1.text = "El SEGUNDO numero es mayor."
            }
        }
    }
}