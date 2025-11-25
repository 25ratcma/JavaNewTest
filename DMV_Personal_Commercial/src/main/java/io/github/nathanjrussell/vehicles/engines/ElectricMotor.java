//THIS FILE IS FINE
package io.github.nathanjrussell.vehicles.engines;

import io.github.nathanjrussell.vehicles.engines.enums.EngineCategories;
import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.ElectricPowerMethod;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;

/**
 * Abstract class representing an electric motor.
 */
public abstract class ElectricMotor extends Engine {
    private final ElectricPowerMethod powerMethod;

    public ElectricMotor(
            int maxPowerOutput,
            PowerOutputUnits powerOutputUnit,
            ElectricPowerMethod powerMethod) {
        super(maxPowerOutput, powerOutputUnit, EngineCategories.ELECTRIC);
        this.powerMethod = powerMethod;
    }

    public ElectricMotor(int maxPowerOutput, ElectricPowerMethod powerMethod) {
        this(maxPowerOutput, PowerOutputUnits.KILOWATTS, powerMethod);
    }

    public ElectricMotor(int maxPowerOutput) {
        this(maxPowerOutput, PowerOutputUnits.KILOWATTS, ElectricPowerMethod.DC);
    }


    /** Returns information about the electric motor as a string.
     * @return Electric power method.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(0, sb);
        return sb.toString();
    }

    /** Returns a string representation of the electric motor with specified indentation.
     * @return Electric power method.
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
        sb.append(tabs).append("Motor Type: ").append(powerMethod).append("\n");
        sb.append(tabs).append("Engine Warranty Information:\n");
        tabs = "\t".repeat(indent + 1);
        sb.append(tabs).append("Warranty Years: ").append(warrantyYears()).append("\n");
        sb.append(tabs).append("Warranty Miles: ").append(warrantyMiles()).append("\n");
        return indent;             // parent sets child’s base indent
    }

}
