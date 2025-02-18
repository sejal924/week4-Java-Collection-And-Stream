package junit.advance_junit.temperature_converter;

import junit_problems.advance_junit.temperature_converter.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void toFahrenheit(){
        assertEquals(41.0,converter.celsiusToFahrenheit(5));
    }
    void toCelsius(){
        assertEquals(5.0,converter.fahrenheitToCelsius(41));
    }
}
