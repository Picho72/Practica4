package com.example.practica4

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edCadena: EditText
    lateinit var checkNegrita: CheckBox
    lateinit var checkCursiva: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edCadena = findViewById(R.id.edCadena)
        checkNegrita = findViewById(R.id.chkNegrita)
        checkCursiva = findViewById(R.id.chkCursiva)
    }

    fun verificaCheck(view: View) {
        edCadena.typeface = Typeface.DEFAULT
        if(checkCursiva.isChecked && checkNegrita.isChecked){
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
        }else if(checkCursiva.isChecked){
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
        }else if(checkNegrita.isChecked){
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
        }
    }
}