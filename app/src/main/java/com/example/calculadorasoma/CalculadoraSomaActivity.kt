package com.example.calculadorasoma

import android.app.Activity
import android.os.Bundle
import android.util.Log

class CalculadoraSomaActivity : Activity() {
    override fun onCreate(bundle: Bundle?){
        super.onCreate(bundle)
        Log.v("CALCULADORA", "Activity criada onCreate()")
        setContentView(R.layout.calculadora_layout)
    }

    override fun onStart() {
        super.onStart()
        Log.v("CALCULADORA", "Activity iniciada onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.v("CALCULADORA", "Activity visivel onResume()")
    }
    override fun onPause(){
        super.onPause()
        Log.v("CALCULADORA", "Activity invisivel onPause()")
    }
    override fun onStop() {
        super.onStop()
        Log.v("CALCULADORA", "Activity parada onStop()")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.v("CALCULADORA", "Activity  destruida onDestroy()")
    }
}