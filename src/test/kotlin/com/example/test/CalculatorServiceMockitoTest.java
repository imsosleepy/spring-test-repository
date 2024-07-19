package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculatorServiceMockitoTest {

    private final CalculatorService calculatorService = Mockito.mock(CalculatorService.class);

    @Test
    @DisplayName("두 수를 더한 값을 얻는다.")
    void shouldAddTwoNumbers() {
        when(calculatorService.add(5, 3)).thenReturn(8);

        int result = calculatorService.add(5, 3);

        assertEquals(8, result);

        verify(calculatorService).add(5, 3);
    }

    @Test
    @DisplayName("두 수를 뺀 값을 얻는다.")
    void shouldSubtractTwoNumbers() {
        when(calculatorService.subtract(10, 4)).thenReturn(6);

        int result = calculatorService.subtract(10, 4);

        assertEquals(6, result);

        verify(calculatorService).subtract(10, 4);
    }
}
