package com.example.imc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadosAnterioresActivity : AppCompatActivity() {

    lateinit var btn_voltar_resultados: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados_anteriores)

        btn_voltar_resultados = findViewById(R.id.button_voltar_resultados)

        btn_voltar_resultados.setOnClickListener {
            finish()
        }

    }
}