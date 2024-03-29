import org.example.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.factorial(4), DELTA);
    }

    @Test
    public void factorialFalsePositive() {
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.factorial(3), DELTA);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 8, calculator.powerF(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.powerF(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive() {
        assertNotEquals("Finding power for False Positive", 6, calculator.powerF(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.powerF(2, 3), DELTA);
    }

    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive() {
        assertNotEquals("Finding natural log for False Positive", 6, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive() {
        assertEquals("Finding square root for True Positive", 2, calculator.squareroot(4.0), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.squareroot(1.0), DELTA);
    }

    @Test
    public void sqrootFalsePositive() {
        assertNotEquals("Finding square root for False Positive", 1, calculator.squareroot(3.0), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.squareroot(4.0), DELTA);

    }
}