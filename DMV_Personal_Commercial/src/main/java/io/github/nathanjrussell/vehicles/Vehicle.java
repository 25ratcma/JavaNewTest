package io.github.nathanjrussell.vehicles;

import io.github.nathanjrussell.vehicles.enums.VehicleCategories;

/**
 * Abstract class representing a generic vehicle.
 */
public abstract class Vehicle {
    private final String vin;
    private final VehicleCategories category;

    public Vehicle(String vin, VehicleCategories category) {
        this.vin = vin;
        this.category = category;
    }

    /** Returns the Vehicle Identification Number (VIN) of the vehicle.
     * @return VIN as a String
     */
    public String getVin() {
        return vin;
    }

    /** Returns the category of the vehicle.
     * @return vehicle category as a VehicleCategories enum
     */
    public VehicleCategories getCategory() {
        return category;
    }

    /** Returns the string representation of the vehicle.
     * @return vehicle information as a formatted String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(0, sb);               // start at depth 0
        return sb.toString();
    }

    /** Appends the string representation of the vehicle to the provided StringBuilder with indentation.
     * @param indent current indentation level
     * @param sb StringBuilder to append the vehicle information to
     * @return the next indentation level for child classes
     */
    protected int toString(int indent, StringBuilder sb) {
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Vehicle Information:\n");
        tabs = tabs + "\t";
        sb.append(tabs).append("VIN: ").append(vin).append("\n");
        sb.append(tabs).append("Vehicle Category: ").append(category.category()).append("\n");
        return indent ;             // parent sets child’s base indent
    }
}


