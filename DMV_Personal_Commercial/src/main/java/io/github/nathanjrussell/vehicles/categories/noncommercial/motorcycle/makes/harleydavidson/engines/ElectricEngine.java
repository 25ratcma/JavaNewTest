//THIS FILE IS FINE

package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines;

import io.github.nathanjrussell.vehicles.engines.ElectricMotor;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.interfaces.IElectricEngine;

/**
 * Represents an electric engine for Harley-Davidson motorcycles.
 */
public class ElectricEngine extends ElectricMotor implements IElectricEngine {

    public ElectricEngine(int maxPowerOutput) {
        super(maxPowerOutput);
    }
}
