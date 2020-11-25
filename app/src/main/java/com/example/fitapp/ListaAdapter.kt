package com.example.fitapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_lista.view.*

class ListaAdapter(private val itens: List<Atividade>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val item = itens[position]
        val inflater = LayoutInflater.from(parent?.context)
        val view = inflater.inflate(R.layout.item_lista, parent, false)

        view.tipo_atividade.text = item.tipo
        view.titulo_atividade.text = item.titulo
        view.desc_atividade.text = item.descricao
        view.data_atividade.text = item.data

        return view
    }

    override fun getItem(position: Int): Any {
        return itens[position]
    }

    override fun getItemId(position: Int): Long {
        return itens[position].id.toLong()
    }

    override fun getCount(): Int {
        return itens.size
    }

}