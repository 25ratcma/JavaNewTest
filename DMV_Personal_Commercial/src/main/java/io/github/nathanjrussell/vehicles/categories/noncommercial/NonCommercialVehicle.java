package io.github.nathanjrussell.vehicles.categories.noncommercial;

import io.github.nathanjrussell.vehicles.Vehicle;
import io.github.nathanjrussell.vehicles.enums.VehicleCategories;
import io.github.nathanjrussell.vehicles.categories.noncommercial.enums.NonCommercialCategories;

public abstract class NonCommercialVehicle extends Vehicle {

    private final NonCommercialCategories nonCommercialVehicleCategory;

    public NonCommercialVehicle(String VIN, NonCommercialCategories nonCommercialVehicleCategory) {
        super(VIN, VehicleCategories.NONCOMMERCIAL);
        this.nonCommercialVehicleCategory = nonCommercialVehicleCategory;
    }



    @Override
    protected int toString(int indent, StringBuilder sb) {
        //something is missing here
        indent = super.toString(indent, sb); // get parent toString info
        String tabs = "\t".repeat(indent);
        tabs = tabs + "\t";
        sb.append(tabs).append("Non-Commercial Category: ")
          .append(nonCommercialVehicleCategory.getName())
          .append("\n");
        return indent + 1; // next indent level for child classes
    }
}
