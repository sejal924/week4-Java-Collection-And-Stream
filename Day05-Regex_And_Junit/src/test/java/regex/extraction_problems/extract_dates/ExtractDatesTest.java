package regex.extraction_problems.extract_dates;

import org.junit.jupiter.api.Test;
import regex_problems.extraction_problem.extract_dates.Extract_Dates;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractDatesTest {

    @Test
    void testCase1(){
        String sentence="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020";
        List<String> dates= Extract_Dates.extractingDate(sentence);

        List<String> expected= Arrays.asList("12/05/2023","15/08/2024","29/02/2020");
        assertArrayEquals(expected.toArray(),dates.toArray());
    }

    @Test
    void testCase2(){
        String sentence="The events are scheduled for";
        List<String> dates=Extract_Dates.extractingDate(sentence);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(expected.toArray(),dates.toArray());
    }
}
