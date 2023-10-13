package org.walker.math;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test math operations in SimpleMath Class")
class SimpleMathTest2 {

    @DisplayName("Test firstNumber/secondNumber = expected")
    @ParameterizedTest
    @MethodSource("testDivisionInputParameters")
    public void testOperationDiv(double firstNumber, double secondNumber, double expected){
        SimpleMath math = new SimpleMath();
        Double actual = math.division(firstNumber, secondNumber);
        assertEquals(expected,actual,2D);
    }

    public static Stream<Arguments> testDivisionInputParameters() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(71D, 14D, 5.07D),
                Arguments.of(18.3, 3.1D, 5.90D)
        );
    }
}