package io.github.nathanjrussell.vehicles.categories.noncommercial.truck;

import io.github.nathanjrussell.vehicles.categories.noncommercial.NonCommercialVehicle;
import io.github.nathanjrussell.vehicles.categories.noncommercial.enums.NonCommercialCategories;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.enums.MotorcycleMakes;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.enums.TruckMakes;

/**
 * Abstract class representing a truck, extending the PersonalVehicle class.
 */
public abstract class Truck extends NonCommercialVehicle {
    private final TruckMakes make;

    public Truck(String vin, TruckMakes make) {
        super(vin, NonCommercialCategories.TRUCK);
        this.make = make;
    }

    public TruckMakes getMake() {
        return make;
    }

    /**
     * Appends the string representation of the motorcycle to the provided StringBuilder.
     *
     * @param indent the current indentation level
     * @param sb     the StringBuilder to append to
     * @return the next indentation level
     */
    @Override
    protected int toString(int indent, StringBuilder sb) {
        //something is missing here
        indent = super.toString(indent, sb); // get parent toString info
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Pickup Truck Details:").append("\n");
        tabs = tabs + "\t";
        sb.append(tabs).append("Make: ").append(make.manufacturer()).append("\n");
        sb.append(tabs).append("Manufacture ID: ").append(make.manufacturerId()).append("\n");
        return indent; // next indent level for child classes
    }
}
