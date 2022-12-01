package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ElvesCaloriesListToStreamOfElfCaloriesListTest {

    private ElvesCaloriesListToStreamOfElfCaloriesList unitUnderTest;

    @BeforeEach
    void setUp() {
        unitUnderTest = new ElvesCaloriesListToStreamOfElfCaloriesListImpl();
    }

    @Test
    void shouldConsumeString() {
        final var elvesCaloriesList = "anything";

        assertDoesNotThrow(() -> unitUnderTest.apply(elvesCaloriesList));
    }
}
