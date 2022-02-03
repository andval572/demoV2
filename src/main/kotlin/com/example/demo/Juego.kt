package com.example.demo

import com.google.gson.Gson


data class Juego(var ID: Int,
                 var PREGUNTA: String,
                 var A: String,
                 var B: String,
                 var C: String,
                 var D: String){

        override fun toString(): String {
            val gson = Gson()
            return gson.toJson(this)
        }
}
