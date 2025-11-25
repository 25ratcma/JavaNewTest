package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines;

import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.FuelTypes;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.DisplacementUnit;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;
import io.github.nathanjrussell.vehicles.engines.InternalCombustionEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.interfaces.ICombustionEngine;

/**
 * Represents a combustion engine for Harley-Davidson motorcycles.
 */
public class CombustionEngine extends InternalCombustionEngine implements ICombustionEngine {

    public CombustionEngine(
            int maxPowerOutput,
            int numCylinders,
            double displacement) {
        super(
                //some parameters are missing here
                maxPowerOutput,
                PowerOutputUnits.HORSEPOWER,
                FuelTypes.GASOLINE,
                numCylinders,
                displacement,
                DisplacementUnit.CUBIC_CENTIMETERS
        );
    }
}
