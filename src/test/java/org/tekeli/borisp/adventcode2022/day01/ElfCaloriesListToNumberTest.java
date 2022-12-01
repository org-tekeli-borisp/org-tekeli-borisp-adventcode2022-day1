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

    @Test
    void shouldReturnZeroInCaseElfCaloriesListIsEmpty() {
        final Integer apply = unitUnderTest.appy("");

        assertThat(apply).isZero();
    }

    @Test
    void shouldReturnZeroInCaseElfCaloriesListIsBlank() {
        final Integer apply = unitUnderTest.appy("  ");

        assertThat(apply).isZero();
    }

    @Test
    void shouldReturnZeroInCaseElfCaloriesListIsNotNumber() {
        final Integer apply = unitUnderTest.appy("NOT_NUMBER");

        assertThat(apply).isZero();
    }

    @Test
    void shouldReturnNumberInCaseElfCaloriesListIsNumber() {
        final Integer apply = unitUnderTest.appy("42");

        assertThat(apply).isEqualTo(42);
    }

    @Test
    void shouldReturnSumOfNumberInCaseElfCaloriesListHasMultipleIsNumber() {
        final var elfCaloriesList = """
                1
                2
                """;
        final Integer apply = unitUnderTest.appy(elfCaloriesList);

        assertThat(apply).isEqualTo(3);
    }

    @Test
    void shouldReturnSumOfNumberInCaseElfCaloriesListHasMultipleIsNumberAndNotNumber() {
        final var elfCaloriesList = """
                1
                NOT_NUMBER
                2
                """;
        final Integer apply = unitUnderTest.appy(elfCaloriesList);

        assertThat(apply).isEqualTo(3);
    }
}
