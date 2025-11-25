package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.interfaces;


import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.Constants;
import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.FuelTypes;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.DisplacementUnit;
import io.github.nathanjrussell.vehicles.engines.interfaces.ICombustion;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.enums.EngineManufacturers;

/**
 * Kenworth-specific engine interface combining generic combustion engine behavior
 * with project-specific defaults for displacement unit, fuel type, manufacturer,
 * and warranty values.
 */
public interface IEngine extends ICombustion, io.github.nathanjrussell.vehicles.engines.interfaces.IEngine {
    /**
     * Default displacement unit for Kenworth engines.
     * Might be CUBIC_INCHES — check when running tests.
     *
     * @return default {@link DisplacementUnit} (LITERS)
     */
    default DisplacementUnit displacementUnit() {return DisplacementUnit.LITERS;} // Might be CUBIC_INCHES Check when going through tests
    /**
     * Default fuel type for Kenworth engines.
     *
     * @return default {@link FuelTypes} (DIESEL)
     */
    default FuelTypes fuelType() {return FuelTypes.DIESEL;}

    /**
     * Returns the manufacturer for Kenworth engines.
     *
     * @return {@link EngineManufacturers} value
     */
    EngineManufacturers manufacturer();

    /**
     * Default warranty distance in miles for Kenworth combustion engines.
     * Value is taken from {@link Constants}.
     *
     * @return warranty miles
     */
    default int warrantyMiles() {return Constants.COMBUSTION_ENGINE_WARRANTY_MILES;}
    /**
     * Default warranty duration in years for Kenworth combustion engines.
     * Value is taken from {@link Constants}.
     *
     * @return warranty years
     */
    default int warrantyYears() {return Constants.COMBUSTION_ENGINE_WARRANTY_YEARS;}
}