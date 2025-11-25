/*
This file is missing some code. Please add the missing code to complete the file.
 */


package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.enums;

import io.github.nathanjrussell.vehicles.interfaces.IMake;

public enum TruckMakes implements IMake {
    CHEVY("Chevrolet", "USA", "nice@chevy.com", "C67890"),
    FORD("Ford Motor Company", "USA", "nice@ford.com", "F12345"),
;

    private final String manufacturer;
    private final String country;
    private final String contact;
    private final String manufacturerId;

    TruckMakes(String manufacturer, String country, String contact, String manufacturerId) {
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
