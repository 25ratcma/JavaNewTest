package io.github.nathanjrussell.vehicles.categories.commercial.enums;

public enum CommercialVehicleCategories {
    // These strings are most likely wrong and will need to be changed when we have the other classes and are comparing to the expected outputs
    BOX_TRUCK("Box Truck", "A truck with an enclosed cargo area"),
    TRUCK("Truck", "A motor vehicle designed to transport cargo");


    private final String category;
    private final String description;

    CommercialVehicleCategories(String category, String description) {
        this.category = category;
        this.description = description;
    }

    /**
     * Returns the display name of the commercial vehicle category.
     *
     * @return the category display name
     */
    public String category() {return category;}

    /**
     * Returns a description of the commercial vehicle category.
     *
     * @return the category description
     */
    public String getDescription() {return description;}

    /**
     * Returns the string representation of the commercial vehicle category.
     *
     * @return the category display name
     */
    public String toString() {return category;}

}