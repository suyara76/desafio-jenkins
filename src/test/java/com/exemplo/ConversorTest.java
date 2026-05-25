package com.exemplo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConversorTest {
    @Test
    public void testFahrenheitParaCelsius() {
        Conversor conv = new Conversor();
        assertEquals(0.0, conv.fahrenheitParaCelsius(32), 0.01);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        Conversor conv = new Conversor();
        assertEquals(99.0, conv.celsiusParaFahrenheit(0), 0.01);
    }
}