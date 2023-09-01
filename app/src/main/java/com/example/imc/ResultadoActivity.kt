package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadoActivity : AppCompatActivity() {

    private lateinit var btn_voltar_resultado: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        btn_voltar_resultado = findViewById(R.id.button_voltar_resultado)

        btn_voltar_resultado.setOnClickListener {
            finish()
        }

    }
}