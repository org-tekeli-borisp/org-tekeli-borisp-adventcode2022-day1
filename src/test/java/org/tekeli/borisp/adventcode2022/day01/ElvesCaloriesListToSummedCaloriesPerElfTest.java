package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class ElvesCaloriesListToSummedCaloriesPerElfTest {

    private ElvesCaloriesListToSummedCaloriesPerElf unitUnderTest;
    private ElvesCaloriesListToStreamOfElfCaloriesList elvesCaloriesListToStreamOfElfCaloriesList;

    private ElfCaloriesListToNumber elfCaloriesListToNumber;

    @BeforeEach
    void setUp() {
        elvesCaloriesListToStreamOfElfCaloriesList = spy(new ElvesCaloriesListToStreamOfElfCaloriesListImpl());
        elfCaloriesListToNumber = spy(new ElfCaloriesListToNumberImpl());
        unitUnderTest = new ElvesCaloriesListToSummedCaloriesPerElfImpl(elvesCaloriesListToStreamOfElfCaloriesList, elfCaloriesListToNumber);
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

    @Test
    void shouldUseElvesCaloriesListToStreamOfElfCaloriesList() {
        final var elvesCaloriesList = "anything";

        unitUnderTest.apply(elvesCaloriesList);

        verify(elvesCaloriesListToStreamOfElfCaloriesList).apply(elvesCaloriesList);
    }

    @Test
    void shouldUseElfCaloriesListToNumber() {
        final var elvesCaloriesList = "anything";

        unitUnderTest.apply(elvesCaloriesList);

        verify(elfCaloriesListToNumber).apply(elvesCaloriesList);
    }

    @Test
    void shouldUProduceListToNumber() {
        final var elvesCaloriesList = "42";

        final var apply = unitUnderTest.apply(elvesCaloriesList);

        assertThat(apply).containsExactly(42);
    }

    @Test
    void shouldUProduceListToSummedNumber() {
        final var elvesCaloriesList = "42\n13";

        final var apply = unitUnderTest.apply(elvesCaloriesList);

        assertThat(apply).containsExactly(55);
    }

    @Test
    void shouldUProduceListToSummedNumbers() {
        final var elvesCaloriesList = "42\n13\n\n8";

        final var apply = unitUnderTest.apply(elvesCaloriesList);

        assertThat(apply).containsExactly(55, 8);
    }
}