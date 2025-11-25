/*
This file is missing some code. Please add the missing code to complete the file.
 */


package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.enums;

import io.github.nathanjrussell.vehicles.interfaces.IMake;

public enum MotorcycleMakes implements IMake {
    BMW("BMW", "Germany", "nice@bmw.com", "E99072"),
    HARLEY_DAVIDSON("Harley-Davidson", "USA", "nice@harley-davidson.com", "D88961");

    private final String manufacturer;
    private final String country;
    private final String contact;
    private final String manufacturerId;

    MotorcycleMakes(String manufacturer, String country, String contact, String manufacturerId) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.contact = contact;
        this.manufacturerId = manufacturerId;
    }

    public String manufacturer() {
        return manufacturer;
    }
    public String country() {
        return country;
    }
    public String contact() {
        return contact;
}
    public String manufacturerId() {
        return manufacturerId;
    }
}
