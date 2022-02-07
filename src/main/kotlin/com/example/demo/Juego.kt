package com.example.demo

import com.google.gson.Gson


data class Juego(var id: Int,
                 var pregunta: String,
                 var a: String,
                 var b: String,
                 var c: String,
                 var d: String){

        override fun toString(): String {
            val gson = Gson()
            return gson.toJson(this)
        }
}
