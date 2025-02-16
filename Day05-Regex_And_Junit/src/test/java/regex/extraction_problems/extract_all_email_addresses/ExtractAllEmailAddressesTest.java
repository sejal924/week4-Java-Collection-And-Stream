package regex.extraction_problems.extract_all_email_addresses;

import org.junit.jupiter.api.Test;
import regex_problems.extraction_problem.extract_all_email_address.Extract_All_Email_Address;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractAllEmailAddressesTest {

    @Test
    void testCase1(){
        String emailString="Contact us at support@example.com and info@company.org";
        List<String> emails= Extract_All_Email_Address.extractingAllEmail(emailString);

        List<String> expected= Arrays.asList("support@example.com","info@company.org");
        assertArrayEquals(emails.toArray(),expected.toArray());
    }

    @Test
    void testCase2(){
        String emailString="Contact us at and";
        List<String> emails=Extract_All_Email_Address.extractingAllEmail(emailString);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(emails.toArray(),expected.toArray());
    }
}
