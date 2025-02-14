package map;

import org.example.map.invert_map.InvertMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMapTest {

    @Test
    void invertingMapTest(){
        Map<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);

        Map<Integer, List<String>> invertMap= InvertMap.invertingMap(map);

        Map<Integer,List<String>> expected=new HashMap<>();
        expected.put(1, Arrays.asList("A","C"));
        expected.put(2,Arrays.asList("B"));
        assertTrue(expected.equals(invertMap));
    }
}
