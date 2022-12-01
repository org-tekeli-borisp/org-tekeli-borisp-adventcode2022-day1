package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class LineToNumberTest {

    private LineToNumber unitUnderTest;

    @BeforeEach
    void setUp() {
        unitUnderTest = new LineToNumberImpl();
    }

    @Test
    void shouldConsumeString() {
        final var line = "LINE";

        assertDoesNotThrow(() -> unitUnderTest.apply(line));
    }
}
