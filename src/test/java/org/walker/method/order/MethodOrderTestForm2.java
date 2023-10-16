package org.walker.method.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(3)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderTestForm2 {
    @Test
    void test1(){
        System.out.println("Running test 1! ");
    }
    @Test
    void test2(){
        System.out.println("Running test 2! ");
    }
    @Test
    void test5(){
        System.out.println("Running test 5! ");
    }
    @Test
    void test4(){
        System.out.println("Running test 4! ");
    }
    @Test
    void test3(){
        System.out.println("Running test 3! ");
    }
}
