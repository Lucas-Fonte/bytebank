package com.study.bank.core.useCase

import com.study.bank.domain.model.Account

class SubtractBalance : BalanceOperator {
    override fun execute(account: Account, amount: Double): Account {
        val newBalance = account.balance - amount
        account.operate(newBalance)

        return account
    }
}