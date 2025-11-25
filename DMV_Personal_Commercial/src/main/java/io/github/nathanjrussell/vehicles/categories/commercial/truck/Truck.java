package io.github.nathanjrussell.vehicles.categories.commercial.truck;

import io.github.nathanjrussell.vehicles.categories.commercial.CommercialVehicle;
import io.github.nathanjrussell.vehicles.categories.commercial.enums.CommercialVehicleCategories;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.enums.TruckMakes;

/*
  This is the abstract class representing a commercial truck.
  Extends CommercialVehicle and adds truck-specific attributes such as the make.
 */

public abstract class Truck extends CommercialVehicle {
    // The manufacturer/make of the truck
    private final TruckMakes make;

    /**
     * Constructs a new Truck.
     *
     * @param vin  the vehicle identification number
     * @param make the manufacturer/make of the truck
     */
    public Truck(String vin, TruckMakes make) {
        super(vin, CommercialVehicleCategories.TRUCK);
        this.make = make;
    }

    /**
     * Returns the make of the truck.
     *
     * @return the {@link TruckMakes} value for this truck
     */
    public TruckMakes getMake() {
        return make;
    }

    /**
     * Appends a string representation of the truck-specific details to the provided {@link StringBuilder}.
     * <p>
     * This method delegates to the superclass to append generic commercial vehicle details first,
     * then appends truck-specific properties such as make and manufacture ID.
     *
     * @param indent the current indentation level
     * @param sb     the {@link StringBuilder} to append to
     * @return the current indent level after appending truck details
     */
    @Override
    protected int toString(int indent, StringBuilder sb) {
        // Append the CommercialVehicle superclass details first
        indent = super.toString(indent, sb);
        // Indent for truck-specific details
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Commercial Truck Details:").append("\n");
        // Indent one more level for properties
        tabs = tabs + "\t";
        sb.append(tabs).append("Make: ").append(make.manufacturer()).append("\n");
        sb.append(tabs).append("Manufacture ID: ").append(make.manufacturerId()).append("\n");
        return indent;
    }
}