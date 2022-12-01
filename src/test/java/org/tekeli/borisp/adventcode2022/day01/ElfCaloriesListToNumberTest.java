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

        assertDoesNotThrow(() -> unitUnderTest.apply(elfCaloriesList));
    }

    @Test
    void shouldProduceInteger() {
        final var elfCaloriesList = "anything";

        final Integer apply = unitUnderTest.apply(elfCaloriesList);

        assertThat(apply).isInstanceOf(Integer.class);
    }

    @Test
    void shouldReturnZeroInCaseElfCaloriesListIsNull() {
        final Integer apply = unitUnderTest.apply(null);

        assertThat(apply).isZero();
    }

    @Test
    void shouldReturnZeroInCaseElfCaloriesListIsEmpty() {
        final Integer apply = unitUnderTest.apply("");

        assertThat(apply).isZero();
    }

    @Test
    void shouldReturnZeroInCaseElfCaloriesListIsBlank() {
        final Integer apply = unitUnderTest.apply("  ");

        assertThat(apply).isZero();
    }

    @Test
    void shouldReturnZeroInCaseElfCaloriesListIsNotNumber() {
        final Integer apply = unitUnderTest.apply("NOT_NUMBER");

        assertThat(apply).isZero();
    }

    @Test
    void shouldReturnNumberInCaseElfCaloriesListIsNumber() {
        final Integer apply = unitUnderTest.apply("42");

        assertThat(apply).isEqualTo(42);
    }

    @Test
    void shouldReturnSumOfNumberInCaseElfCaloriesListHasMultipleIsNumber() {
        final var elfCaloriesList = """
                1
                2
                """;
        final Integer apply = unitUnderTest.apply(elfCaloriesList);

        assertThat(apply).isEqualTo(3);
    }

    @Test
    void shouldReturnSumOfNumberInCaseElfCaloriesListHasMultipleIsNumberAndNotNumber() {
        final var elfCaloriesList = """
                1
                NOT_NUMBER
                2
                """;
        final Integer apply = unitUnderTest.apply(elfCaloriesList);

        assertThat(apply).isEqualTo(3);
    }
}
