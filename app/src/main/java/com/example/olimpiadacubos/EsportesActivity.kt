package com.example.olimpiadacubos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_esportes.*

class EsportesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esportes)

        btFutebol.setOnClickListener {

            val nomeDoTime1 = intent.getStringExtra("TIME1")
            val nomeDoTime2 = intent.getStringExtra("TIME2")

            val intent = Intent(this, FutebolActivity::class.java)
            intent.putExtra("TIME1", nomeDoTime1)
            intent.putExtra("TIME2", nomeDoTime2)
            startActivity(intent)

        } //fim btFutebol

        btBasquete.setOnClickListener {
            val nomeDoTime1 = intent.getStringExtra("TIME1")
            val nomeDoTime2 = intent.getStringExtra("TIME2")

            val intent = Intent(this, BasqueteActivity::class.java)
            intent.putExtra("TIME1", nomeDoTime1)
            intent.putExtra("TIME2", nomeDoTime2)
            startActivity(intent)

        }//fim btBasquete

        btVolei.setOnClickListener {
            val nomeDoTime1 = intent.getStringExtra("Time1")
            val nomeDoTime2 = intent.getStringExtra("TIME2")

            val intent = Intent(this, VoleiActivity::class.java)
            intent.putExtra("TIME1", nomeDoTime1)
            intent.putExtra("TIME2", nomeDoTime2)
            startActivity(intent)

        }//fim btVolei

        btTenis.setOnClickListener {
            val intent = Intent(this, TenisActivity::class.java)
            startActivity(intent)

        }//fim btTenis


    }
}
