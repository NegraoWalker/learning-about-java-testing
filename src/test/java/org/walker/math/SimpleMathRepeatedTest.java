package org.walker.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleMathRepeatedTest {
    @RepeatedTest(value = 4,name = "{displayName}.repetition " + "{currentRepetition} of {totalRepetitions}")
    @DisplayName("Test division by zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(RepetitionInfo repetitionInfo, TestInfo testInfo) {
        System.out.println("Repetition n° " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running: " + testInfo.getTestMethod().get().getName());
        SimpleMath math = new SimpleMath();
        assertThrows(ArithmeticException.class,()-> {math.division(6.2D,0.0D);});
    }
}
