package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner;

import io.github.nathanjrussell.vehicles.categories.commercial.truck.Truck;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.enums.TruckMakes;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.enums.Models;

/**
 *  class representing a Freightliner truck make.
 */
public class Make extends Truck {
    private final Models model;

    public Make(String vin, Models model) {
        super(vin, TruckMakes.FREIGHTLINER);
        this.model = model;
    }

    public Models getModel() {return model;}

    /**
     * Appends the string representation of the BMW make to the provided StringBuilder.
     *
     * @param indent the current indentation level
     * @param sb     the StringBuilder to append to
     * @return the next indentation level
     */

    @Override
    protected int toString(int indent, StringBuilder sb) {
        indent = super.toString(indent, sb);
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Model: ").append(model).append("\n");
        return indent;
    }
}