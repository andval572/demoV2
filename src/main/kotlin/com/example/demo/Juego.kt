package com.example.demo

import com.google.gson.Gson
import com.google.gson.JsonObject


data class Juego(var N1: Int, var PREGUNTA1:String, var A1: String, var B1: String, var C1: String, var D1: String, var Respuesta_es: String,
                ){

        override fun toString(): String {
            val gson = Gson()
            val json = gson.toJson(this)
            val jsonObject = JsonObject()
            return gson.toJson(this)
        }
}
