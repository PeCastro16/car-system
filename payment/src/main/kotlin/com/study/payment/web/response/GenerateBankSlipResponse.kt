package com.study.payment.web.response

import java.math.BigDecimal
import java.util.*

data class GenerateBankSlipResponse(
    val bankSlipCode: String,
    val expDate: Date,
    val price: BigDecimal
)
