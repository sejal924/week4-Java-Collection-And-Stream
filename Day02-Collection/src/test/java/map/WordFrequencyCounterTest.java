package map;

import org.example.map.word_frequency_counter.WordFrequencyCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounterTest {

    @Test
    void countWordFrequencyTest(){
        String str="Hello world, hello Java!";
        Map<String,Integer> frequency= WordFrequencyCounter.countWordFrequency(str);
        Map<String,Integer> expected=new HashMap<>();
        expected.put("hello",2);
        expected.put("world,",1);
        expected.put("java!",1);
//        expected.put("Hello",1);
        assertTrue(expected.equals(frequency));
    }
}
