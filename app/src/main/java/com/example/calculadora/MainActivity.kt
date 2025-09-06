package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            val calculo = binding.calculo

            binding.um.setOnClickListener {
                calculo.text = "${calculo.text}1"
            }

            binding.dois.setOnClickListener {
                calculo.text = "${calculo.text}2"
            }

            binding.tres.setOnClickListener {
                calculo.text = "${calculo.text}3"
            }

            binding.quatro.setOnClickListener {
                calculo.text = "${calculo.text}4"
            }

            binding.cinco.setOnClickListener {
                calculo.text = "${calculo.text}5"
            }

            binding.seis.setOnClickListener {
                calculo.text = "${calculo.text}6"
            }

            binding.sete.setOnClickListener {
                calculo.text = "${calculo.text}7"
            }

            binding.oito.setOnClickListener {
                calculo.text = "${calculo.text}8"
            }

            binding.nove.setOnClickListener {
                calculo.text = "${calculo.text}9"
            }

            binding.parentesesAbrindo.setOnClickListener {
                calculo.text = "${calculo.text}("
            }

            binding.parentesesFechando.setOnClickListener {
                calculo.text = "${calculo.text})"
            }

            binding.divisao.setOnClickListener {
                calculo.text = "${calculo.text}/"
            }

            binding.multiplicar.setOnClickListener {
                calculo.text = "${calculo.text}*"
            }

            binding.subtrair.setOnClickListener {
                calculo.text = "${calculo.text}-"
            }

            binding.somar.setOnClickListener {
                calculo.text = "${calculo.text}+"
            }

            binding.zero.setOnClickListener {
                calculo.text = "${calculo.text}0"
            }

            binding.ponto.setOnClickListener {
                calculo.text = "${calculo.text}."
            }

            binding.apagar.setOnClickListener {
                calculo.text = calculo.text.dropLast(1)
            }

            binding.ce.setOnClickListener {
                calculo.text = ""
                binding.resultado.text = ""
            }

            binding.igual.setOnClickListener {
                val resultadoCalculado = Expression(calculo.text.toString()).calculate()

                if (resultadoCalculado.isNaN()){
                    binding.resultado.text = "Expressão inválida"
                } else {
                    binding.resultado.text = resultadoCalculado.toString()
                }
            }

        }
    }
