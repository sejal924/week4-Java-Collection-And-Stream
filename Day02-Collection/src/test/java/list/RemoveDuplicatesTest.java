package list;

//import list.remove_duplicates.RemoveDuplicates;
import org.example.list.remove_duplicates.RemoveDuplicates;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTest {

    @Test
    void removingDuplicatesTest(){
        List<Integer> list=Arrays.asList(3,1,2,2,3,4);
        list= RemoveDuplicates.removingDuplicates(list);

        List<Integer> expected=Arrays.asList(3,1,2,4);
        assertEquals(list,expected);
    }
}
