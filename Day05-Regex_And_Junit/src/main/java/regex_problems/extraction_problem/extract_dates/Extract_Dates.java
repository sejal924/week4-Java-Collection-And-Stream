package regex_problems.extraction_problem.extract_dates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_Dates {
    public static List<String> extractingDate(String sentence){
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(sentence);

        List<String> dates=new ArrayList<>();
        while(matcher.find()){
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence=input.nextLine();

        List<String> dates=extractingDate(sentence);

        if(dates.isEmpty()){
            System.out.println("No dates in format dd/mm/yyyy found.");
        }else{
            System.out.println("Dates in format dd/mm/yyyy in given sentence are:");
            for (String date:dates){
                System.out.println(date);
            }
        }

        input.close();
    }
}
