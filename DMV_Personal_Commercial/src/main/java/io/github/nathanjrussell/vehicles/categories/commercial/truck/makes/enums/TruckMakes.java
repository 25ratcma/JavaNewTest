package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.enums;

import io.github.nathanjrussell.vehicles.interfaces.IMake;

/*
  This is the enum representing different truck manufacturers (makes) for commercial vehicles.
  Each make is programmed to store the manufacturer name, country, contact email, and a unique manufacturer ID.
  This also implements the IMake interface, providing standardized access to manufacturer information.
 */

/**
 * Enum representing different truck manufacturers (makes) for commercial vehicles.
 * <p>
 * Each constant stores the manufacturer name, country, contact email, and a unique manufacturer ID.
 * This enum implements {@link IMake} to provide standardized access to manufacturer information.
 */
public enum TruckMakes implements IMake {
    // These are the enum constants for specific truck makes with associated data
    FREIGHTLINER("Freightliner", "USA", "service@freightliner.com", "F44556"),
    KENWORTH("Kenworth", "USA", "service@kenworth.com", "K11223");

    // The name of the manufacturer
    private final String manufacturer;
    // The country where the manufacturer is based
    private final String country;
    // Contact email for manufacturer service
    private final String contact;
    // Unique identifier for the manufacturer
    private final String manufacturerId;

    /**
     * Constructs a TruckMakes enum constant.
     *
     * @param manufacturer   the manufacturer name
     * @param country        the country of origin
     * @param contact        the contact email for service/support
     * @param manufacturerId the unique manufacturer identifier
     */
    TruckMakes(String manufacturer, String country, String contact, String manufacturerId) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.contact = contact;
        this.manufacturerId = manufacturerId;
    }

    /**
     * Returns the name of the manufacturer.
     *
     * @return the manufacturer name
     */
    @Override
    public String manufacturer() {
        return manufacturer;
    }
    /**
     * Returns the country where the manufacturer is located.
     *
     * @return the manufacturer country
     */
    @Override
    public String country() {
        return country;
    }
    /**
     * Returns the contact email for the manufacturer.
     *
     * @return the contact email
     */
    @Override
    public String contact() {
        return contact;
    }
    /**
     * Returns the unique manufacturer ID.
     *
     * @return the manufacturer ID
     */
    @Override
    public String manufacturerId() {
        return manufacturerId;
    }
}