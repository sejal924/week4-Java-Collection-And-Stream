package regex.basic_regex_problems.validate_license_plate_number;

import org.junit.jupiter.api.Test;
import regex_problems.basic_regex_problem.validate_license_plate_number.Validate_License_Plate_Number;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateLicensePlateNumberTest {

    @Test
    void testCase1(){
        String plateNumber="AB1234";
        boolean isValid= Validate_License_Plate_Number.validatingLicencePlateNumber(plateNumber);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String plateNumber="A12345";
        boolean isValid=Validate_License_Plate_Number.validatingLicencePlateNumber(plateNumber);
        assertFalse(isValid);
    }
}
