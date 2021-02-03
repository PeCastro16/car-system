package com.study.payment.service

import com.study.payment.util.BankSlipUtil
import com.study.payment.web.request.GenerateBankSlipRequest
import com.study.payment.web.response.GenerateBankSlipResponse
import org.springframework.stereotype.Service
import java.util.*

@Service
class BankSlipService {
    fun generateBankSlip(generateBankSlipRequest: GenerateBankSlipRequest): GenerateBankSlipResponse{

        val bankSlip = BankSlipUtil().generate(generateBankSlipRequest.expDate, generateBankSlipRequest.price)

        return GenerateBankSlipResponse(bankSlip.codigoDeBarras,
            Date.from(bankSlip.datas.vencimento.toInstant()), bankSlip.valorBoleto)
    }
}