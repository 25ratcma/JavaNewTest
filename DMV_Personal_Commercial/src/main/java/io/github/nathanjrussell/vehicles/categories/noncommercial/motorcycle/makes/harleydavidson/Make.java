package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson;

import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.MotorCycle;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.enums.MotorcycleMakes;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.enums.Models;

/**
 *  class representing a Harley-Davidson motorcycle make.
 */
public  class Make extends MotorCycle {
    private final Models model;

    public Make(String vin, Models model) {
        //something is missing here
        super(vin, MotorcycleMakes.HARLEY_DAVIDSON);
        this.model = model;
    }

    public Models getModel() {
        return model;
    }

    /**
     * Appends the string representation of the Harley-Davidson make to the provided StringBuilder.
     *
     * @param indent the current indentation level
     * @param sb     the StringBuilder to append to
     * @return the next indentation level
     */
    @Override
    protected int toString(int indent, StringBuilder sb) {
        int next = super.toString(indent, sb);
        sb.append(model.toString(next + 1));

        return next + 2;
    }
}
