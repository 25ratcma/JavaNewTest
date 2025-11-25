//THIS FILE IS FINE

package io.github.nathanjrussell.vehicles.engines;

import io.github.nathanjrussell.vehicles.engines.enums.EngineCategories;
import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.FuelTypes;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.DisplacementUnit;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;
import io.github.nathanjrussell.vehicles.engines.interfaces.ICombustion;

/**
 * Abstract class representing an internal combustion engine.
 */
public abstract class InternalCombustionEngine extends Engine implements ICombustion {
    private final FuelTypes fuelType;
    private final int numCylinders;
    private final double displacement;
    private final DisplacementUnit displacementUnit;

    public InternalCombustionEngine(
            int maxPowerOutput,
            PowerOutputUnits powerOutputUnit,
            FuelTypes fuelType,
            int numCylinders,
            double displacement,
            DisplacementUnit displacementUnit) {
        super(maxPowerOutput, powerOutputUnit, EngineCategories.COMBUSTION);
        this.fuelType = fuelType;
        this.numCylinders = numCylinders;
        this.displacement = displacement;
        this.displacementUnit = displacementUnit;
    }

    /** Returns the number of cylinders in the combustion engine.
     * @return number of cylinders as an integer
     */
    public int numCylinders() { return numCylinders; }

    /** Returns the displacement of the combustion engine.
     * @return displacement as a double
     */
    public double displacement() { return displacement; }

    /** Returns the type of fuel used in the combustion engine.
     * @return fuel type as a FuelTypes enum
     */
    public FuelTypes fuelType() { return fuelType; }

    /** Returns the unit of measurement for the engine displacement.
     * @return displacement unit as a DisplacementUnit enum
     */
    public DisplacementUnit displacementUnit() { return displacementUnit; }

    /** Generates a string representation of the internal combustion engine.
     * @return String representation of the engine.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(0, sb);
        return sb.toString();
    }

    /** Generates a string representation of the internal combustion engine with specified indentation.
     * @return String representation of the engine.
     */
    public String toString(int tabLevel) {
        StringBuilder sb = new StringBuilder();
        toString(tabLevel, sb);
        return sb.toString();
    }

    /** Returns information about the engine along with warranty details.
     * @return int indent level for child elements.
     */
    protected int toString(int indent, StringBuilder sb) {
        indent = super.toString(indent, sb);
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Fuel Type: ").append(fuelType.fuelType()).append("\n");
        sb.append(tabs).append("Number of Cylinders: ").append(numCylinders).append("\n");
        sb.append(tabs).append("Displacement: ")
                .append(displacement).append(" ")
                .append(displacementUnit).append("\n");
        sb.append(tabs).append("Engine Warranty Information:\n");
        tabs = "\t".repeat(indent + 1);
        sb.append(tabs).append("Warranty Years: ").append(warrantyYears()).append("\n");
        sb.append(tabs).append("Warranty Miles: ").append(warrantyMiles()).append("\n");
        return indent;             // parent sets child’s base indent
    }
}
