package com.example.convertertemperature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.convertertemperature.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConverter.setOnClickListener {
            if (!binding.enterCelcius.text.toString().isEmpty()) {
                val celcius = binding.enterCelcius.text.toString().toDouble()
                val fahrenheit = (celcius * 9 / 5) + 32
                val kelvin = celcius + 273.15

                binding.valueF.text = "${fahrenheit} ºF"
                binding.valueK.text = "${kelvin} K"
                binding.warming.text = ""
            } else {
                binding.warming.text = "Campo de temperatura vazio ou valor inválido"
            }
        }
    }


}