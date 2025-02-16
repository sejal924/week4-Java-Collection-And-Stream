package regex.basic_regex_problems.validate_hex_color_code;

import org.junit.jupiter.api.Test;
import regex_problems.basic_regex_problem.validate_hex_color_code.Validate_Hex_Color;

import static org.junit.jupiter.api.Assertions.*;


public class ValidateHexColorCodeTest {

    @Test
    void testCase1(){
        String colorCode="#FFA500";
        boolean isValid= Validate_Hex_Color.validatingHexColorCode(colorCode);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String colorCode="#123";
        boolean isValid= Validate_Hex_Color.validatingHexColorCode(colorCode);
        assertFalse(isValid);
    }
}
