package com.example.imc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    lateinit var btn_calcule: Button
    lateinit var btn_ver_resultados: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_calcule = findViewById(R.id.button_calcule_home)
        btn_ver_resultados = findViewById(R.id.btn_resultados)

        btn_calcule.setOnClickListener {
            val abrir_calculadora = Intent(this, MainActivity::class.java)
            startActivity(abrir_calculadora)
        }

        btn_ver_resultados.setOnClickListener {
            val resultados_anteriores = Intent(this, ResultadosAnterioresActivity::class.java)
            startActivity(resultados_anteriores)
        }


    }
}