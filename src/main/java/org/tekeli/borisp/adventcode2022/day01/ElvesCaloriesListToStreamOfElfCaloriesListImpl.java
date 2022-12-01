package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

public class ElvesCaloriesListToStreamOfElfCaloriesListImpl implements ElvesCaloriesListToStreamOfElfCaloriesList {
    @Override
    public Stream<String> apply(final String elvesCaloriesList) {
        return Optional.ofNullable(elvesCaloriesList)
                .filter(not(String::isBlank))
                .map(this::map)
                .orElse(Stream.empty());
    }

    private Stream<String> map(final String elvesCaloriesList) {
        return Stream.of(elvesCaloriesList);
    }
}
