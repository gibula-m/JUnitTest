package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by bakkchos on 23.04.2017.
 */
class MainTest {
    @Test
    void isNull() {
        String x = null;
        assertEquals(true,Main.isNull(x));
        x = "JUnit";
        assertEquals(false,Main.isNull(x));
    }

    @Test
    void testisEven() {
        assertEquals(true,Main.isEven(2));
        assertEquals(false,Main.isEven(3));
    }

}