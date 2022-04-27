package com.study.bank.core.useCase

import com.study.bank.domain.model.Account

interface BalanceOperator {
    fun execute(account: Account, amount: Double): Account
}