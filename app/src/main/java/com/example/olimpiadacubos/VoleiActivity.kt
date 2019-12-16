package com.example.olimpiadacubos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_volei.*

class VoleiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volei)

        placarvolei1.text = "0"
        placarvolei2.text = "0"

        val nomeDoTime1Volei = intent.getStringExtra("TIME1")
        val nomeDoTime2Volei = intent.getStringExtra("TIME2")

        nomeTime1Volei.text = nomeDoTime1Volei
        nomeTime2Volei.text = nomeDoTime2Volei

        var valorAtualVolei1 = 0
        var valorAtualVolei2 = 0

        botaoPosit2Volei.setOnClickListener {

            valorAtualVolei1 + 1
            placarvolei1.text = valorAtualVolei1.toString()
        }





    }
}
