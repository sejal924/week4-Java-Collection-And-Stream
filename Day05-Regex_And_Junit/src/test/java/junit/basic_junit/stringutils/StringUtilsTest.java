package junit.basic_junit.stringutils;

import static org.junit.jupiter.api.Assertions.*;

import junit_problems.basic_junit.stringutils.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("cba", stringUtils.reverse("abc"));
        assertEquals("racecar", stringUtils.reverse("racecar"));
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("Racecar"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("WoRLd"));
        assertEquals("", stringUtils.toUpperCase(""));
    }

    @Test
    void testReverseWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.reverse(null);
        });
        assertEquals("Input cannot be null", exception.getMessage());
    }

    @Test
    void testIsPalindromeWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.isPalindrome(null);
        });
        assertEquals("Input cannot be null", exception.getMessage());
    }

    @Test
    void testToUpperCaseWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.toUpperCase(null);
        });
        assertEquals("Input cannot be null", exception.getMessage());
    }
}

