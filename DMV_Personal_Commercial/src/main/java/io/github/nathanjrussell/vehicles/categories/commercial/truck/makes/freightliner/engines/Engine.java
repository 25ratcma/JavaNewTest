package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines;

import io.github.nathanjrussell.vehicles.engines.InternalCombustionEngine;
import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.FuelTypes;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.DisplacementUnit;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums.EngineManufacturers;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.Constants;

/*
 Represents a specific internal combustion engine used in Freightliner trucks.
 Extends InternalCombustionEngine to provide the standard engine properties: power, fuel type, number of cylinders, and displacement.
 Adds manufacturer-specific details like engine model and manufacturer enum.
 */
/**
 * Represents a specific internal combustion engine used in Freightliner trucks.
 * <p>
 * Extends {@link InternalCombustionEngine} to provide standard engine properties:
 * power, fuel type, number of cylinders, and displacement. Adds manufacturer-specific
 * details like engine model and manufacturer enum.
 */
public class Engine extends InternalCombustionEngine {
    /**
     * The manufacturer of this engine.
     */
    private final EngineManufacturers manufacturer;
    /**
     * The model name of the engine.
     */
    private final String engineModel;

    // This is the constructor for Engine.
    // Initializes all properties including power output, fuel type, number of cylinders, displacement, and the engine's manufacturer and model name.
    /**
     * Constructs a new Engine with the provided properties.
     *
     * @param engineModel  the engine model name
     * @param powerOutput  the maximum power output (in horsepower)
     * @param numCylinders the number of cylinders
     * @param displacement the engine displacement (in liters)
     * @param manufacturer the engine manufacturer enum
     */
    public Engine(String engineModel, int powerOutput, int numCylinders,
                  double displacement, EngineManufacturers manufacturer) {
        super(powerOutput, PowerOutputUnits.HORSEPOWER, FuelTypes.DIESEL,
                numCylinders, displacement, DisplacementUnit.LITERS);
        this.engineModel = engineModel;
        this.manufacturer = manufacturer;
    }

    /**
     * Returns the manufacturer of this engine.
     *
     * @return the {@link EngineManufacturers} value
     */
    public EngineManufacturers getManufacturer() {
        return manufacturer;
    }

    /**
     * Returns the engine model name.
     *
     * @return the engine model string
     */
    public String getEngineModel() {
        return engineModel;
    }

    /**
     * Returns the engine warranty in years, as defined in {@link Constants}.
     *
     * @return warranty years
     */
    @Override
    public int warrantyYears() {
        return Constants.COMBUSTION_ENGINE_WARRANTY_YEARS;
    }

    /**
     * Returns the engine warranty in miles, as defined in {@link Constants}.
     *
     * @return warranty miles
     */
    @Override
    public int warrantyMiles() {
        return Constants.COMBUSTION_ENGINE_WARRANTY_MILES;
    }

    /**
     * Returns a concise string representation of the engine.
     *
     * @return a short engine description
     */
    @Override
    public String toString() {
        return manufacturer + " " + engineModel + " " + powerOutput() + "hp";
    }

    /**
     * Returns a detailed, multi-line string representation of the engine with the specified indentation.
     * <p>
     * Includes manufacturer, model, type, power output, fuel type, cylinders, displacement,
     * and warranty information, formatted with tab-based indentation.
     *
     * @param indent the indentation level (number of leading tab characters)
     * @return formatted engine details
     */
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String tabs = "\t".repeat(indent);

        // fix for the test output
        sb.append(tabs).append(manufacturer).append(" Diesel Engine Model: ").append(manufacturer).append(" Diesel ").append(engineModel).append(" ").append(displacement()).append("L I").append(numCylinders()).append("\n");

        // All engine details need one more level of indentation
        String engineDetailsTabs = "\t".repeat(indent + 1);
        sb.append(engineDetailsTabs).append("Engine Type: Combustion\n");
        sb.append(engineDetailsTabs).append("Max Power Output: ").append(powerOutput()).append(" HP\n");
        sb.append(engineDetailsTabs).append("Fuel Type: ").append(fuelType()).append("\n");
        sb.append(engineDetailsTabs).append("Number of Cylinders: ").append(numCylinders()).append("\n");
        sb.append(engineDetailsTabs).append("Displacement: ").append(displacement()).append(" ").append(displacementUnit()).append("\n");

        // Warranty information at same level as other engine details
        sb.append(engineDetailsTabs).append("Engine Warranty Information:\n");

        // Warranty details need one more level of indentation
        String warrantyDetailsTabs = "\t".repeat(indent + 2);
        sb.append(warrantyDetailsTabs).append("Warranty Years: ").append(warrantyYears()).append("\n");
        sb.append(warrantyDetailsTabs).append("Warranty Miles: ").append(warrantyMiles()).append("\n");
        return sb.toString();
    }
}