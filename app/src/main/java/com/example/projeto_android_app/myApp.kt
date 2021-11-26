package com.example.projeto_android_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class myApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Receitas da vovó")
        setContentView(R.layout.myapp)
        val btnLogin = findViewById<Button>(R.id.bt_login)
        btnLogin.setOnClickListener() {
            irParaTelaLogin()
        }

    }

    private fun irParaTelaLogin() {
        val telaLogin = Intent(this, ListagemActivity::class.java)
        startActivity(telaLogin)
    }
}