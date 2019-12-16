package com.example.olimpiadacubos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_basquete.*

class BasqueteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basquete)

        placarbasq1.text = "0"
        placarbasq2.text = "0"

        val nomeDoTime1Basq = intent.getStringExtra("TIME1")
        val nomeDoTime2Basq = intent.getStringExtra("TIME2")

        nomeTime1Basq.text = nomeDoTime1Basq
        nomeTime2Basq.text = nomeDoTime2Basq

        var valorAtualBasqTime1 = 0
        var valorAtualBasqTime2 = 0



        botaobasq2time1.setOnClickListener {

            valorAtualBasqTime1 += 2
            placarbasq1.text = valorAtualBasqTime1.toString()
        }

        botaobasq3time1.setOnClickListener {
            valorAtualBasqTime1 = valorAtualBasqTime1 + 3
            placarbasq1.text = valorAtualBasqTime1.toString()
        }

        botaobasqlancetime1.setOnClickListener {
            valorAtualBasqTime1 += 1
            placarbasq1.text = valorAtualBasqTime1.toString()

        }//fim Time 1

        botaobasq2time2.setOnClickListener {
            valorAtualBasqTime2 += 2
            placarbasq2.text = valorAtualBasqTime2.toString()

        }

        botaobasq3time2.setOnClickListener {

            valorAtualBasqTime2 += 3
            placarbasq2.text = valorAtualBasqTime2.toString()

        }

        botaobasqlancetime2.setOnClickListener {

            valorAtualBasqTime2 += 1
            placarbasq2.text = valorAtualBasqTime2.toString()

        } //fim time 2

        botaoBasqFinal.setOnClickListener {

            val valorFinalBasq1 = valorAtualBasqTime1.toString()
            val valorFinalBasq2 = valorAtualBasqTime2.toString()

            if(valorFinalBasq1 > valorFinalBasq2){
                Toast.makeText(this, "$nomeDoTime1Basq venceu!", Toast.LENGTH_SHORT).show()

                valorAtualBasqTime1 = 0
                valorAtualBasqTime2 = 0

                placarbasq1.text = "0"
                placarbasq2.text = "0"

            }else if (valorFinalBasq2 > valorFinalBasq1){
                Toast.makeText(this, "$nomeDoTime2Basq Venceu!", Toast.LENGTH_SHORT).show()

                valorAtualBasqTime1 = 0
                valorAtualBasqTime2 = 0

                placarbasq1.text = "0"
                placarbasq2.text = "0"

            }else{
                Toast.makeText(this, "Empate!", Toast.LENGTH_SHORT).show()

                valorAtualBasqTime1 = 0
                valorAtualBasqTime2 = 0

                placarbasq1.text = "0"
                placarbasq2.text = "0"

            }
        }
    }
}
