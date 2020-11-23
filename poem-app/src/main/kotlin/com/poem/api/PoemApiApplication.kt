package com.poem.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PoemApiApplication

fun main(args: Array<String>) {
    runApplication<PoemApiApplication>(*args)
}
