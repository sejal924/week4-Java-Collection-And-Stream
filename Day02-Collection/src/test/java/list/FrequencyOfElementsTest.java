package list;

//import list.frequency_of_elements.FrequencyOfElements;
import org.example.list.frequency_of_elements.FrequencyOfElements;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElementsTest {

    @Test
    void findingFrequencyTest(){
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        Map<String ,Integer> map= FrequencyOfElements.countFrequency(list);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);
        assertEquals(map,expected);
    }
}
