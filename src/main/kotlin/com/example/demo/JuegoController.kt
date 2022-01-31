package com.example.demo

import com.google.gson.Gson
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController

class JuegoController {

    @GetMapping("PREGUNTA/{N}")

    fun getPregunta(@PathVariable N: Int) : String {
        return if (N < JuegoRepository1.listaPreguntas1.size)
            JuegoRepository1.listaPreguntas1[N-1].toString()
        else
            "Esta Pregunta no existe"
    }

    @GetMapping("PREGUNTA/{N}/{respuestacorrecta}")

    fun getRespuestaCorrecta(@PathVariable respuestacorrecta:String,@PathVariable N: Int ): String {

        var gson = Gson()
        var x=0
        var respuesta =""

        do {

            if (JuegoRepository.listaPreguntas[x]. N1 == N) {
                respuesta = if (JuegoRepository.listaPreguntas[N-1].Respuesta_es.contentEquals(respuestacorrecta)) {
                    println("ACERTO")
                    gson.toJson("ACERTO")
                } else {
                    println("INCORRECTO")
                    gson.toJson("INCORRECTO")
                }
            }

            x++

            }while(x<JuegoRepository.listaPreguntas.size)

            return respuesta
    }
}
