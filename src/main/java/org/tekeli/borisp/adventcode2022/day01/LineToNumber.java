package org.tekeli.borisp.adventcode2022.day01;

import java.util.Optional;

public interface LineToNumber {
    Optional apply(final String line);
}
