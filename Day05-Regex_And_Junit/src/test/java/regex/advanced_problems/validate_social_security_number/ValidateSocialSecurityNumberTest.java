package regex.advanced_problems.validate_social_security_number;

import org.junit.jupiter.api.Test;
import regex_problems.advanced_problem.validate_social_security_number.Validate_Social_Security_Number;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateSocialSecurityNumberTest {

    @Test
    void testCase1(){
        String ssn="My SSN is 123-45-6789.";
        boolean isValid= Validate_Social_Security_Number.validatingSSN(ssn);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String ssn="My SSN is 123456789";
        boolean isValid=Validate_Social_Security_Number.validatingSSN(ssn);
        assertFalse(isValid);
    }
}
