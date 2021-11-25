package com.example.projeto_android_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class myApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Receitas da vovó")
        setContentView(R.layout.myapp)
    }
}