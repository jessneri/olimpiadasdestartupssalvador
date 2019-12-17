package com.example.olimpiadacubos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_volei.*

class VoleiActivity : AppCompatActivity() {

    var valorAtualVolei1 = 0
    var valorAtualVolei2 = 0

    var finalSet1 = 0
    var finalSet2 = 0

    var nomeDoTime1Volei = ""
    var nomeDoTime2Volei = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volei)


        placarvolei1.text = "0"
        placarvolei2.text = "0"

        placarSetTime1.text = "0"
        placarSetTime2.text = "0"

        nomeDoTime1Volei = intent.getStringExtra("TIME1") ?: "Time desconhecido"
        nomeDoTime2Volei = intent.getStringExtra("TIME2") ?: "Time desconhecido"

        nomeTime1Volei.text = nomeDoTime1Volei
        nomeTime2Volei.text = nomeDoTime2Volei

        botaoPosit1Volei.setOnClickListener {

            valorAtualVolei1 += 1
            placarvolei1.text = valorAtualVolei1.toString()
            verificarFimDeSet()
        }
        botaoNegat1Volei.setOnClickListener {

            valorAtualVolei1 -= 1
            placarvolei1.text = valorAtualVolei1.toString()
        }

        botaoPosit2Volei.setOnClickListener {

            valorAtualVolei2 += 1
            placarvolei2.text = valorAtualVolei2.toString()
            verificarFimDeSet()
        }
        botaoNegat2Volei.setOnClickListener {

            valorAtualVolei2 -= 1
            placarvolei2.text = valorAtualVolei2.toString()
        }
    } //ACTIVITY

    fun verificarFimDeSet() {
        if (finalSet1 == 1 && finalSet2 == 1){

            if (valorAtualVolei1 >= 15 && valorAtualVolei1 - valorAtualVolei2 >= 2){
                Toast.makeText(this, "$nomeDoTime1Volei Venceu!", Toast.LENGTH_LONG).show()

                placarvolei1.text = "0"
                placarvolei2.text = "0"
                valorAtualVolei1 = 0
                valorAtualVolei2 = 0

                placarSetTime1.text = "0"
                placarSetTime2.text = "0"
                finalSet1 = 0
                finalSet2 = 0


            } else if (valorAtualVolei2 >=15 && valorAtualVolei2 - valorAtualVolei1 >= 2 ){
                Toast.makeText(this, "$nomeDoTime2Volei Venceu!", Toast.LENGTH_LONG).show()

                placarvolei1.text = "0"
                placarvolei2.text = "0"
                valorAtualVolei1 = 0
                valorAtualVolei2 = 0

                placarSetTime1.text = "0"
                placarSetTime2.text = "0"
                finalSet1 = 0
                finalSet2 = 0

            }


        } else if (valorAtualVolei1 >= 21 && valorAtualVolei1 - valorAtualVolei2 >= 2){

            finalSet1 += 1
            placarSetTime1.text = finalSet1.toString()

            placarvolei1.text = "0"
            placarvolei2.text = "0"
            valorAtualVolei1 = 0
            valorAtualVolei2 = 0

            Toast.makeText(this, "$nomeDoTime1Volei venceu o set", Toast.LENGTH_SHORT).show()

        }else if (valorAtualVolei2 >= 21 && valorAtualVolei2 - valorAtualVolei1 >= 2){

            finalSet2 += 1
            placarSetTime2.text = finalSet2.toString()

            placarvolei1.text = "0"
            placarvolei2.text = "0"
            valorAtualVolei1 = 0
            valorAtualVolei2 = 0

            Toast.makeText(this, "$nomeDoTime2Volei venceu o set", Toast.LENGTH_SHORT).show()
        }

    }
} //FIM
