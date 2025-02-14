package set;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.set.convert_set_to_sorted_list.ConvertSetToSortedList;

import java.util.*;

public class ConvertSetToSortedListTest {

    @Test
    void sortedListTest(){
        Set<Integer> set=new LinkedHashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        List<Integer> list= ConvertSetToSortedList.sortedList(set);

        List<Integer> expected= Arrays.asList(1,3,5,9);
        assertEquals(list,expected);
    }
}
