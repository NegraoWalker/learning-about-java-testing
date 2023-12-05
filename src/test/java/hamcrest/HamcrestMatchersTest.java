package hamcrest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {
    @Test
    public void testHamcrestMatchers(){

        List<Integer> scores = Arrays.asList(99, 100, 101, 105);


        assertThat(scores, hasSize(4)); //hasSize(Tem tamanho)
        // assertThat(scores, hasItems(23, 99, 100));
        assertThat(scores, hasItems(99, 100));
        assertThat(scores, everyItem(greaterThan(90))); //to-do item(maior que)

        // Check Strings
        assertThat("", is(emptyString()));
        assertThat(null, is(emptyOrNullString()));

        // Arrays
        Integer[] myArray = {1, 2, 3};

        assertThat(myArray, arrayWithSize(3));
        assertThat(myArray, arrayContaining(1, 2, 3));
        assertThat(myArray, arrayContainingInAnyOrder(3, 2, 1));
    }
}
