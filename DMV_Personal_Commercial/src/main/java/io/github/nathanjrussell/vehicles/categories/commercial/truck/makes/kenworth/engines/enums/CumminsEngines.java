package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.enums;

import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.Engine;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.interfaces.IEngine;

/*
  This is the enum representing specific Cummins engines used in Kenworth trucks.
  Each enum constant wraps an Engine object containing the engine details: model, power output, number of cylinders, displacement, and manufacturer.
  This also implements IEngine interface to provide standardized access to engine properties.
 */

/**
 * Enum representing specific Cummins engines used in Kenworth trucks.
 *
 * <p>Each enum constant wraps an {@link Engine} object containing the engine
 * details: model, power output, number of cylinders, displacement, and manufacturer.
 * Implements {@link IEngine} to provide standardized access to engine properties
 * and formatted output.</p>
 */
public enum CumminsEngines implements IEngine {
    /**
     * Cummins X15 with 605 hp, 6 cylinders, 14.9L displacement.
     */
    CUMMINS_X15_149(new Engine("X15", 605, 6, 14.9, EngineManufacturers.CUMMINS)),

    /**
     * Cummins ISX12 with 425 hp, 6 cylinders, 11.6L displacement.
     */
    CUMMINS_ISX12_116(new Engine("ISX12", 425, 6, 11.6, EngineManufacturers.CUMMINS));

    /**
     * Internal {@link Engine} object that holds the actual engine data.
     */
    private final Engine engine;

    /**
     * Constructs a CumminsEngines enum constant by wrapping the provided {@link Engine}.
     *
     * @param engine Engine instance containing model, power, cylinders, displacement and manufacturer
     */
    CumminsEngines(Engine engine) {
        this.engine = engine;
    }

    /**
     * Returns the model name of the engine.
     *
     * @return engine model string
     */
    public String engineModel() {
        return engine.getEngineModel();
    }

    /**
     * Returns the power output of the engine in horsepower.
     *
     * @return power output in HP
     */
    @Override
    public int powerOutput() {
        return engine.powerOutput();
    }

    /**
     * Returns the number of cylinders in the engine.
     *
     * @return cylinder count
     */
    @Override
    public int numCylinders() {
        return engine.numCylinders();
    }

    /**
     * Returns the engine displacement in liters.
     *
     * @return displacement in liters
     */
    @Override
    public double displacement() {
        return engine.displacement();
    }

    /**
     * Returns the manufacturer of the engine; always Cummins for these constants.
     *
     * @return engine manufacturer
     */
    @Override
    public EngineManufacturers manufacturer() {
        return engine.getManufacturer();
    }

    /**
     * Returns a concise string representation of the engine.
     *
     * @return short descriptive string
     */
    @Override
    public String toString() {
        return engine.toString();
    }

    /**
     * Returns a detailed string representation of the engine with the specified indentation.
     *
     * @param indent number of tab characters to indent the output
     * @return formatted multi-line string describing the engine
     */
    public String toString(int indent) {
        return engine.toString(indent);
    }
}