package regex.advanced_problems.find_repeating_words;

import org.junit.jupiter.api.Test;
import regex_problems.advanced_problem.find_repeating_words.FindRepeatingWords;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRepeatingWordsTest {

    @Test
    void testCase1(){
        String sentence="This is is a repeated repeated word test.";
        List<String> repeatedWords= FindRepeatingWords.findingRepeatingWords(sentence);

        List<String> expected= Arrays.asList("is","repeated");
        assertArrayEquals(repeatedWords.toArray(),expected.toArray());
    }

    @Test
    void testCase2(){
        String sentence="This is a repeated word test.";
        List<String> repeatedWords=FindRepeatingWords.findingRepeatingWords(sentence);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(repeatedWords.toArray(),expected.toArray());
    }
}
