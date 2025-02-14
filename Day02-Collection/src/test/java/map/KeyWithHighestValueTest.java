package map;

//import map.key_with_highest_value.KeyWithHighestValue;
import org.example.map.key_with_highest_value.KeyWithHighestValue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class KeyWithHighestValueTest {

    @Test
    void highestValueTest(){
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);
        System.out.println("Map : " + map);
        String key= KeyWithHighestValue.highestValue(map);
        assertEquals("B",key);
    }
}
