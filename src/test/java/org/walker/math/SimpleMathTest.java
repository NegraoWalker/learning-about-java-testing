package org.walker.math;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in SimpleMath Class")
class SimpleMathTest {

    @BeforeAll
    static void setup(){
        System.out.println("Testing method with annotation @beforeAll!!");
    }
    @AfterAll
    static void cleanup(){
        System.out.println("Testing method with annotation @afterAll!!");
    }
    @BeforeEach
    void beforeEachMethod(){
        System.out.println("Testing method with annotation @beforeEach!!");
    }
    @AfterEach
    void afterEachMethod(){
        System.out.println("Testing method with annotation @afterEach!!");
    }



    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    public void testOperationAddition_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo(){
        System.out.println("Test 6.2 + 2 = 8.2");
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
        System.out.println("Test 6.2 - 2 = 4.2");
        SimpleMath math = new SimpleMath();
        double result = math.subtraction(6.2D,2D);
        assertEquals(4.2D,result);
    }
    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    public void testOperationMul_When_SixDotTwoIsMultipliedByTwo_ShouldReturnTwelveDotFour(){
        System.out.println("Test 6.2 * 2 = 12.4");
        SimpleMath math = new SimpleMath();
        double result = math.multiplication(6.2D,2D);
        assertEquals(12.4D,result);
    }
    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    public void testOperationDiv_When_SixDotTwoIsDividedByTwo_ShouldReturnThreeDotOne(){
        System.out.println("Test 6.2 / 2 = 3.1");
        SimpleMath math = new SimpleMath();
        double result = math.division(6.2D,2D);
        assertEquals(3.1D,result);
    }
    @Test
    @DisplayName("Test (6.2 + 2)/2 = 4.1")
    public void testOperationMean_When_SixDotTwoByTwo_ShouldReturnFourDotOne(){
        System.out.println("Test (6.2 + 2)/2 = 4.1");
        SimpleMath math = new SimpleMath();
        double result = math.mean(6.2D,2D);
        assertEquals(4.1D,result);
    }
    @Test
    @DisplayName("Test SquareRoot(81) = 9")
    public void testOperationSquareRoot_When_ValueIsEightyOne_ShouldReturnNine(){
        System.out.println("Test SquareRoot(81) = 9");
        SimpleMath math = new SimpleMath();
        double result = math.squareRoot(81);
        assertEquals(9,result);
    }

//    @Disabled
//    @Test
//    @DisplayName("Test division by zero")
//    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
//        fail();
//    }

}