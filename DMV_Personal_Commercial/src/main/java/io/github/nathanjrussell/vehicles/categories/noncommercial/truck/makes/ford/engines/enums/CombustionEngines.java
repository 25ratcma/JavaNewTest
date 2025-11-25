package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.CombustionEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.interfaces.ICombustionEngine;

public enum CombustionEngines implements ICombustionEngine {
    //something is missing here
    COYOTE_35("Cyclone 3.5L V6", 265, 6, 3.5),
    COYOTE_50("Coyote 5.0L V8", 460, 8, 5.0),
    DURATEC_23("Duratec 2.3L I4", 160, 4, 2.3),
    ECOBOOST_15("EcoBoost 1.5L I4", 181, 4, 1.5),
    ECOBOOST_20("EcoBoost 2.0L I4", 245, 4, 2.0),
    ECOBOOST_27("EcoBoost 2.7L V6", 325, 6, 2.7),
    ECOBOOST_35("EcoBoost 3.5L V6", 400, 6, 3.5),
    GODZILLA_73("Godzilla 7.3L V8", 430, 8, 7.3),
    PREDATOR_52("Predator 5.2L V8", 760, 8, 5.2)
    ;
;

    //something is missing here

    //private final double displacement;
    //private final int numCylinders;
    //private final int powerOutput;

    private final String engineModel;
    private final CombustionEngine engine;

    CombustionEngines(String modelName, int powerOutput, int numCylinders, double displacement) {

//        this.powerOutput = powerOutput;
//        this.numCylinders = numCylinders;   these are incase engine class is not used
//        this.displacement = displacement;

        this.engineModel = modelName;
        this.engine = new CombustionEngine(powerOutput, numCylinders, displacement);

    }

    //some getters are missing here

//    public int numCylinders() { return numCylinders; }
//    public int powerOutput() { return powerOutput; }     these are incase engine class is not used
//    public double displacement() { return displacement; }

    public int powerOutput() { return engine.powerOutput(); }
    public double displacement() { return engine.displacement(); }
    public int numCylinders() { return engine.numCylinders(); }
    public String engineModel() { return engineModel; }

    public String toString() { return toString(0);}

    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Engine Model: ").append(engineModel()).append("\n");
        sb.append(engine.toString(indent +1));
        return sb.toString();
    }

}
