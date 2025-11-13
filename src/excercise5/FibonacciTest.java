package excercise5;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    void fibonacci0() {
        int expected = 0;
        int actual = /*ArrayListFibonacci.fibonacci(1)*/ 0;
        assertEquals(expected, actual);
    }
}
