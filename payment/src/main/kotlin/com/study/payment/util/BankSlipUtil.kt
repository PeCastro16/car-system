package com.study.payment.util

import br.com.caelum.stella.boleto.*
import br.com.caelum.stella.boleto.bancos.BancoDoBrasil
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*


class BankSlipUtil {

    fun generate(expDate: Date, price: BigDecimal): Boleto{

        val formatter = SimpleDateFormat("yyyy-MM-dd")
        val expDateStr = formatter.format(expDate).split("-")

        val datas = Datas.novasDatas()
            .comDocumento(1, 5, 2008)
            .comProcessamento(1, 5, 2008)
            .comVencimento(Integer.parseInt(expDateStr[2]),
                Integer.parseInt(expDateStr[1]), Integer.parseInt(expDateStr[0]))

        val enderecoBeneficiario = Endereco.novoEndereco()
            .comLogradouro("Av das Empresas, 555")
            .comBairro("Bairro Grande")
            .comCep("01234-555")
            .comCidade("São Paulo")
            .comUf("SP")

        //Quem emite o boleto
        val beneficiario = Beneficiario.novoBeneficiario()
            .comNomeBeneficiario("Fulano de Tal")
            .comAgencia("1824").comDigitoAgencia("4")
            .comCodigoBeneficiario("76000")
            .comDigitoCodigoBeneficiario("5")
            .comNumeroConvenio("1207113")
            .comCarteira("18")
            .comEndereco(enderecoBeneficiario)
            .comNossoNumero("9000206")

        val enderecoPagador = Endereco.novoEndereco()
            .comLogradouro("Av dos testes, 111 apto 333")
            .comBairro("Bairro Teste")
            .comCep("01234-111")
            .comCidade("São Paulo")
            .comUf("SP")

        //Quem paga o boleto
        val pagador = Pagador.novoPagador()
            .comNome("Fulano da Silva")
            .comDocumento("111.222.333-12")
            .comEndereco(enderecoPagador)

        val banco: Banco = BancoDoBrasil()

        return Boleto.novoBoleto()
            .comBanco(banco)
            .comDatas(datas)
            .comBeneficiario(beneficiario)
            .comPagador(pagador)
            .comValorBoleto(price.toString())
            .comNumeroDoDocumento("1234")
            .comInstrucoes("instrucao 1", "instrucao 2", "instrucao 3", "instrucao 4", "instrucao 5")
            .comLocaisDePagamento("local 1", "local 2")
    }
}