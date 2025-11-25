package io.github.nathanjrussell.vehicles.categories.commercial;

import io.github.nathanjrussell.vehicles.Vehicle;
import io.github.nathanjrussell.vehicles.enums.VehicleCategories;
import io.github.nathanjrussell.vehicles.categories.commercial.enums.CommercialVehicleCategories;

/*
  Abstract class representing a commercial vehicle.
  Extends the generic Vehicle class and adds commercial-specific categories.
 */

public abstract class CommercialVehicle extends Vehicle {

    /**
     * The specific category of commercial vehicle.
     */
    private final CommercialVehicleCategories commercialVehicleCategory;

    /**
     * Constructs a new CommercialVehicle.
     *
     * @param VIN                        the vehicle identification number
     * @param commercialVehicleCategory  the commercial vehicle category for this vehicle
     */    public CommercialVehicle(String VIN, CommercialVehicleCategories commercialVehicleCategory) {
        super(VIN, VehicleCategories.COMMERCIAL);
        this.commercialVehicleCategory = commercialVehicleCategory;
    }

    /**
     * Returns the commercial category of this vehicle.
     *
     * @return the {@link CommercialVehicleCategories} value for this vehicle
     */
    public CommercialVehicleCategories getCommercialVehicleCategory() {
        return commercialVehicleCategory;
    }

    /**
     * Appends a string representation of the commercial vehicle to the provided {@link StringBuilder}.
     * <p>
     * This method includes commercial category information and delegates to the superclass to append
     * generic vehicle details first. Subclasses should use the returned indent value as the starting
     * indent for their own additions.
     *
     * @param indent the current indentation level
     * @param sb     the {@link StringBuilder} to append to
     * @return the next indent level for subclasses to use
     */
    @Override
    protected int toString(int indent, StringBuilder sb) {
        // Append the generic Vehicle details first
        indent = super.toString(indent, sb); // get parent toString info
        // Add commercial category details with one extra level of indentation
        String tabs = "\t".repeat(indent);
        tabs = tabs + "\t";
        sb.append(tabs).append("Commercial Category: ")
                .append(commercialVehicleCategory.category())
                .append("\n");
        // Return the next indent level for subclasses
        return indent + 1; // next indent level for child classes
    }
}