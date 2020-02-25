
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {
    @Test
    void Add() {
        assertEquals(7,Calculator.add(1,2,4));
    }
    @Test
    void multiply() {
        assertEquals(9,Calculator.multiply(3,3));
    }
}