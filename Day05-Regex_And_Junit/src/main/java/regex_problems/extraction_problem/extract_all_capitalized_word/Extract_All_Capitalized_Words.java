package regex_problems.extraction_problem.extract_all_capitalized_word;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_All_Capitalized_Words {
    public static List<String> extractingAllCapitalWords(String sentence){
        String regex="[A-Z]{1}[a-z]{1,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(sentence);

        List<String> capitalWords=new ArrayList<>();
        while(matcher.find()){
            capitalWords.add(matcher.group());
        }
        return capitalWords;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence=input.nextLine();

        List<String> capitalWords=extractingAllCapitalWords(sentence);

        if(capitalWords.isEmpty()){
            System.out.println("No capital word found.");
        }else{
            System.out.println("Capital words in given sentence are:");
            for (String word:capitalWords){
                System.out.println(word);
            }
        }

        input.close();
    }
}

