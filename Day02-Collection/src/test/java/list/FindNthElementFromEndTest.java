package list;

//import list.find_the_nth_element_from_the_end.FindNthElementFromEnd;
import org.example.list.find_the_nth_element_from_the_end.FindNthElementFromEnd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindNthElementFromEndTest {

    @Test
    void findingNthFromLastTest(){
        List<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int n=4;
        System.out.println("List : " + list);
        int element= FindNthElementFromEnd.findingNthElementFromLast(list,n);
        assertEquals(6,element);
    }
}
