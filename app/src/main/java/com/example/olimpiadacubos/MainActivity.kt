package com.example.olimpiadacubos
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        avancarTela1.setOnClickListener {
            val time1 = nomeTime1.text.toString().trim()
            val time2 = nomeTime2.text.toString().trim()

            if(time1.isEmpty() || time2.isEmpty()){
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, EsportesActivity::class.java)
            intent.putExtra("TIME1", time1)
            intent.putExtra("TIME2", time2)
            startActivity(intent)
        }
    }
}