package list;

//import list.rotate_elements.RotateElements;
import org.example.list.rotate_elements.RotateElements;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementsTest {

    @Test
    void rotatingFuncTest(){
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k=2;
        RotateElements.rotatingListByK(list,k);

        List<Integer> expected=Arrays.asList(30,40,50,10,20);
        assertEquals(list,expected);
    }
}
