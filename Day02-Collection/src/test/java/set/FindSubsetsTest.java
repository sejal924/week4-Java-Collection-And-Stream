package set;

import org.example.set.find_subsets.FindSubsets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import set.find_subsets.FindSubsets;

import java.util.HashSet;
import java.util.Set;

public class FindSubsetsTest {

    @Test
    void isSubSetTest(){
        Set<Integer> set1=new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2=new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        boolean areSubSet= FindSubsets.isSubSet(set1,set2);
        assertTrue(areSubSet);
    }
}
