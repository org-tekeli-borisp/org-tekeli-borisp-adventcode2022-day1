package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;

import static java.util.function.Predicate.not;

public class ElfCaloriesListToNumberImpl implements ElfCaloriesListToNumber {

    private final LineToNumber lineToNumber = new LineToNumberImpl();

    @Override
    public Integer apply(final String elfCaloriesList) {
        return Optional.ofNullable(elfCaloriesList)
                .filter(not(String::isBlank))
                .map(this::map)
                .orElse(0);
    }

    private Integer map(final String elfCaloriesList) {
        return elfCaloriesList
                .lines()
                .map(lineToNumber::apply)
                .reduce(0, Integer::sum);
    }
}
