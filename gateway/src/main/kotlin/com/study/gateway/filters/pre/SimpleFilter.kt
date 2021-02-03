package com.study.gateway.filters.pre

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.LoggerFactory

class SimpleFilter: ZuulFilter() {

    val log = LoggerFactory.getLogger("com.study.gateway.filters.pre.SimpleFilter")

    override fun shouldFilter(): Boolean {
        return true
    }

    override fun run(): Any? {
        val request = RequestContext.getCurrentContext().request
        log.info("${request.getMethod()} request to ${request.getRequestURL().toString()}")

        return null
    }

    override fun filterType(): String {
        return "pre"
    }

    override fun filterOrder(): Int {
        return 1
    }
}