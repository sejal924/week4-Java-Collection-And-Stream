package regex_problems.replace_and_modify.censor_bad_words;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Censor_Bad_Words {
    public static String censoringBadWords(String sentence){

        List<String> badWords=Arrays.asList("damn","stupid");

        StringBuilder goodString=new StringBuilder();
        String[] words=sentence.split("\\s+");
        for(String word:words){
            if(badWords.contains(word)){
                goodString.append("**** ");
            }else{
                goodString.append(word + " ");
            }
        }
        return goodString.toString();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence=input.nextLine();

        String goodstring=censoringBadWords(sentence);
        System.out.println(goodstring);
    }
}
