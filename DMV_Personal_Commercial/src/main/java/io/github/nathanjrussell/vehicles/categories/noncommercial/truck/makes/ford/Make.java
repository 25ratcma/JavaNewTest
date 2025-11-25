package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford;

import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.Truck;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.enums.TruckMakes;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.enums.Models;

/**
 *  class representing a ford truk make.
 */
public  class Make extends Truck {
    private final Models model;

    public Make(String vin, Models model) {
        //something is missing here
        super(vin, TruckMakes.FORD);
        this.model = model;
    }

    public Models getModel() {
        return model;
    }

    /**
     * Appends the string representation of the BMW make to the provided StringBuilder.
     *
     * @param indent the current indentation level
     * @param sb     the StringBuilder to append to
     * @return the next indentation level
     */
    @Override
    protected int toString(int indent, StringBuilder sb) {
        int next = super.toString(indent, sb);
        sb.append(model.toString(next + 1));

        return next + 1;
    }
}
