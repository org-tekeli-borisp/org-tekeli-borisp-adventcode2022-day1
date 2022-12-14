package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;

class LineToNumberImpl implements LineToNumber {
    @Override
    public Integer apply(final String line) {
        return Optional.ofNullable(line)
                .map(this::map)
                .orElse(0);
    }

    private Integer map(final String line) {
        try {
            return Integer.valueOf(line);
        }catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }
}
