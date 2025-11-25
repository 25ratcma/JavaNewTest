package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth;

import io.github.nathanjrussell.vehicles.categories.commercial.truck.Truck;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.enums.TruckMakes;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.enums.Models;

/**
 * Class representing a Kenworth truck make.
 *
 * <p>Extends the generic {@link Truck} class and associates it with a Kenworth {@link Models model}.</p>
 */
public class Make extends Truck {
    /**
     * The model of this Kenworth truck.
     */
    private final Models model;

    /**
     * Constructs a Kenworth truck make.
     *
     * @param vin   the vehicle identification number
     * @param model the Kenworth model for this truck
     */
    public Make(String vin, Models model) {
        super(vin, TruckMakes.KENWORTH);
        this.model = model;
    }

    /**
     * Returns the model associated with this Kenworth truck make.
     *
     * @return the {@link Models} value for this truck
     */
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
        // Append the Truck superclass details first
        indent = super.toString(indent, sb);
        // Append the Kenworth-specific model information
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Model: ").append(model).append("\n");
        return indent;
    }
}