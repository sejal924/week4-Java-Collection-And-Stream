package set;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.set.symmetric_difference.SymmetricDifference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceTest {

    @Test
    void findingSymmetricDifferenceTest(){
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> difference= SymmetricDifference.findingSymmetricDifference(set1,set2);
        Set<Integer> expected=new HashSet<>(Arrays.asList(1,2,4,5));
        assertEquals(expected,difference);

    }
}
