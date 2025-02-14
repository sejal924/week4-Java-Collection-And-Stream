package set;

import org.junit.jupiter.api.Test;
import org.example.set.union_and_intersection_of_two_sets.UnionAndIntersectionOfTwoSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UnionAndIntersectionOfTwoSetsTest {

    @Test
    void findingUnionTest(){
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        Set<Integer> union= UnionAndIntersectionOfTwoSets.findingUnion(set1,set2);

        Set<Integer> expected=new HashSet<>(Arrays.asList(1,2,3,4,5));
        assertEquals(union,expected);
    }

    @Test
    void findingIntersectionTest(){
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        Set<Integer> intersection=UnionAndIntersectionOfTwoSets.findingIntersection(set1,set2);

        Set<Integer> expected=new HashSet<>(Arrays.asList(3));
        assertEquals(intersection,expected);
    }
}
