package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;

import static java.util.function.Predicate.not;

public class ElfCaloriesListToNumberImpl implements ElfCaloriesListToNumber {
    @Override
    public Integer appy(final String elfCaloriesList) {
        return Optional.ofNullable(elfCaloriesList)
                .filter(not(String::isBlank))
                .map(this::map)
                .orElse(0);
    }

    private Integer map(String elfCaloriesList) {
        return 1;
    }
}
