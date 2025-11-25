package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.interfaces;

/**
 * Interface representing a generic engine specific to bmw motorcycles.
 */
public interface IEngine extends io.github.nathanjrussell.vehicles.engines.interfaces.IEngine {
    default String manufacturer() {
        return "bmw";
    }


}
