package com.example.pokemonapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapp.PokemonModelRespose
import com.example.pokemonapp.R
import com.example.pokemonapp.mockPokemonResponse
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class PokemonCardAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val itemPoke : PokemonModelRespose = mockPokemonResponse

    override fun getItemCount(): Int {
        return itemPoke.listPokemon.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val cardPoke = LayoutInflater.from(parent.context).inflate(R.layout.card_pokemon_list,parent,false)
        return pokeDescription(cardPoke)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentItem = itemPoke.listPokemon[position]
        if (holder is pokeDescription){
            if (currentItem.type.contains("Fire")){
                holder.txtName.text = currentItem.name
                holder.txtType.text = currentItem.type
                holder.txtWeaknesses.text = currentItem.weaknesses
                holder.btnAqui.visibility = View.GONE
                val formatDate = DateTimeFormatter.ofPattern("HH:mm EEEE, d.MM.yyyy", Locale.getDefault())
                val dateNew = LocalDateTime.parse(currentItem.date)
                holder.date.text = formatDate.format(dateNew).toString()
            }else{
                holder.txtName.text = currentItem.name
                holder.txtType.text = currentItem.type
                holder.txtWeaknesses.text = currentItem.weaknesses
                val formatDate = DateTimeFormatter.ofPattern("HH:mm EEEE, d.MM.yyyy", Locale.getDefault())
                val dateNew = LocalDateTime.parse(currentItem.date)
                holder.date.text = formatDate.format(dateNew).toString()
            }
        }


    }
    class pokeDescription(pokeView: View):RecyclerView.ViewHolder(pokeView){
        val txtName:TextView = pokeView.findViewById(R.id.txt_name_pokemon)
        val txtType:TextView = pokeView.findViewById(R.id.txt_type)
        val txtWeaknesses : TextView = pokeView.findViewById(R.id.txt_weaknesses)
        val btnAqui : Button = pokeView.findViewById(R.id.btn_aqui)
        val date: TextView = pokeView.findViewById(R.id.txt_date)

    }

}
