package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.interfaces;

import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.FuelTypes;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.DisplacementUnit;
import io.github.nathanjrussell.vehicles.engines.interfaces.ICombustion;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.Constants;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums.EngineManufacturers;

/**
 * Freightliner-specific engine interface.
 *
 * <p>Extends the project's generic combustion and engine interfaces to provide default
 * units and fuel type for Freightliner engines, as well as warranty defaults and a
 * manufacturer identifier.</p>
 */
public interface IEngine extends ICombustion, io.github.nathanjrussell.vehicles.engines.interfaces.IEngine {
    /**
     * Default displacement unit for Freightliner engines.
     *
     * <p>Currently uses liters. May be changed to {@link DisplacementUnit#CUBIC_INCHES}
     * if required by tests or data sources.</p>
     *
     * @return the default {@link DisplacementUnit}
     */
    default DisplacementUnit displacementUnit() {return DisplacementUnit.LITERS;} // Might be CUBIC_INCHES Check when going through tests
    /**
     * Default fuel type for Freightliner engines.
     *
     * @return the default {@link FuelTypes} (diesel)
     */
    default FuelTypes fuelType() {return FuelTypes.DIESEL;}

    /**
     * Returns the engine manufacturer for this engine implementation.
     *
     * <p>Manufacturer enums are defined in the freightliner engines enums package.</p>
     *
     * @return the {@link EngineManufacturers} value
     */
    EngineManufacturers manufacturer(); // Inside the freightliner.enums package

    /**
     * Default warranty distance in miles for Freightliner combustion engines.
     *
     * <p>Value is provided by {@link Constants#COMBUSTION_ENGINE_WARRANTY_MILES}.</p>
     *
     * @return warranty miles
     */
    default int warrantyMiles() {return Constants.COMBUSTION_ENGINE_WARRANTY_MILES;}
    /**
     * Default warranty duration in years for Freightliner combustion engines.
     *
     * <p>Value is provided by {@link Constants#COMBUSTION_ENGINE_WARRANTY_YEARS}.</p>
     *
     * @return warranty years
     */
    default int warrantyYears() {return Constants.COMBUSTION_ENGINE_WARRANTY_YEARS;}
}
