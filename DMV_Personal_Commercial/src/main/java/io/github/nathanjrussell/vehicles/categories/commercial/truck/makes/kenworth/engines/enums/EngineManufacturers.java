package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.enums;

/* This is the num representing the manufacturers of engines used in Kenworth trucks.
   It currently includes Cummins and PACCAR.
   The purpose of this is to provide a standardized way to reference engine manufacturers throughout the code.
 */

/**
 * Enum representing engine manufacturers used in Kenworth trucks.
 *
 * <p>Provides a standardized way to reference engine manufacturers throughout
 * the codebase and exposes a human\-readable name for each manufacturer.</p>
 */
public enum EngineManufacturers {
    /**
     * Cummins engine manufacturer.
     */
    CUMMINS("Cummins"),
    /**
     * PACCAR engine manufacturer.
     */
    PACCAR("PACCAR");

    /**
     * Human\-readable name of the manufacturer.
     */
    private final String name;

    /**
     * Constructs an EngineManufacturers enum constant with the provided human\-readable name.
     *
     * @param name the display name for the manufacturer
     */
    EngineManufacturers(String name) {
        this.name = name;
    }

    /**
     * Returns the human\-readable name of the engine manufacturer.
     *
     * @return manufacturer name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the string representation of the manufacturer (the human\-readable name).
     *
     * @return manufacturer name
     */
    @Override
    public String toString() {
        return name;
    }
}