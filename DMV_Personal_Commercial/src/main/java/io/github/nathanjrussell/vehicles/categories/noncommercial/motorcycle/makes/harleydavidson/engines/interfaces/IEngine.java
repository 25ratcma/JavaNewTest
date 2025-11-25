package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.interfaces;

/**
 * Interface representing a generic engine specific to Harley-Davidson motorcycles.
 */
public interface IEngine extends io.github.nathanjrussell.vehicles.engines.interfaces.IEngine {
    default String manufacturer() {
        return "Harley-Davidson";
    }


}
