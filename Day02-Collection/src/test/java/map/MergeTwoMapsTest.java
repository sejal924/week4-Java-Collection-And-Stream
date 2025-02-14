package map;

import org.example.map.merge_two_maps.MergeTwoMaps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMapsTest {

    @Test
    void mergeMapTest(){
        Map<String,Integer> map1=new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);

        Map<String,Integer> map2=new HashMap<>();
        map2.put("B",3);
        map2.put("C",4);

        Map<String,Integer> merge= MergeTwoMaps.mergeMap(map1,map2);
        Map<String,Integer> expected=new HashMap<>();
        expected.put("A",1);
        expected.put("B",5);
        expected.put("C",4);

        assertTrue(expected.equals(merge));
    }
}
