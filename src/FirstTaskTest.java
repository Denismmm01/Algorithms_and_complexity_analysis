import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstTaskTest {

    @Test
    void testBaseCase() {
        assertEquals(1, FirstTask.countDigits(0));
        assertEquals(1, FirstTask.countDigits(7));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRecursiveCase(int n, int expected) {
        assertEquals(expected, FirstTask.countDigits(n));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(7, 1),
                Arguments.of(572, 3),
                Arguments.of(1000, 4),
                Arguments.of(42, 2),
                Arguments.of(123456, 6)
        );
    }

    @Test
    void testNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FirstTask.countDigits(-5));
        assertThrows(IllegalArgumentException.class, () -> FirstTask.countDigits(-1));
    }
}