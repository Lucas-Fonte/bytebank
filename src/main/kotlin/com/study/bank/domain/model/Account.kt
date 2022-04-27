package com.study.bank.domain.model

import kotlin.random.Random

class Account(
    val holder: String,
) {
    val number: Int = Random.nextInt(0, 1000)
    var balance: Double = 0.0
        private set

    fun operate(newBalance: Double) {
        balance = newBalance
    }

}
