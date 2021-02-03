package com.study.gateway

import com.study.gateway.filters.pre.SimpleFilter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean

@EnableZuulProxy
@SpringBootApplication
class GatewayApplication

fun main(args: Array<String>){
    runApplication<GatewayApplication>(*args)
}

@Bean
fun simpleFilter(): SimpleFilter = SimpleFilter()