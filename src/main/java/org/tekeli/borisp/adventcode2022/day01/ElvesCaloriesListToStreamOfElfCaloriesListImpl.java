package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;
import java.util.stream.Stream;

public class ElvesCaloriesListToStreamOfElfCaloriesListImpl implements ElvesCaloriesListToStreamOfElfCaloriesList {
    @Override
    public Stream<String> apply(final String elvesCaloriesList) {
        return Optional.ofNullable(elvesCaloriesList)
                .map(this::map)
                .orElse(Stream.empty());
    }

    private Stream<String> map(final String s) {
        return Stream.of("anything");
    }
}
