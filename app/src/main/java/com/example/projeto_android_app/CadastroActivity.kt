package com.example.projeto_android_app

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class CadastroActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro)
        setTitle("Receitas da vovo")

        val btn_cadastrar = findViewById<Button>(R.id.bt_cadastrar)

            btn_cadastrar.setOnClickListener(){
                mostrarAlerta()
            }

    }
    private fun mostrarAlerta(){
            val builder = MaterialAlertDialogBuilder(this)
            builder.setTitle("Cadastro")
            builder.setMessage("usuário cadastrado com sucesso")
            builder.setPositiveButton("ok",{ dialogInterface: DialogInterface, i: Int ->
                finish()
            })
        builder.show()
    }
}