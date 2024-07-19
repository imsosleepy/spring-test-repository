package com.example.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class CalculatorController(private val calculatorService: CalculatorService) {

    @GetMapping("/add")
    fun add(@RequestParam a: Int, @RequestParam b: Int): Int {
        return calculatorService.add(a, b)
    }

    @GetMapping("/subtract")
    fun subtract(@RequestParam a: Int, @RequestParam b: Int): Int {
        return calculatorService.subtract(a, b)
    }
}