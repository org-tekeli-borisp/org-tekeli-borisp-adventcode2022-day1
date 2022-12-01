package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ElvesCaloriesListToPositionOfTheElfCarryingMaxCaloriesTest {

    private ElvesCaloriesListToPositionOfTheElfCarryingMaxCalories unitUnderTest;

    @BeforeEach
    void setUp() {
        unitUnderTest = new ElvesCaloriesListToPositionOfTheElfCarryingMaxCaloriesImpl();
    }

    @Test
    void shouldConsumeString() {
        final var elvesCaloriesList = "anything";

        assertDoesNotThrow(() -> unitUnderTest.apply(elvesCaloriesList));
    }

    @Test
    void shouldProduceInteger() {
        final var elvesCaloriesList = "anything";

        final var apply = unitUnderTest.apply(elvesCaloriesList);

        assertThat(apply).isInstanceOf(Integer.class);
    }

    @Test
    void shouldProduceZeroInCaseElvesCaloriesListIsNull() {

        final var apply = unitUnderTest.apply(null);

        assertThat(apply).isZero();
    }

    @Test
    void shouldProduceZeroInCaseElvesCaloriesListIsEmpty() {

        final var apply = unitUnderTest.apply("");

        assertThat(apply).isZero();
    }
}