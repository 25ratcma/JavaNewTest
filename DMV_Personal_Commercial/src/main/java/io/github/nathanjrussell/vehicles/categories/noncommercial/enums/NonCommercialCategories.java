/*
This file is missing some code. Please add the missing code to complete the file.
 */



package io.github.nathanjrussell.vehicles.categories.noncommercial.enums;

/**
 * Enum representing different categories of personal vehicles.
 */
public enum NonCommercialCategories {
    TRUCK("Pickup Truck", "Vehicle designed to transport cargo or passengers"),
    MOTORCYCLE("Motorcycle", "Two-wheeled motor vehicle designed for one or two riders"),
    ;

    private final String name;
    private final String description;

    NonCommercialCategories(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}