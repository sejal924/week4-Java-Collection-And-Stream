package junit_problems.basic_junit.stringutils;

public class StringUtils {

    public String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    public String toUpperCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return str.toUpperCase();
    }
}

