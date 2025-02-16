package regex.basic_regex_problems.validate_username;

import regex_problems.basic_regex_problem.validate_username.Validate_Username;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ValidateAUsernameTest {

    @Test
    void testCase1(){
        //valid userName
        String username="user_123";
        boolean isValid= Validate_Username.validatingUsername(username);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        //valid userName
        String username="123user";
        boolean isValid= Validate_Username.validatingUsername(username);
        assertFalse(isValid);
    }

    @Test
    void testCase3(){
        //valid userName
        String username="us";
        boolean isValid= Validate_Username.validatingUsername(username);
        assertFalse(isValid);
    }
}
