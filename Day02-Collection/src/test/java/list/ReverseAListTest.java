package list;

import org.example.list.reverse_a_list.ReverseAList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseAListTest {

    @Test
    void reversingArrayListTest(){
        List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ReverseAList.reversingList(arrayList);

        List<Integer> expected=Arrays.asList(5,4,3,2,1);
        assertEquals(arrayList,expected);
    }

    @Test
    void reversingLinkListTest(){
        List<Integer> arrayList=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        ReverseAList.reversingList(arrayList);

        List<Integer> expected=Arrays.asList(5,4,3,2,1);
        assertEquals(arrayList,expected);
    }


}
