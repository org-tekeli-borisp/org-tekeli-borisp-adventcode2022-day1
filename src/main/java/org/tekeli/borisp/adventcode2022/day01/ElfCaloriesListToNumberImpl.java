package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;

import static java.util.function.Predicate.not;

public class ElfCaloriesListToNumberImpl implements ElfCaloriesListToNumber {

    private final LineToNumber lineToNumber = new LineToNumberImpl();

    @Override
    public Integer appy(final String elfCaloriesList) {
        return Optional.ofNullable(elfCaloriesList)
                .filter(not(String::isBlank))
                .flatMap(lineToNumber::apply)
                .orElse(0);
    }
}
