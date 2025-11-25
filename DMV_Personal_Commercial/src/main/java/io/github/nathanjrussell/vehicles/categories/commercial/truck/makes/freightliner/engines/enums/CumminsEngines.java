package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums;

import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.Engine;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.interfaces.IEngine;

/*
 This is the enum representing specific Cummins engines used in Freightliner trucks.
 Each enum constant wraps an Engine object, and is programmed to store engine details like model, power, cylinders, displacement, and manufacturer.
 This also implements IEngine interface to provide standardized access to engine properties.
 */
/**
 * Enum representing specific Cummins engines used in Freightliner trucks.
 *
 * <p>Each enum constant wraps an {@link Engine} object containing the engine details:
 * model, power output, number of cylinders, displacement, and manufacturer.
 * Implements {@link IEngine} to provide standardized access to engine properties.</p>
 */
public enum CumminsEngines implements IEngine {
    /**
     * Cummins ISX15 — 149 hp, 6 cylinders, 15.0 L displacement.
     */
    CUMMINS_ISX15_149(new Engine("ISX15", 149, 6, 15.0, EngineManufacturers.CUMMINS)),
    /**
     * Cummins X15 — 149 hp, 6 cylinders, 15.0 L displacement.
     */
    CUMMINS_X15_149(new Engine("X15", 149, 6, 15.0, EngineManufacturers.CUMMINS));

    /**
     * Internal Engine object that holds the actual engine data.
     */
    private final Engine engine;

    /**
     * Constructs a CumminsEngines enum constant wrapping the provided {@link Engine}.
     *
     * @param engine the engine data to wrap
     */
    CumminsEngines(Engine engine) {
        this.engine = engine;
    }

    /**
     * Returns the model name of the engine.
     *
     * @return engine model name
     */
    public String engineModel() {
        return engine.getEngineModel();
    }

    /**
     * Returns the maximum power output of this Cummins engine.
     *
     * @return power output in horsepower
     */
    @Override
    public int powerOutput() {
        return engine.powerOutput();
    }

    /**
     * Returns the number of cylinders in this Cummins engine.
     *
     * @return number of cylinders
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
     * Returns the manufacturer of the engine (it will always be Cummins for these enums).
     *
     * @return the {@link EngineManufacturers} value
     */
    @Override
    public EngineManufacturers manufacturer() {
        return engine.getManufacturer();
    }

    /**
     * Returns a string representation of the engine using the Engine's toString method.
     *
     * @return string representation of the engine
     */
    @Override
    public String toString() {
        return engine.toString();
    }

    /**
     * Returns a string representation of the engine with the specified indentation level.
     *
     * @param indent number of indentation levels to apply
     * @return indented string representation of the engine
     */
    public String toString(int indent) {
        return engine.toString(indent);
    }
}
