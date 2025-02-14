package set;

import org.example.set.checking_set_equal.CheckIfTwoSetsAreEqual;
import org.junit.jupiter.api.Test;
//import set.checking_set_equal.CheckIfTwoSetsAreEqual;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class CheckIfTwoSetsAreEqualTest {

    @Test
    void isEqualFuncTest(){
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        boolean equal= CheckIfTwoSetsAreEqual.isEqual(set1,set2);
        assertTrue(equal);

    }
}
