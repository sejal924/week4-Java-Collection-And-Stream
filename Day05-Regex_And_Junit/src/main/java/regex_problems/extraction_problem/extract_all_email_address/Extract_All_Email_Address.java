package regex_problems.extraction_problem.extract_all_email_address;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_All_Email_Address {
    public static List<String> extractingAllEmail(String emailString){
        String regex="[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(emailString);

        List<String> emails=new ArrayList<>();
        while(matcher.find()){
            emails.add(matcher.group());
        }

        return emails;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the String of email address: ");
        String emailString=input.nextLine();

        List<String> emails=extractingAllEmail(emailString);

        if(emails.isEmpty()){
            System.out.println("No email found");
        }else{
            System.out.println("Email addresses in given string are:");
            for (String email:emails){
                System.out.println(email);
            }
        }

        input.close();
    }
}

