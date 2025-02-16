package regex_problems.basic_regex_problem.validate_license_plate_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_License_Plate_Number{
    public static boolean validatingLicencePlateNumber(String plateNumber){
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(plateNumber);

        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Licence plate number : ");
        String plateNumber=input.next();
        boolean isValid=validatingLicencePlateNumber(plateNumber);

        if(isValid){
            System.out.println("Plate number : " + plateNumber + ", is valid.");
        }else{
            System.out.println("Plate number : " + plateNumber + ", is not valid.");
        }
        input.close();
    }
}


