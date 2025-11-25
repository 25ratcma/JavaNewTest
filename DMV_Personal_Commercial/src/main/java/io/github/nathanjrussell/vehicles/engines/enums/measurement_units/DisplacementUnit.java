package io.github.nathanjrussell.vehicles.engines.enums.measurement_units;

/**
 * Enum representing different units of engine displacement measurement.
 */
public enum DisplacementUnit {
 //something is missing here
    LITERS("L", "Liters"),
    CUBIC_CENTIMETERS("CC", "Cubic Centimeters"),
    CUBIC_INCHES("CI", "Cubic Inches"),;
    private final String unit;
    private final String description;

    DisplacementUnit(String unit, String description) {
        this.unit = unit;
        this.description = description;
    }

    //something is missing here
    public String getUnit() { return unit;}
    /** Returns the string representation of the displacement unit.
     * @return displacement unit as a String
     */
    public String toString() { return unit; }
}

