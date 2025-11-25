package io.github.nathanjrussell.vehicles.enums;


/**
 * Enum representing different categories of vehicles.
 */
public enum VehicleCategories {
    COMMERCIAL("Commercial", "Vehicle used for commercial purposes"),
    //something is missing here
    NONCOMMERCIAL("Non-Commercial", "Vehicle used for personal purposes");

    private final String category;
    private final String description;

    VehicleCategories(String category, String description) {
        this.category = category;
        this.description = description;
    }

    /** Returns the category of the vehicle.
     * @return name of vehicle category as a String
     */
    public String category() { return category; }

    /** Returns a description of the vehicle category.
     * @return a description of the vehicle category
     */
    public String description() { return description; }
}
