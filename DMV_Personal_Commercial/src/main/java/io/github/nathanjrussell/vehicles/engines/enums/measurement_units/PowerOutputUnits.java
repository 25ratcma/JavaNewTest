package io.github.nathanjrussell.vehicles.engines.enums.measurement_units;

/**
 * Enum representing different units of power output measurement.
 */
public enum PowerOutputUnits {
    HORSEPOWER("HP", "Horsepower"),
    KILOWATTS("kW", "Kilowatts"),
    ;

    //something is missing here
    private final String unit;
    private final String description;

    PowerOutputUnits(String unit, String description) {
        this.unit = unit;
        this.description = description;
    }

    /** Returns the unit of power output measurement.
     * @return name of power output unit as a String
     */
    public String unit() { return unit;}

    /** Returns a description of the power output unit.
     * @return a description of the power output unit
     */
    public String description() { return description; }

    /** Returns the string representation of the power output unit.
     * @return power output unit as a String
     */
    public String toString() { return unit; }


}
