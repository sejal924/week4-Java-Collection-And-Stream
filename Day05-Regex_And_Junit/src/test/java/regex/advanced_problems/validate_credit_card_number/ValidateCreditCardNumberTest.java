package regex.advanced_problems.validate_credit_card_number;

import org.junit.jupiter.api.Test;
import regex_problems.advanced_problem.validate_credit_card_number.ValidateCreditCardNumber;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateCreditCardNumberTest {

    @Test
    void testCase1(){
        String cardNumber="4123456789123456";
        boolean isValid= ValidateCreditCardNumber.validatingCreditCardNumber(cardNumber);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String cardNumber="6123456789123456";
        boolean isValid=ValidateCreditCardNumber.validatingCreditCardNumber(cardNumber);
        assertFalse(isValid);
    }
}
