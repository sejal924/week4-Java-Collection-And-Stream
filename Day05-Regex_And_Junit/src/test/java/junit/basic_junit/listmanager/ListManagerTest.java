package junit.basic_junit.listmanager;

import static org.junit.jupiter.api.Assertions.*;

import junit_problems.basic_junit.listmanager.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    private final ListManager listManager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        assertEquals(1, list.size());
        assertTrue(list.contains(5));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        listManager.removeElement(list, 10);
        assertEquals(1, list.size());
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, listManager.getSize(list));
        list.add(1);
        list.add(2);
        assertEquals(2, listManager.getSize(list));
    }

    @Test
    void testAddElementWithNullList() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            listManager.addElement(null, 5);
        });
        assertEquals("List cannot be null", exception.getMessage());
    }

    @Test
    void testRemoveElementWithNullList() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            listManager.removeElement(null, 5);
        });
        assertEquals("List cannot be null", exception.getMessage());
    }

    @Test
    void testGetSizeWithNullList() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            listManager.getSize(null);
        });
        assertEquals("List cannot be null", exception.getMessage());
    }
}
