package org.walker.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class ArraysCompareTest {
    @Test
    void testArrays(){
        int [] numbers = {25,8,21,32,3};
        int [] expectedNumbers = {3,8,21,25,32};

        Arrays.sort(numbers);
        assertArrayEquals(numbers,expectedNumbers);

    }
}
