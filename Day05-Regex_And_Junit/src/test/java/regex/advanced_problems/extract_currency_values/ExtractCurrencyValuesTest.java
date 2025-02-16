package regex.advanced_problems.extract_currency_values;

import org.junit.jupiter.api.Test;
import regex_problems.advanced_problem.extract_currency.Extract_Currency;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractCurrencyValuesTest {

    @Test
    void testCase1(){
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> currency =Extract_Currency. extractingCurrencyValue(text);

        List<String> expected= Arrays.asList("$45.99","10.50");
        assertArrayEquals(currency.toArray(),expected.toArray());
    }

    @Test
    void testCase2(){
        String text = "The price is, and the discount is and.";
        List<String> currency = Extract_Currency. extractingCurrencyValue(text);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(currency.toArray(),expected.toArray());
    }
}
