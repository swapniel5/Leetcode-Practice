package January2024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Jan2Test {

    @Test
    public void test_ValidParenthesis(){
        String s1 = "{([])}";
        boolean result = Jan2.isValid(s1);
        assertTrue(result);
    }

    @Test
    public void test_InvalidParenthesis(){
        String s2 = "{{}}))";
        boolean result = Jan2.isValid(s2);
        assertFalse(result);
    }
}
