package org.walker.method.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(1)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderTestForm3 {
    @Test
    @Order(5)
    void test1(){
        System.out.println("Running test 1! ");
    }
    @Order(2)
    @Test
    void test2(){
        System.out.println("Running test 2! ");
    }
    @Order(1)
    @Test
    void test5(){
        System.out.println("Running test 5! ");
    }
    @Order(4)
    @Test
    void test4(){
        System.out.println("Running test 4! ");
    }
    @Order(3)
    @Test
    void test3(){
        System.out.println("Running test 3! ");
    }
}
