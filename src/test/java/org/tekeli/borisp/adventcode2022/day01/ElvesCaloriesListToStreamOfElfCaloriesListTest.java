package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
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

    @Test
    void shouldProduceStream() {
        final var elvesCaloriesList = "anything";

        final var apply = unitUnderTest.apply(elvesCaloriesList);

        assertThat(apply).isInstanceOf(Stream.class);
    }

    @Test
    void shouldProduceStreamOfString() {
        final var elvesCaloriesList = "anything";

        final var apply = unitUnderTest.apply(elvesCaloriesList);

        assertThat(apply).isInstanceOf(Stream.class);
        apply.forEach(s -> assertThat(s).isInstanceOf(String.class));
    }

    @Test
    void shouldProduceEmptyStreamInCaseElvesCaloriesListIsNull() {
        final var apply = unitUnderTest.apply(null);

        assertThat(apply).isEmpty();
    }

    @Test
    void shouldProduceEmptyStreamInCaseElvesCaloriesListIsEmpty() {
        final var apply = unitUnderTest.apply("");

        assertThat(apply).isEmpty();
    }
}
