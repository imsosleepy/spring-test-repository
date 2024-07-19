package com.example.test

import org.springframework.stereotype.Service

@Service
class CalculatorService {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }
}
