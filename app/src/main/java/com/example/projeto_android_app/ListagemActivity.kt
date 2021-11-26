package com.example.projeto_android_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_android_app.adapter.AdapterReceitas
import com.example.projeto_android_app.model.Receitas

class ListagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listagem)
        setTitle("Receitas da Vovo")

        val rvReceitas = findViewById<RecyclerView>(R.id.rv_receitas)
        rvReceitas.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvReceitas.setHasFixedSize(true)
        val listaReceitas: MutableList<Receitas> = mutableListOf()
        val adapterReceitas  = AdapterReceitas(this,listaReceitas)
        rvReceitas.adapter = adapterReceitas
        val receita1 = Receitas("Bife a Milaneza", "Lorem ipsun dollor sit amen")
        listaReceitas.add(receita1)
        val receita2 = Receitas("Churrasco ", "Lorem ipsun dollor sit amen")
        listaReceitas.add(receita2)
        val receita3 = Receitas("Strogonoff de Frango ", "Lorem ipsun dollor sit amen")
        listaReceitas.add(receita3)
        val receita4 = Receitas("Strogonoff de carne ", "Lorem ipsun dollor sit amen")
        listaReceitas.add(receita4)

    }
}