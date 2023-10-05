package org.walker.math;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in SimpleMath Class")
class SimpleMathTest {


    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    public void testOperationAddition_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo(){
        //BDD Style - Given:
        SimpleMath math = new SimpleMath();
        //BDD Style - When:
        double result = math.addition(6.2D,2D);
        //BDD Style - Then:
        assertEquals(8.2D,result);
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    public void testOperationSub_When_SixDotTwoIsSubtractedByTwo_ShouldReturnFourDotTwo(){
        SimpleMath math = new SimpleMath();
        double result = math.subtraction(6.2D,2D);
        assertEquals(4.2D,result);
    }
    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    public void testOperationMul_When_SixDotTwoIsMultipliedByTwo_ShouldReturnTwelveDotFour(){
        SimpleMath math = new SimpleMath();
        double result = math.multiplication(6.2D,2D);
        assertEquals(12.4D,result);
    }
    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    public void testOperationDiv_When_SixDotTwoIsDividedByTwo_ShouldReturnThreeDotOne(){
        SimpleMath math = new SimpleMath();
        double result = math.division(6.2D,2D);
        assertEquals(3.1D,result);
    }
    @Test
    @DisplayName("Test (6.2 + 2)/2 = 4.1")
    public void testOperationMean_When_SixDotTwoByTwo_ShouldReturnFourDotOne(){
        SimpleMath math = new SimpleMath();
        double result = math.mean(6.2D,2D);
        assertEquals(4.1D,result);
    }
    @Test
    @DisplayName("Test SquareRoot(81) = 9")
    public void testOperationSquareRoot_When_ValueIsEightyOne_ShouldReturnNine(){
        SimpleMath math = new SimpleMath();
        double result = math.squareRoot(81);
        assertEquals(9,result);
    }

    @Disabled
    @Test
    @DisplayName("Test division by zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        fail();
    }

}