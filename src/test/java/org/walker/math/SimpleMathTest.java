package org.walker.math;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    public void testOperationAddition(){
        SimpleMath math = new SimpleMath(); //Instanciando um objeto da classe SimpleMath
        double result = math.addition(6.2D,2D); //Chamando o método sum, passando dois parâmetros e armazenando o resultado
        assertEquals(8.2D,result); //Testando se o resultado é o esperado com a assertion
    }

    @Test
    public void testOperationSub(){
        SimpleMath math = new SimpleMath();
        double result = math.subtraction(6.2D,2D);
        assertEquals(4.2D,result);
    }
    @Test
    public void testOperationMul(){
        SimpleMath math = new SimpleMath();
        double result = math.multiplication(6.2D,2D);
        assertEquals(12.4D,result);
    }
    @Test
    public void testOperationDiv(){
        SimpleMath math = new SimpleMath();
        double result = math.division(6.2D,2D);
        assertEquals(3.1D,result);
    }
    @Test
    public void testOperationMean(){
        SimpleMath math = new SimpleMath();
        double result = math.mean(6.2D,2D);
        assertEquals(4.1D,result);
    }
    @Test
    public void testOperationSquareRoot(){
        SimpleMath math = new SimpleMath();
        double result = math.squareRoot(4.4);
        assertEquals(2.0976176963403033D,result);
    }
}