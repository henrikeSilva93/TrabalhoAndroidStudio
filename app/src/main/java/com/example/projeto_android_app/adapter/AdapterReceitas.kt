package com.example.projeto_android_app.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_android_app.R
import com.example.projeto_android_app.model.Receitas

class AdapterReceitas(private val context: Context, val Receitas:MutableList<Receitas>): RecyclerView.Adapter<AdapterReceitas.ReceitaViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceitaViewHolder {
       val itemLista = LayoutInflater.from(context).inflate(R.layout.receitas,parent,false)
        val holder = ReceitaViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: ReceitaViewHolder, position: Int) {
        holder.titulo.text = Receitas[position].titulo
        holder.detalhes.text = Receitas[position].descricao
    }

    override fun getItemCount(): Int = Receitas.size


    inner class ReceitaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val titulo = itemView.findViewById<TextView>(R.id.list_titulo)
        val detalhes = itemView.findViewById<TextView>(R.id.list_detalhes)
    }
}