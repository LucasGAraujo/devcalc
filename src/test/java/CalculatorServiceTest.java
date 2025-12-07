import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final com.example.devcalc.service.CalculatorService calculatorService = new com.example.devcalc.service.CalculatorService();

    @Test
    void testAdd() {
        double result = calculatorService.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        double result = calculatorService.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiply() {
        double result = calculatorService.multiply(7, 6);
        assertEquals(42, result);
    }

    @Test
    void testDivide() {
        double result = calculatorService.divide(20, 4);
        assertEquals(5, result);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(10, 0);
        });
    }
}
