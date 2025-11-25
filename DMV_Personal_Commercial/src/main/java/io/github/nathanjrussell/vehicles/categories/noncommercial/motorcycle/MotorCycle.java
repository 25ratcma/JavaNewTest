package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle;

import io.github.nathanjrussell.vehicles.categories.noncommercial.NonCommercialVehicle;
import io.github.nathanjrussell.vehicles.categories.noncommercial.enums.NonCommercialCategories;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.enums.MotorcycleMakes;

/**
 * Abstract class representing a motorcycle, extending the PersonalVehicle class.
 */
public abstract class MotorCycle extends NonCommercialVehicle {
    private final MotorcycleMakes make;

    public MotorCycle(String vin, MotorcycleMakes make) {
        super(vin, NonCommercialCategories.MOTORCYCLE);
        this.make = make;
    }

    public MotorcycleMakes getMake() {
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
        sb.append(tabs).append("Motorcycle Details:").append("\n");
        tabs = tabs + "\t";
        sb.append(tabs).append("Make: ").append(make.manufacturer()).append("\n");
        sb.append(tabs).append("Manufacture ID: ").append(make.manufacturerId()).append("\n");
        return indent; // next indent level for child classes
    }
}
