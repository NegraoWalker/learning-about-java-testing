package org.walker.math;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test math operations in SimpleMath Class")
class SimpleMathTest3 {

    @DisplayName("Test firstNumber/secondNumber = expected")
    @ParameterizedTest
    @CsvSource({"6.2, 2, 3.1","71, 14, 5.07","18.3, 3.1, 5.90"})
    public void testOperationDiv(double firstNumber, double secondNumber, double expected){
        SimpleMath math = new SimpleMath();
        Double actual = math.division(firstNumber, secondNumber);
        assertEquals(expected,actual,2D);
    }

}