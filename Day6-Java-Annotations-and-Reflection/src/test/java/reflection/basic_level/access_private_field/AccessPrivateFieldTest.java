package reflection.basic_level.access_private_field;


import com.bridgelabz.reflection.basic_level.access_private_field.Person;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class AccessPrivateFieldTest {

    @Test
    void testAccessAndModifyPrivateField() throws Exception {
        // Given a Person object with an initial age of 18
        Person person = new Person(18);
        Class<?> cls = person.getClass();

        // Access the private field
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);

        // Verify initial value
        assertEquals(18, field.get(person), "Initial age should be 18");

        // Modify the field value
        field.set(person, 20);

        // Verify updated value
        assertEquals(20, field.get(person), "Modified age should be 20");
    }

    @Test
    void testInvalidFieldAccess() {
        Person person = new Person(18);

        // Attempt to access a non-existent field
        Exception exception = assertThrows(NoSuchFieldException.class, () -> {
            person.getClass().getDeclaredField("nonExistentField");
        });

        assertTrue(exception.getMessage().contains("nonExistentField"), "Exception message should mention the missing field");
    }
}
