package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;

public class LineToNumberImpl implements LineToNumber {
    @Override
    public Optional<Integer> apply(final String line) {
        return Optional.ofNullable(line)
                .map(this::map);
    }

    private Integer map(final String line) {
        try {
            return Integer.valueOf(line);
        }catch (NumberFormatException numberFormatException) {
            return null;
        }
    }
}
