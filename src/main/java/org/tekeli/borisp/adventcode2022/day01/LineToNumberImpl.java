package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;

public class LineToNumberImpl implements LineToNumber {
    @Override
    public Optional apply(final String line) {
        return Optional.ofNullable(line)
                .map(this::map);
    }

    private Integer map(final String s) {
        return 1;
    }
}