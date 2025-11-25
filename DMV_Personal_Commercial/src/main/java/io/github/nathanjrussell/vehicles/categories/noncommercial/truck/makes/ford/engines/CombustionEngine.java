package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines;

import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.interfaces.ICombustionEngine;
import io.github.nathanjrussell.vehicles.engines.InternalCombustionEngine;
import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.FuelTypes;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.DisplacementUnit;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;

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
                DisplacementUnit.LITERS
        );
    }
}
