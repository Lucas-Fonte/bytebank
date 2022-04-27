package com.study.bank.core.useCase

import com.study.bank.domain.model.Account
import kotlin.test.Test
import kotlin.test.assertEquals

class SubtractBalanceTest {
    @Test
    fun `it should subtract balance given an account`() {
        val fakeAccount = Account(
            holder = "Fake holder",
        )

        val subtractBalance = SubtractBalance()
        subtractBalance.execute(fakeAccount, 10.0)
        assertEquals(fakeAccount.balance, -10.0)

    }
}