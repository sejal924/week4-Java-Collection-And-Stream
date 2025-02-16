package regex_problems.basic_regex_problem.validate_hex_color_code;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Hex_Color {
    public static boolean validatingHexColorCode(String colorCode){
        String regex="^[#]{1}[0-9a-fA-F]{6}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(colorCode);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Hex color code: ");
        String colorCode=input.next();
        boolean isValid=validatingHexColorCode(colorCode);

        if(isValid){
            System.out.println("Hex color code " + colorCode + ", is valid.");
        }else{
            System.out.println("Hex color code " + colorCode + ", is not valid.");
        }
        input.close();
    }
}
