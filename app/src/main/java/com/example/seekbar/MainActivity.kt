package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var seekBarEscala: SeekBar
    lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBarEscala = findViewById(R.id.seekBarEscala)
        textResultado = findViewById(R.id.textResultado)

        //Listener que vai ficar obsrevando e setando os valores do seekBar no textResultado
        seekBarEscala.setOnSeekBarChangeListener(object :OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (seekBar != null) {
                    textResultado.text = "Progresso: ${progress} / ${seekBar.max}"
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
//                textResultado.text = "onStartTrackingTouch"

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
//                textResultado.text = "onStopTrackingTouch"

            }
        })
    }
    fun recuperarProgresso(view: View){
        textResultado.text = "Escolhido: ${seekBarEscala.progress}"
    }
}