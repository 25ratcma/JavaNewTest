package io.github.nathanjrussell.vehicles.engines.enums.fuel_power;

/**
 * Enum representing different types of fuel used in combustion engines.
 */
public enum FuelTypes {
    //something is missing here
    DIESEL("Diesel", ""),
    GASOLINE("Gasoline", ""),
    ;

    private final String fuelType;
    private final String description;

    FuelTypes(String fuelType, String description) {
        this.fuelType = fuelType;
        this.description = description;
    }

    //a few things are missing here
    public String fuelType() { return fuelType; }
    public String Description() { return description; }

     public String toString() { return fuelType; }

}
