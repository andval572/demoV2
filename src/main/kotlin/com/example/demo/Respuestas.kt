package com.example.demo

import com.google.gson.Gson

data class Respuestas (var id:Int,var respuesta:String){

    override fun toString(): String {
        val gson = Gson()
        return gson.toJson(this)
    }

}

