package io.github.nathanjrussell.vehicles.engines.enums;

/**
 * Enum representing different categories of engines.
 */
public enum EngineCategories {
    //something is missing here
    ELECTRIC("Electric", "Engine powered by electricity"),
    COMBUSTION("Combustion", "Engine powered by fuel combustion")
    ;

    private final String category;
    private final String description;

    EngineCategories(String category, String description) {
        this.category = category;
        this.description = description;
    }

    /** Returns the category of the engine.
     * @return name of engine category as a String
     */
    public String category() { return category; }

    /** Returns a description of the engine category.
     * @return a description of the engine category
     */
    public String description() { return description; }

    /** Returns the string representation of the engine category.
     * @return engine category as a String
     */
    public String toString() { return category; }
}

