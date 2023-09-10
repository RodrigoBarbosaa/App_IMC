package com.example.imc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.imc.databinding.ActivityResultadoBinding
import java.text.DecimalFormat

class ResultadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dados = recuperarDados()
        val peso = dados[0]?.toDouble()
        val altura = dados[1]?.toDouble()


        if (peso != null && altura != null) {

            val imc = (peso / (altura * altura))

            val formato = DecimalFormat("#.##")
            val imcFormatado = formato.format(imc)


            binding.txtResultadoNum.text = imcFormatado.toString()

            val laudo = if (imc < 18.5){
                "Você está abaixo do peso."
            }else if (imc in 18.5..24.99) {
                "Você está com o peso normal."
            }else if (imc in 25.0..29.99) {
                "Você está com sobrepeso."
            }else {
                "Você está com obesidade."
            }

            binding.txtLaudo.text = laudo

        }

        binding.btnVoltarResultado.setOnClickListener {
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun recuperarDados() : Array<String?> {
        val pesoStr = intent.getStringExtra("peso")
        val alturaStr = intent.getStringExtra("altura")

        return arrayOf(pesoStr, alturaStr)

    }
}