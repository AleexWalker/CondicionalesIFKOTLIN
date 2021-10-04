package com.example.condicionalesifkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var auxiliarEntrada = 0
        var contador: Int = 1
        val toast = Toast.makeText(this , "Numero insertado" , Toast.LENGTH_SHORT)

        for (i in 1..10) {
            button.setOnClickListener {
                if (contador <= 10){
                    toast.cancel()
                    val entrada = et1.text.toString().toInt()
                    auxiliarEntrada = auxiliarEntrada + entrada

                    contador++
                    toast.show()
                } else {
                    Toast.makeText(this, "Has llegado al limite de Numeros", Toast.LENGTH_SHORT).show()
                    val media = auxiliarEntrada / 10
                    tv1.text = "La media equivale a $media"
                }
            }
        }

    }
}