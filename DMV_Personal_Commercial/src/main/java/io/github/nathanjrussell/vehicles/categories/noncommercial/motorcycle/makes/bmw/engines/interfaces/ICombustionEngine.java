package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.interfaces;

import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.Constants;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.interfaces.IEngine;
import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.FuelTypes;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.DisplacementUnit;
import io.github.nathanjrussell.vehicles.engines.interfaces.ICombustion;

/**
 * Interface representing a combustion engine specific to Harley-Davidson motorcycles.
 */
public interface ICombustionEngine extends IEngine, ICombustion {
    default int warrantyYears() {
        return Constants.COMBUSTION_ENGINE_WARRANTY_YEARS;
    }
    default int warrantyMiles() {
        return Constants.COMBUSTION_ENGINE_WARRANTY_MILES;
    }
    default FuelTypes fuelType() {
        return FuelTypes.GASOLINE;
    }
    default DisplacementUnit displacementUnit() {
        return DisplacementUnit.CUBIC_CENTIMETERS;
    }

}
