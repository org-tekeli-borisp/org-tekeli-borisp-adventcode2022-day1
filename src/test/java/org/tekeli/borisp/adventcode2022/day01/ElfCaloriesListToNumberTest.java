package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
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

    @Test
    void shouldProduceInteger() {
        final var elfCaloriesList = "anything";

        final Integer apply = unitUnderTest.appy(elfCaloriesList);

        assertThat(apply).isInstanceOf(Integer.class);
    }

    @Test
    void shouldReturnZeroInCaseElfCaloriesListIsNull() {
        final Integer apply = unitUnderTest.appy(null);

        assertThat(apply).isZero();
    }
}
