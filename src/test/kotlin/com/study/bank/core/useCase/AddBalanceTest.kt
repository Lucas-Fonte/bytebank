package com.study.bank.core.useCase

import com.study.bank.domain.model.Account
import kotlin.test.Test
import kotlin.test.assertEquals

class AddBalanceTest {
    @Test
    fun `it should add balance given an account`() {
        val fakeAccount = Account(
            holder = "Fake holder",
        )

        val addBalance = AddBalance()
        addBalance.execute(fakeAccount, 10.0)
        assertEquals(fakeAccount.balance, 10.0)

    }
}