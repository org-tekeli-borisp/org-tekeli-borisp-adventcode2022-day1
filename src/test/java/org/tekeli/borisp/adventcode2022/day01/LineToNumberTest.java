package org.tekeli.borisp.adventcode2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void shouldProduceInteger() {
        final var line = "LINE";

        final var apply = unitUnderTest.apply(line);

        assertThat(apply).isInstanceOf(Integer.class);
    }

    @Test
    void shouldProduceZeroInCaseLineIsNull() {
        final var apply = unitUnderTest.apply(null);

        assertThat(apply).isZero();
    }

    @Test
    void shouldProduceZeroInCaseLineIsNotNumber() {
        final var apply = unitUnderTest.apply("NOT NUMBER");

        assertThat(apply).isZero();
    }

    @Test
    void shouldProduceTheInteger() {
        final var apply = unitUnderTest.apply("42");

        assertThat(apply).isEqualTo(42);
    }
}
