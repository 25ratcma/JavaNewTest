package io.github.nathanjrussell.vehicles.engines.enums.fuel_power;

/**
 * Enum representing different methods of electric power delivery in electric motors.
 */
public enum ElectricPowerMethod {
    INDUCTION("Induction", "Induction motor"),
    DC("Direct Current", "Direct current motor"),
    ;

    private final String method;
    private final String description;

    ElectricPowerMethod(String method, String description) {
        this.method = method;
        this.description = description;
    }

    /** Returns the method of electric power delivery.
     * @return name of power delivery method as a String
     */
    public String method() { return method; }

    /** Returns a description of the electric power method.
     * @return a description of the power delivery method
     */
    public String description() { return description; }

    /** Returns the string representation of the electric power method.
     * @return power delivery method as a String
     */
    public String toString() { return method; }
}
