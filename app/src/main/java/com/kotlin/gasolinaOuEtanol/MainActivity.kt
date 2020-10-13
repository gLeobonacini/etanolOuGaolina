package com.kotlin.gasolinaOuEtanol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btComparar.setOnClickListener{
            when(tvPrecoEtanol.editText?.text.toString().toDouble()/tvPrecoGasolina.editText?.text.toString().toDouble() < 0.7) {
                true -> imResultado.setImageResource(R.drawable.abasteca_etanol)
                false -> imResultado.setImageResource(R.drawable.abasteca_gasolina)
            }
        }
    }
}