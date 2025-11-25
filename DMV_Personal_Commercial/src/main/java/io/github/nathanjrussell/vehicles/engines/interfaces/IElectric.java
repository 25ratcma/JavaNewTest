package io.github.nathanjrussell.vehicles.engines.interfaces;

import io.github.nathanjrussell.vehicles.engines.enums.EngineCategories;
import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.ElectricPowerMethod;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;

/**
 * Interface representing an electric engine.
 */
public interface IElectric extends IEngine {

    ElectricPowerMethod powerMethod();

    /** Returns the category/type of the engine.
     * @return Engine category.
     */
    default EngineCategories engineCategory() { return EngineCategories.ELECTRIC; }

    /** Returns the unit of measurement for the power output.
     * @return Power output unit.
     */
    default PowerOutputUnits powerOutputUnit() { return PowerOutputUnits.KILOWATTS; }



}
