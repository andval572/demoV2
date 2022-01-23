package com.example.demo

import com.google.gson.Gson
import com.google.gson.JsonObject


data class Juego(var pregunta: String,
                 var A: String,
                 var B: String,
                 var C: String,
                 var D: String,
                 var Respuesta_es: String) {

        override fun toString(): String {
            val gson = Gson()
            val json = gson.toJson(this)
            val jsonObject = JsonObject()
            return gson.toJson(this)
        }
}
