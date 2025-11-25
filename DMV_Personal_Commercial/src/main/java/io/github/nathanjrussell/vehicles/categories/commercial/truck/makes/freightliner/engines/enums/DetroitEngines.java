package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums;

import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.Engine;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.interfaces.IEngine;

/*
  This is the enum representing specific Detroit engines used in Freightliner trucks.
  Each enum constant wraps an Engine object containing the engine details: model, power output, number of cylinders, displacement, and manufacturer.
  This also implements IEngine interface to provide standardized access to engine properties.
 */

/**
 * Enum representing specific Detroit engines used in Freightliner trucks.
 *
 * <p>Each enum constant wraps an {@link Engine} object containing the engine details:
 * model, power output, number of cylinders, displacement, and manufacturer.
 * Implements {@link IEngine} to provide standardized access to engine properties.
 */
public enum DetroitEngines implements IEngine {
    /**
     * Detroit DD13 — 450 hp, 6 cylinders, 12.8 L displacement.
     */
    DETROIT_DD13_128(new Engine("DD13", 450, 6, 12.8, EngineManufacturers.DETROIT)),
    /**
     * Detroit DD15 — 149 hp, 6 cylinders, 15.0 L displacement.
     */
    DETROIT_DD15_149(new Engine("DD15", 149, 6, 15.0, EngineManufacturers.DETROIT)),

    /**
     * Detroit DD16 — 159 hp, 6 cylinders, 16.0 L displacement.
     */
    DETROIT_DD16_159(new Engine("DD16", 159, 6, 16.0, EngineManufacturers.DETROIT)),

    /**
     * Detroit Series 60 — 127 hp, 6 cylinders, 12.7 L displacement.
     */
    DETROIT_SERIES60_127(new Engine("Series 60", 127, 6, 12.7, EngineManufacturers.DETROIT));

    /**
     * Internal Engine object that holds the actual engine data.
     */
    private final Engine engine;

    /**
     * Constructs a DetroitEngines enum constant wrapping the provided {@link Engine}.
     *
     * @param engine the engine data to wrap
     */
    DetroitEngines(Engine engine) {
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
     * Returns the power output of the engine in horsepower.
     *
     * @return power output in hp
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
     * Returns the manufacturer of the engine.
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