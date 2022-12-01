package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ElvesCaloriesListToMaxCaloriesCarryingByAnElfTest {

    private ElvesCaloriesListToMaxCaloriesCarryingByAnElf unitUnderTest;

    @BeforeEach
    void setUp() {
        unitUnderTest = new ElvesCaloriesListToMaxCaloriesCarryingByAnElfImpl();
    }

    @Test
    void shouldConsumeString() {
        final var elvesCaloriesList = "anything";

        assertDoesNotThrow(() -> unitUnderTest.apply(elvesCaloriesList));
    }

}