package regex.advanced_problems.extract_programming_language_names;

import org.junit.jupiter.api.Test;
import regex_problems.advanced_problem.extract_programming_language_names.ExtractProgrammingLanguageNames;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ExtractProgrammingLanguageNamesTest {

    @Test
    void testCase1(){
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        Set<String> programmingLang= ExtractProgrammingLanguageNames.extractingProgrammingLanguage(text);

        List<String> expected= Arrays.asList("Java","Python","JavaScript","Go");
        assertArrayEquals(programmingLang.toArray(),expected.toArray());
    }


    @Test
    void testCase2(){
        String text="but I haven't tried yet.";
        Set<String> programmingLang=ExtractProgrammingLanguageNames.extractingProgrammingLanguage(text);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(programmingLang.toArray(),expected.toArray());
    }
}
