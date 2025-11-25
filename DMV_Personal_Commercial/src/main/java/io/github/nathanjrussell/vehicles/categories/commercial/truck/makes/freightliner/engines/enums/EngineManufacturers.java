package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums;

/*
  This is the enum representing the manufacturers of engines used in Freightliner trucks.
  It currently includes both Cummins and Detroit.
  The purpose of this is to provide a standard way to reference engine manufacturers throughout the code.
 */
/**
 * Enum representing the manufacturers of engines used in Freightliner trucks.
 * <p>
 * Provides a standard way to reference engine manufacturers throughout the code.
 */
public enum EngineManufacturers {
    /**
     * Cummins engine manufacturer.
     */
    CUMMINS("Cummins"),
    /**
     * Detroit engine manufacturer.
     */
    DETROIT("Detroit");

    /**
     * The written name of the manufacturer.
     */
    private final String name;

    /**
     * Constructs an EngineManufacturers enum constant with the given display name.
     *
     * @param name the display name of the manufacturer
     */
    EngineManufacturers(String name) {
        this.name = name;
    }

    /**
     * Returns the display name of the engine manufacturer.
     *
     * @return manufacturer name
     */
    public String getName() {return name;}

    /**
     * Returns the string representation of the manufacturer (its display name).
     *
     * @return manufacturer name
     */
    @Override
    public String toString() {
        return name;
    }
}