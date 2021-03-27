package com.example.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }
    private fun setListener() {
        calcular.setOnClickListener {
            calculo(peso.text.toString(), entradaAltura.text.toString())
        }
    }

    private fun calculo (peso: String, altura: String){
        val peso = entradaPeso.text.toString().trim().toFloatOrNull()
        val altura = entradaAltura.text.toString().trim().toFloatOrNull()

        if((peso != null) && (altura != null)){
            val imc = peso / (altura * altura)
            resultado.text = "A resposta do seu IMC é: $imc"
        }
    }
}