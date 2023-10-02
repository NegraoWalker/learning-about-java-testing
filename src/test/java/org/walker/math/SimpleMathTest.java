package org.walker.math;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSumOperation(){
        SimpleMath math = new SimpleMath(); //Instanciando um objeto da classe SimpleMath
        double result = math.sum(6.2D,2D); //Chamando o método sum, passando dois parâmetros e armazenando o resultado
        assertEquals(8.2D,result); //Testando se o resultado é o esperado com a assertion
    }
}