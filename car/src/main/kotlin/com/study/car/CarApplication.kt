package com.study.car

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.web.bind.annotation.CrossOrigin

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
class CarApplication

fun main(args: Array<String>){
    runApplication<CarApplication>(*args)
}

