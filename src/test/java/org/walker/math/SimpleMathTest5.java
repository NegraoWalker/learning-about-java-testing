package org.walker.math;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Test math operations in SimpleMath Class")
class SimpleMathTest5 {

    @ParameterizedTest
    @ValueSource(strings = {"Pelé", "Senna", "Keith Moon"})
    void testValueSource(String firsName) {
        System.out.println(firsName);
        assertNotNull(firsName);
    }

}