package org.tekeli.borisp.adventcode2022.day01;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ElvesCaloriesListToSummedCaloriesPerElfImpl implements ElvesCaloriesListToSummedCaloriesPerElf {

    private final ElvesCaloriesListToStreamOfElfCaloriesList elvesCaloriesListToStreamOfElfCaloriesList;
    private final ElfCaloriesListToNumber elfCaloriesListToNumber;

    public ElvesCaloriesListToSummedCaloriesPerElfImpl(final ElvesCaloriesListToStreamOfElfCaloriesList elvesCaloriesListToStreamOfElfCaloriesList,
                                                       final ElfCaloriesListToNumber elfCaloriesListToNumber) {
        this.elvesCaloriesListToStreamOfElfCaloriesList = elvesCaloriesListToStreamOfElfCaloriesList;
        this.elfCaloriesListToNumber = elfCaloriesListToNumber;
    }

    @Override
    public List<Integer> apply(final String elvesCaloriesList) {
        return Optional.ofNullable(elvesCaloriesList)
                .filter(Predicate.not(String::isBlank))
                .map(this::toList)
                .orElse(Collections.emptyList());
    }

    private List<Integer> toList(final String elvesCaloriesList) {
        elvesCaloriesListToStreamOfElfCaloriesList.apply(elvesCaloriesList);
        elfCaloriesListToNumber.apply(elvesCaloriesList);
        return List.of(1);
    }
}
