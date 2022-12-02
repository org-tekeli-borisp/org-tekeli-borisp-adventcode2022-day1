package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ElvesCaloriesListToSummedCaloriesPerElfTest {

    private ElvesCaloriesListToSummedCaloriesPerElf unitUnderTest;

    @BeforeEach
    void setUp() {
        unitUnderTest = new ElvesCaloriesListToSummedCaloriesPerElfImpl();
    }

    @Test
    void shouldConsumeString() {
        final var elvesCaloriesList = "anything";

        assertDoesNotThrow(() -> unitUnderTest.apply(elvesCaloriesList));
    }

    @Test
    void shouldProduceList() {
        final var elvesCaloriesList = "anything";

        final var apply = unitUnderTest.apply(elvesCaloriesList);

        assertThat(apply).isInstanceOf(List.class);
    }

    @Test
    void shouldProduceListOfInteger() {
        final var elvesCaloriesList = "anything";

        final var apply = unitUnderTest.apply(elvesCaloriesList);

        apply.forEach(entry -> assertThat(entry).isInstanceOf(Integer.class));
    }

    @Test
    void shouldProduceEmptyListInCaseElvesCaloriesListIsNull() {

        final var apply = unitUnderTest.apply(null);

        assertThat(apply).isEmpty();
    }

    @Test
    void shouldProduceEmptyListInCaseElvesCaloriesListIsEmpty() {

        final var apply = unitUnderTest.apply("");

        assertThat(apply).isEmpty();
    }
}