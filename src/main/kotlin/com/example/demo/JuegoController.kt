package com.example.demo

import com.google.gson.Gson
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController

class JuegoController {

    var numAleatorio:Int=0

    lateinit var juego:Juego

    @GetMapping("PREGUNTA_ALEATORIA")

    fun getPregunta(): Juego{
        this.numAleatorio = Random.nextInt(JuegoRepository.listaPreguntas.size)
         juego = JuegoRepository.listaPreguntas.get(numAleatorio)

        return juego
    }





}
