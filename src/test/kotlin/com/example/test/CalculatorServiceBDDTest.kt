package com.example.test

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify

class CalculatorServiceBDDTest : BehaviorSpec({

    val calculatorService = mockk<CalculatorService>()

    given("계산기 서비스가 주어졌을 때") {
        `when`("두 숫자를 더하면") {
            every { calculatorService.add(5, 3) } returns 8

            then("올바른 합계를 반환해야 한다") {
                val result = calculatorService.add(5, 3)
                result shouldBe 8

                verify { calculatorService.add(5, 3) }
            }
        }

        `when`("두 숫자를 빼면") {
            every { calculatorService.subtract(10, 4) } returns 6

            then("올바른 차이를 반환해야 한다") {
                val result = calculatorService.subtract(10, 4)
                result shouldBe 6

                verify { calculatorService.subtract(10, 4) }
            }
        }
    }
})
