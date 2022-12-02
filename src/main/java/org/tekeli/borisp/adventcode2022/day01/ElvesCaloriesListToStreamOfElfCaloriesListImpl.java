package org.tekeli.borisp.adventcode2022.day01;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

class ElvesCaloriesListToStreamOfElfCaloriesListImpl implements ElvesCaloriesListToStreamOfElfCaloriesList {
    @Override
    public Stream<String> apply(final String elvesCaloriesList) {
        return Optional.ofNullable(elvesCaloriesList)
                .filter(not(String::isBlank))
                .map(this::map)
                .orElse(Stream.empty());
    }

    private Stream<String> map(final String elvesCaloriesList) {
        return Arrays.stream(elvesCaloriesList
                .trim()
                .split("\\n\\n"))
                .map(String::trim)
                .filter(not(String::isBlank));
    }
}
