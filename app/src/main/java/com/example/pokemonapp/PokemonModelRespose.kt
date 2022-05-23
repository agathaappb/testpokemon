package com.example.pokemonapp

data class PokemonModelRespose(
    val listPokemon: List<DetailsPokemon>
)

data class DetailsPokemon(
    val name : String,
    val type : String,
    val weaknesses : String,
    val date : String
)

val mockPokemonResponse = PokemonModelRespose(
    listOf<DetailsPokemon>(
    DetailsPokemon(
        name = "Bulbasaur",
        type = "Grass-Poison",
        weaknesses = "Fire-Psychic-Flying-Ice",
        date= "2021-12-07T14:00:00"),
    DetailsPokemon(
        name = "Ivysaur",
        type = "Grass-Poison",
        weaknesses = "Fire-Psychic-Flying-Ice",
        date= "2021-12-07T14:00:00"),
    DetailsPokemon(
        name = "Venusaur",
        type = "Grass-Poison",
        weaknesses = "ire-Psychic-Flying-Ice",
        date= "2021-12-07T14:00:00"),
   DetailsPokemon(
        name = "Charmander",
        type = "Fire",
        weaknesses = "Water-Ground-Rock",
        date= "2021-12-07T14:00:00"),
   DetailsPokemon(
        name = "Charmeleon",
        type = "Fire",
        weaknesses = "Water-Ground-Rock",
        date= "2021-12-07T14:00:00"),
   DetailsPokemon(
        name = "Charizard",
        type = "Fire-Flying",
        weaknesses = "Water-Electric-Rock",
        date= "2021-12-07T14:00:00")
    )
)