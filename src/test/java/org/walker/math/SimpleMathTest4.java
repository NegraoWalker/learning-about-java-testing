package org.walker.math;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test math operations in SimpleMath Class")
class SimpleMathTest4 {

    @DisplayName("Test firstNumber/secondNumber = expected")
    @ParameterizedTest
    @CsvFileSource(resources = "/testDivision.csv")
    public void testOperationDiv(double firstNumber, double secondNumber, double expected){
        SimpleMath math = new SimpleMath();
        Double actual = math.division(firstNumber, secondNumber);
        assertEquals(expected,actual,2D);
    }

}