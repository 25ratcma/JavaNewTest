package io.github.nathanjrussell.vehicles.engines.interfaces;

import io.github.nathanjrussell.vehicles.engines.InternalCombustionEngine;
import io.github.nathanjrussell.vehicles.engines.enums.EngineCategories;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;

/**
 * Interface representing a generic engine.
 */
public interface IEngine {
    /** Returns the unit of measurement for the power output.
     * @return Power output unit.
     */
    PowerOutputUnits powerOutputUnit();

    /** Returns the maximum power output of the engine.
     * @return Maximum power output.
     */
    int powerOutput();

    /** Returns the category/type of the engine.
     * @return Engine category.
     */
    EngineCategories engineCategory();

    /** Returns the warranty period in years.
     * @return warranty period in years as an integer
     */
    int warrantyYears();

    /** Returns the warranty coverage in miles.
     * @return warranty coverage in miles as an integer
     */
    int warrantyMiles();

}
