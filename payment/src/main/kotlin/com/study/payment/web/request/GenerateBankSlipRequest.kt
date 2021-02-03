package com.study.payment.web.request

import java.math.BigDecimal
import java.util.*

data class GenerateBankSlipRequest(
    val brand: String,
    val model: String,
    val price: BigDecimal,
    val expDate: Date
)
