package io.github.nathanjrussell.vehicles.engines.interfaces;

import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.DisplacementUnit;
import io.github.nathanjrussell.vehicles.engines.enums.EngineCategories;
import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.FuelTypes;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;

/**
 * Interface representing a combustion engine.
 */
public interface ICombustion extends IEngine {

    /** Returns the number of cylinders in the combustion engine.
     * @return number of cylinders as an integer
     */
    int numCylinders();

    /** Returns the type of fuel used in the combustion engine.
     * @return fuel type as a FuelTypes enum
     */
    FuelTypes fuelType();

    /** Returns the displacement of the combustion engine.
     * @return displacement as a double
     */
    double displacement();

    /** Returns the unit of measurement for the engine displacement.
     * @return displacement unit as a DisplacementUnit enum
     */
    DisplacementUnit displacementUnit();


    /** Returns the category/type of the engine.
     * @return Engine category.
     */
    default EngineCategories engineCategory() {
        return EngineCategories.COMBUSTION;
    }

    /** Returns the unit of measurement for the power output.
     * @return Power output unit.
     */
    default PowerOutputUnits powerOutputUnit() { return PowerOutputUnits.HORSEPOWER; }




}
