package annotation.exercise.exercise2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LegacyAPITest {

    @Test
    void testOldFeature() {
        annotation.exercise.exercise2.LegacyAPI api = new annotation.exercise.exercise2.LegacyAPI();

        // Checking if calling the deprecated method does not throw an error
        assertDoesNotThrow(api::oldFeature, "Deprecated method should still execute without errors");
    }

    @Test
    void testNewFeature() {
        annotation.exercise.exercise2.LegacyAPI api = new annotation.exercise.exercise2.LegacyAPI();

        // Checking if new method executes properly
        assertDoesNotThrow(api::newFeature, "New method should execute without errors");
    }
}
