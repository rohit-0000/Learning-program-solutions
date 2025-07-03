import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    // Setup method: runs before each test
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator();  // Arrange
    }

    // Teardown method: runs after each test
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    public void testAddition() {
        // Act
        int result = calc.add(10, 5);

        // Assert
        assertEquals("10 + 5 should equal 15", 15, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calc.subtract(10, 5);

        // Assert
        assertEquals("10 - 5 should equal 5", 5, result);
    }
}
