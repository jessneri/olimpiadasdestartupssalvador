package com.example.olimpiadacubos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_futebol.*

class FutebolActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futebol)

        placarFut1.text = "0"
        placarFut2.text = "0"

        val nomeDoTime1Fut = intent.getStringExtra("TIME1")
        val nomeDoTime2Fut = intent.getStringExtra("TIME2")


        nomeTime1Fut.text = nomeDoTime1Fut
        nomeTime2Fut.text = nomeDoTime2Fut

        botaoPosit1.setOnClickListener {
            val valorInicialPosit1 = placarFut1.text.toString()
            val novoValorPosit1 = valorInicialPosit1.toInt() + 1
            placarFut1.text = novoValorPosit1.toString()
        }

        botaoNegat1.setOnClickListener {
            val valorInicialNegat1 = placarFut1.text.toString()
            val novoValorNegat1 = valorInicialNegat1.toInt() - 1
            placarFut1.text = novoValorNegat1.toString()
        }

        botaoPosit2.setOnClickListener {
            val valorInicialPosit2 = placarFut2.text.toString()
            val novoValorPosit2 = valorInicialPosit2.toInt() + 1
            placarFut2.text = novoValorPosit2.toString()
        }

        botaoNegat2.setOnClickListener {
            val valorInicialNegat2 = placarFut2.text.toString()
            val novoValorNegat2 = valorInicialNegat2.toInt() - 1
            placarFut2.text = novoValorNegat2.toString()
        }

        botaoFutFinal.setOnClickListener {

            val valorFinal1 = placarFut1.text.toString()
            val valorFinal2 = placarFut2.text.toString()


            if (valorFinal1 > valorFinal2){

                Toast.makeText(this, "Time 1 ganhou!", Toast.LENGTH_SHORT).show()

                placarFut1.text = "0"
                placarFut2.text = "0"

            }else if (valorFinal2 > valorFinal1){

            Toast.makeText(this, "Time 2 ganhou!", Toast.LENGTH_SHORT).show()

            placarFut1.text = "0"
            placarFut2.text = "0"

            }else if (valorFinal1 == valorFinal2){

                Toast.makeText(this, "EMPATE!", Toast.LENGTH_SHORT).show()

                placarFut1.text = "0"
                placarFut2.text = "0"

            }

        }

    }
}
