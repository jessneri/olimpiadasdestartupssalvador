package com.example.olimpiadacubos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tenis.*

class TenisActivity : AppCompatActivity() {

    var valorAtualTenis1 = 0
    var valorAtualTenis2 = 0

    var finalSet1Tenis = 0
    var finalSet2Tenis = 0

    var nomeDoTime1Tenis = ""
    var nomeDoTime2Tenis = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenis)

        placartenis1.text = "0"
        placartenis2.text = "0"

        placarSetTime1Tenis.text = "0"
        placarSetTime2Tenis.text = "0"

        nomeDoTime1Tenis = intent.getStringExtra("TIME1") ?: "Time desconhecido"
        nomeDoTime2Tenis = intent.getStringExtra("TIME2") ?:  "Time desconhecido"

        nomeTime1Tenis.text = nomeDoTime1Tenis
        nomeTime2Tenis.text = nomeDoTime2Tenis



        botaoPosit1Tenis.setOnClickListener {

            valorAtualTenis1 += 1
            placartenis1.text = valorAtualTenis1.toString()
            verificarFimDeSetTenis()

        }
        botaoNegat1Tenis.setOnClickListener {

            valorAtualTenis1 -= 1
            placartenis1.text = valorAtualTenis1.toString()
        }

        botaoPosit2Tenis.setOnClickListener {

            valorAtualTenis2 += 1
            placartenis2.text = valorAtualTenis2.toString()
            verificarFimDeSetTenis()
        }
        botaoNegat2Tenis.setOnClickListener {

            valorAtualTenis2 -= 1
            placartenis2.text = valorAtualTenis2.toString()
        }


    }

    fun verificarFimDeSetTenis() {


                if (valorAtualTenis1 - valorAtualTenis2 >= 2 && valorAtualTenis1 >= 11) {
                    Toast.makeText(this, "$nomeDoTime1Tenis venceu o set", Toast.LENGTH_SHORT).show()

                    placartenis1.text = "0"
                    placartenis2.text = "0"
                    valorAtualTenis1 = 0
                    valorAtualTenis2 = 0

                    finalSet1Tenis +=1
                    placarSetTime1Tenis.text = finalSet1Tenis.toString()

                    verificarsets()


                } else if (valorAtualTenis2 - valorAtualTenis1 >= 2 && valorAtualTenis2 >= 11) {

                    Toast.makeText(this, "$nomeDoTime2Tenis venceu o set", Toast.LENGTH_SHORT).show()

                    placartenis1.text = "0"
                    placartenis2.text = "0"
                    valorAtualTenis1 = 0
                    valorAtualTenis2 = 0

                    finalSet2Tenis += 1
                    placarSetTime2Tenis.text = finalSet2Tenis.toString()

                    verificarsets()
                }


    }

    fun verificarsets (){
        if (finalSet1Tenis == 4){

            Toast.makeText(this, "$nomeDoTime1Tenis venceu!", Toast.LENGTH_SHORT).show()

            finalSet1Tenis = 0
            finalSet2Tenis = 0
            placarSetTime1Tenis.text = "0"
            placarSetTime2Tenis.text = "0"
            placartenis1.text = "0"
            placartenis2.text = "0"
            valorAtualTenis1 = 0
            valorAtualTenis2 = 0

        }else if (finalSet2Tenis == 4){
            Toast.makeText(this, "$nomeDoTime2Tenis venceu!", Toast.LENGTH_SHORT).show()

            finalSet1Tenis = 0
            finalSet2Tenis = 0
            placarSetTime1Tenis.text = "0"
            placarSetTime2Tenis.text = "0"
            placartenis1.text = "0"
            placartenis2.text = "0"
            valorAtualTenis1 = 0
            valorAtualTenis2 = 0
        }

    }
}
