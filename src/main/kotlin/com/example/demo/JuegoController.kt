package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController

class JuegoController {

    @GetMapping("Pregunta/{id}")

    fun getRespuestaCorrecta(@PathVariable id: Int) : String {
        return if (id < JuegoRepository.listaPreguntas.size)
            JuegoRepository.listaPreguntas[id].toString()
        else
            "Esta Pregunta no existe"
    }
}