package com.example.test

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorServiceMockKTest {

    private var calculatorService: CalculatorService = mockk()

    @Test
    fun `두 수를 더한 값을 얻는다`() {
        every { calculatorService.add(5, 3) } returns 8

        val result = calculatorService.add(5, 3)

        assertEquals(8, result)

        verify { calculatorService.add(5, 3) }
    }

    @Test
    fun `두 수를 뺀 값을 얻는다`() {
        every { calculatorService.subtract(10, 4) } returns 6

        val result = calculatorService.subtract(10, 4)

        assertEquals(6, result)

        verify { calculatorService.subtract(10, 4) }
    }
}
