package org.walker.math;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    public void testOperationAddition_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo(){
        SimpleMath math = new SimpleMath(); //Instanciando um objeto da classe SimpleMath
        double result = math.addition(6.2D,2D); //Chamando o método sum, passando dois parâmetros e armazenando o resultado
        assertEquals(8.2D,result); //Testando se o resultado é o esperado com a assertion
    }

    @Test
    public void testOperationSub_When_SixDotTwoIsSubtractedByTwo_ShouldReturnFourDotTwo(){
        SimpleMath math = new SimpleMath();
        double result = math.subtraction(6.2D,2D);
        assertEquals(4.2D,result);
    }
    @Test
    public void testOperationMul_When_SixDotTwoIsMultipliedByTwo_ShouldReturnTwelveDotFour(){
        SimpleMath math = new SimpleMath();
        double result = math.multiplication(6.2D,2D);
        assertEquals(12.4D,result);
    }
    @Test
    public void testOperationDiv_When_SixDotTwoIsDividedByTwo_ShouldReturnThreeDotOne(){
        SimpleMath math = new SimpleMath();
        double result = math.division(6.2D,2D);
        assertEquals(3.1D,result);
    }
    @Test
    public void testOperationMean_When_SixDotTwoByTwo_ShouldReturnFourDotOne(){
        SimpleMath math = new SimpleMath();
        double result = math.mean(6.2D,2D);
        assertEquals(4.1D,result);
    }
    @Test
    public void testOperationSquareRoot_When_ValueIsEightyOne_ShouldReturnNine(){
        SimpleMath math = new SimpleMath();
        double result = math.squareRoot(81);
        assertEquals(9,result);
    }

    @Test
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        fail();
    }

}