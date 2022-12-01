package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class LineToNumberTest {

    private LineToNumber unitUnderTest;

    @BeforeEach
    void setUp() {
        unitUnderTest = new LineToNumberImpl();
    }

    @Test
    void shouldConsumeString() {
        final var line = "LINE";

        assertDoesNotThrow(() -> unitUnderTest.apply(line));
    }

    @Test
    void shouldProduceOptional() {
        final var line = "LINE";

        final var apply = unitUnderTest.apply(line);

        assertThat(apply).isInstanceOf(Optional.class);
    }

    @Test
    void shouldProduceOptionalEmptyInCaseLineIsNull() {
        final var apply = unitUnderTest.apply(null);

        assertThat(apply).isEmpty();
    }

    @Test
    void shouldProduceOptionalEmptyInCaseLineIsNotNumber() {
        final var apply = unitUnderTest.apply("NOT NUMBER");

        assertThat(apply).isEmpty();
    }

    @Test
    void shouldProduceOptionalPresentInCaseLineIsNumber() {
        final var apply = unitUnderTest.apply("42");

        assertThat(apply).isPresent();
    }

    @Test
    void shouldProduceOptionalOfInteger() {
        final var apply = unitUnderTest.apply("42");

        assertThat(apply).isPresent();
        assertThat(apply.get()).isInstanceOf(Integer.class);
    }
}
