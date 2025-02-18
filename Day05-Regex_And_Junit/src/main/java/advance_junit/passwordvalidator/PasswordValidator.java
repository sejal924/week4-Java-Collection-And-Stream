package junit_problems.advance_junit.passwordvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static boolean validator(String password){
        if(password.length()<8){
            return false;
        }
        int uppercase=0;
        int digit=0;
        for(int i=0;i<password.length();i++){
            char c=password.charAt(i);
            if(c<='Z'&&c>='A'){
                uppercase++;
            }
            if(c<='9'&&c>='0'){
                digit++;
            }
        }
        return (uppercase!=0&&digit!=0);
    }
}
