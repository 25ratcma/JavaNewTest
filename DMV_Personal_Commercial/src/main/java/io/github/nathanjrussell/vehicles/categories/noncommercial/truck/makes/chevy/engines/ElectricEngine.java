//THIS FILE IS FINE

package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines;

import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.interfaces.IElectricEngine;
import io.github.nathanjrussell.vehicles.engines.ElectricMotor;

/**
 * Represents an electric engine for Harley-Davidson motorcycles.
 */
public class ElectricEngine extends ElectricMotor implements IElectricEngine {

    public ElectricEngine(int maxPowerOutput) {
        super(maxPowerOutput);
    }
}
