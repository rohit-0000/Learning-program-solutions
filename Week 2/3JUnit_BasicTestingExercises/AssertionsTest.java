import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // ✅ Assert equals: checks value equality
        assertEquals("Sum should be 5", 5, 2 + 3);

        // ✅ Assert true: checks if the condition is true
        assertTrue("5 should be greater than 3", 5 > 3);

        // ✅ Assert false: checks if the condition is false
        assertFalse("5 is not less than 3", 5 < 3);

        // ✅ Assert null: checks if value is null
        assertNull("Value should be null", null);

        // ✅ Assert not null: checks if value is not null
        assertNotNull("Object should not be null", new Object());
    }
}
