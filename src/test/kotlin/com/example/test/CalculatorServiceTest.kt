package com.example.test

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName

class CalculatorServiceTests : AnnotationSpec() {

    private lateinit var calculatorService: CalculatorService

    @BeforeEach
    fun setUp() {
        calculatorService = CalculatorService()
    }

    @Test
    @DisplayName("두 수를 더한 값을 얻는다.")
    fun testAddition() {
        val result = calculatorService.add(2, 3)
        result shouldBe 5
    }

    @Test
    @DisplayName("두 수를 뺀 값을 얻는다.")
    fun testSubtraction() {
        val result = calculatorService.subtract(5, 3)
        result shouldBe 2
    }
}
