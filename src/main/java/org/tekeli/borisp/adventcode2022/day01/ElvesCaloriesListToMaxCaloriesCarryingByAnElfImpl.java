package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;

public class ElvesCaloriesListToMaxCaloriesCarryingByAnElfImpl implements ElvesCaloriesListToMaxCaloriesCarryingByAnElf {
    @Override
    public Integer apply(final String elvesCaloriesList) {
        return Optional.ofNullable(elvesCaloriesList)
                .map(this::toPositionInTheList)
                .orElse(0);
    }

    private Integer toPositionInTheList(final String elvesCaloriesList) {
        return 1;
    }
}
