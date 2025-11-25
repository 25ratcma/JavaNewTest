//THIS FILE IS FINE

package io.github.nathanjrussell.vehicles.engines;

import io.github.nathanjrussell.vehicles.engines.enums.EngineCategories;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;
import io.github.nathanjrussell.vehicles.engines.interfaces.IEngine;

/**
 * Abstract base class for different types of engines.
 */
public abstract class Engine implements IEngine {
    private final int maxPowerOutput;
    private final PowerOutputUnits powerOutputUnit;
    private final EngineCategories engineType;

    public Engine(int maxPowerOutput, PowerOutputUnits powerOutputUnit, EngineCategories engineType) {
        this.maxPowerOutput = maxPowerOutput;
        this.powerOutputUnit = powerOutputUnit;
        this.engineType = engineType;
    }

    /**
     * Returns the maximum power output of the engine.
     *
     * @return Maximum power output.
     */
    public int powerOutput() {
        return maxPowerOutput;
    }

    /**
     * Returns the unit of measurement for the power output.
     *
     * @return Power output unit.
     */
    public PowerOutputUnits powerOutputUnit() {
        return powerOutputUnit;
    }

    /**
     * Returns the category/type of the engine.
     *
     * @return Engine category.
     */
    public EngineCategories engineCategory() {
        return engineType;
    }

    /**
     * Generates a string representation of the engine with indentation.
     *
     * @return int indent level for child elements.
     */
    protected int toString(int indent, StringBuilder sb) {
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Engine Type: ").append(engineType).append("\n");
        sb.append(tabs).append("Max Power Output: ").append(maxPowerOutput).append(" ").append(powerOutputUnit).append("\n");
        return indent;             // parent sets child’s base indent
    }
}
