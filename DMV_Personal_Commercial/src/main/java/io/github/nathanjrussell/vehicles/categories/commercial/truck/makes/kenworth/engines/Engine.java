package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines;

import io.github.nathanjrussell.vehicles.engines.InternalCombustionEngine;
import io.github.nathanjrussell.vehicles.engines.enums.fuel_power.FuelTypes;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.DisplacementUnit;
import io.github.nathanjrussell.vehicles.engines.enums.measurement_units.PowerOutputUnits;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.enums.EngineManufacturers;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.Constants;

/*
  This represents a specific internal combustion engine used in Kenworth trucks.
  Extends InternalCombustionEngine to provide the standard engine properties: power output, fuel type, number of cylinders, and displacement.
  Adds manufacturer-specific details like engine model and manufacturer enum.
 */
/**
 * Represents a specific internal combustion engine used in Kenworth trucks.
 *
 * <p>Extends {@link InternalCombustionEngine} to provide standard engine properties:
 * power output, fuel type, number of cylinders, and displacement. Adds
 * manufacturer-specific details like engine model and manufacturer enum.</p>
 */
public class Engine extends InternalCombustionEngine {
    /**
     * Manufacturer of this engine.
     */
    private final EngineManufacturers manufacturer;
    /**
     * Model name of this engine.
     */
    private final String engineModel;

    /**
     * Constructs an Engine instance.
     *
     * @param engineModel human-readable model name
     * @param powerOutput maximum power output in the specified {@link PowerOutputUnits}
     * @param numCylinders number of cylinders in the engine
     * @param displacement engine displacement in the specified {@link DisplacementUnit}
     * @param manufacturer manufacturer enum for this engine
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
     * Returns the model name of the engine.
     *
     * @return model name string
     */
    public String getEngineModel() {
        return engineModel;
    }

    /**
     * Returns the engine warranty in years as defined in {@link Constants}.
     *
     * @return warranty duration in years
     */
    @Override
    public int warrantyYears() {
        return Constants.COMBUSTION_ENGINE_WARRANTY_YEARS;
    }

    /**
     * Returns the engine warranty in miles as defined in {@link Constants}.
     *
     * @return warranty distance in miles
     */
    @Override
    public int warrantyMiles() {
        return Constants.COMBUSTION_ENGINE_WARRANTY_MILES;
    }

    /**
     * Returns a concise string representation of the engine.
     *
     * @return short descriptive string containing manufacturer, model, and power
     */
    @Override
    public String toString() {
        return manufacturer + " " + engineModel + " " + powerOutput() + "hp";
    }

    /**
     * Returns a detailed string representation of the engine with the specified indentation.
     *
     * <p>Includes manufacturer, model, type, power output, fuel type, cylinders, displacement,
     * and warranty information. Indentation is applied using tab characters.</p>
     *
     * @param indent number of tab characters to indent the output
     * @return formatted multi-line string describing the engine
     */
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String tabs = "\t".repeat(indent);

        // Engine model line - current indentation level
        sb.append(tabs).append("Engine Model: ").append(manufacturer).append(" ").append(engineModel).append(" ").append(displacement()).append("L I").append(numCylinders()).append("\n");

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