import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SecondTaskTest {

    @Test
    void testBaseCase() {
        assertEquals(10, SecondTask.signal(10, -2, 0));
        assertEquals(5, SecondTask.signal(5, 2, 0));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testRecursiveCase(int first, int difference, int n, int expected) {
        assertEquals(expected, SecondTask.signal(first, difference, n));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(12, -3, 4, 0),
                Arguments.of(5, 2, 3, 11),
                Arguments.of(10, 5, 1, 15),
                Arguments.of(42, 0, 10, 42)
        );
    }

    @Test
    void testNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> SecondTask.signal(10, 2, -1));
    }
}