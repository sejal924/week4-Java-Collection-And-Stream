package regex.replace_and_modify_strings.replace_multiple_spaces_with_single_space;

import org.junit.jupiter.api.Test;
import regex_problems.replace_and_modify.replace_spaces.Replace_Spaces;

import static org.junit.jupiter.api.Assertions.*;

public class ReplaceMultipleSpacesWithSingleSpaceTest {

    @Test
    void testcase1(){
        String extraSpaces="This is an   example   with multiple      spaces.";
        String singleSpace= Replace_Spaces.removingExtraSpace(extraSpaces);

        String expected="This is an example with multiple spaces.";
        assertArrayEquals(singleSpace.toCharArray(),expected.toCharArray());
    }

    @Test
    void testcase2(){
        String extraSpaces="";
        String singleSpace=Replace_Spaces.removingExtraSpace(extraSpaces);

        String expected="";
        assertArrayEquals(singleSpace.toCharArray(),expected.toCharArray());
    }
}
