package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ElfCaloriesListToNumberTest {
    private ElfCaloriesListToNumber unitUnderTest;

    @BeforeEach
    void setUp() {
        unitUnderTest = new  ElfCaloriesListToNumberImpl();
    }

    @Test
    void shouldConsumeString() {
        final var elfCaloriesList = "anything";

        assertDoesNotThrow(() -> unitUnderTest.appy(elfCaloriesList));
    }
}
