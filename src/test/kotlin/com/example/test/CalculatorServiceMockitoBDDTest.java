package com.example.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

public class CalculatorServiceMockitoBDDTest {

    @Mock
    private CalculatorService calculatorService;

    public CalculatorServiceMockitoBDDTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldAddTwoNumbers() {
        // given
        given(calculatorService.add(5, 3)).willReturn(8);

        // when
        int result = calculatorService.add(5, 3);

        // then
        assertThat(result).isEqualTo(8);
        then(calculatorService).should().add(5, 3);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        // given
        given(calculatorService.subtract(10, 4)).willReturn(6);

        // when
        int result = calculatorService.subtract(10, 4);

        // then
        assertThat(result).isEqualTo(6);
        then(calculatorService).should().subtract(10, 4);
    }
}
