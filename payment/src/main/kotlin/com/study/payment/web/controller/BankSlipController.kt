package com.study.payment.web.controller

import com.study.payment.service.BankSlipService
import com.study.payment.web.request.GenerateBankSlipRequest
import com.study.payment.web.response.GenerateBankSlipResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("payment/bank-slip")
class BankSlipController(private val bankSlipService: BankSlipService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun generateBankSlip(@RequestBody request: GenerateBankSlipRequest): GenerateBankSlipResponse = bankSlipService.generateBankSlip(request)
}