package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.interfaces;


import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.ElectricPowerMethod;
import io.github.nathanjrussell.vehicles.engines.interfaces.IElectric;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.Constants;

/**
 * Interface representing an electric engine specific to Harley-Davidson motorcycles.
 */
public interface IElectricEngine extends IElectric, IEngine {
    default int warrantyYears() {
        return Constants.ELECTRIC_MOTOR_WARRANTY_YEARS;
    }
    default int warrantyMiles() {
        return Constants.ELECTRIC_MOTOR_WARRANTY_MILES;
    }
    default ElectricPowerMethod powerMethod() {return ElectricPowerMethod.DC;}
}
