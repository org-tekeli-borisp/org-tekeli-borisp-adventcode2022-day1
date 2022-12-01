package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;
import java.util.function.Predicate;

public class ElvesCaloriesListToMaxCaloriesCarryingByAnElfImpl implements ElvesCaloriesListToMaxCaloriesCarryingByAnElf {
    @Override
    public Integer apply(final String elvesCaloriesList) {
        return Optional.ofNullable(elvesCaloriesList)
                .filter(Predicate.not(String::isBlank))
                .map(this::toPositionInTheList)
                .orElse(0);
    }

    private Integer toPositionInTheList(final String elvesCaloriesList) {
        return 1;
    }
}
