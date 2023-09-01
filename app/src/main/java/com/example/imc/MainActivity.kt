package com.example.imc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn_calcular_imc: Button
    private lateinit var btn_voltar_calculo: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calcular_imc = findViewById(R.id.button_calcular_imc)

        btn_calcular_imc.setOnClickListener {

            val activityReultado = Intent(this, ResultadoActivity::class.java)
            startActivity(activityReultado)

        }

        btn_voltar_calculo = findViewById(R.id.button_voltar_calculo)

        btn_voltar_calculo.setOnClickListener {
            finish()
        }

    }
}