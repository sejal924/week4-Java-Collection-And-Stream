package regex.advanced_problems.validate_an_ip_address;

import org.junit.jupiter.api.Test;
import regex_problems.advanced_problem.validate_ip_address.Validate_IP_Address;

import static org.junit.jupiter.api.Assertions.*;
public class ValidateAnIPAddressTest {

    @Test
    void testCase1(){
        String ipAddress="192.168.1.1";
        boolean isValid= Validate_IP_Address.validatingIpAddress(ipAddress);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String ipAddress="256.100.100.100";
        boolean isValid=Validate_IP_Address.validatingIpAddress(ipAddress);
        assertFalse(isValid);
    }
}
