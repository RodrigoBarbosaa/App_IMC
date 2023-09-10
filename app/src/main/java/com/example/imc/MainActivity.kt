package com.example.imc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.imc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener { prosseguir() }

        binding.btnVoltarMain.setOnClickListener {
            finish()
        }
    }
    private fun prosseguir() {

        val peso = binding.editPeso.text.toString()
        val altura = binding.editAltura.text.toString()

        val intent = Intent(this, ResultadoActivity::class.java)

        intent.putExtra("peso", peso)
        intent.putExtra("altura", altura)


        startActivity(intent)
    }
}