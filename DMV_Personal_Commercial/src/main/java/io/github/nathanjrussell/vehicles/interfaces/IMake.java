package io.github.nathanjrussell.vehicles.interfaces;

/**
 * Interface representing a vehicle manufacturer (make).
 */
public interface IMake {
    /** Returns the name of the manufacturer.
     * @return Manufacturer name.
     */
    String manufacturer();

    /** Returns the country of origin of the manufacturer.
     * @return Country of origin.
     */
    String country();

    /** Returns the contact information for the manufacturer.
     * @return Contact information.
     */
    String contact();

    /** Returns the unique identifier for the manufacturer.
     * @return Manufacturer ID.
     */
    String manufacturerId();
}
