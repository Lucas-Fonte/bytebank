package com.study.bank

import com.study.bank.core.useCase.AddBalance
import com.study.bank.core.useCase.SubtractBalance
import com.study.bank.domain.model.Account

fun main() {
    println("Hello Bank App")

    val addBalance = AddBalance()
    val subtractBalance = SubtractBalance()

    val myAccount = Account(
        "Lucas Fonte",
    )

    println("Holder: ${myAccount.holder}")
    println("number: ${myAccount.number}")
    println("balance: ${myAccount.balance}")
}
