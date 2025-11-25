package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.CombustionEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.interfaces.ICombustionEngine;

public enum CombustionEngines implements ICombustionEngine {
    //something is missing here
    MILWAUKEE_EIGHT_107("Milwaukee Eight 107", 92, 2, 1122),
    MILWAUKEE_EIGHT_114("Milwaukee Eight 114", 100, 2, 1868),
    MILWAUKEE_EIGHT_117("Milwaukee Eight 117", 125, 2, 1923),
    REVOLUTION_MAX_1250S("Revolution Max 1250S", 145, 2, 1250),
    REVOLUTION_MAX_1250T("Revolution Max 1250T", 121, 2, 1250),
    V_TWIN("V-TWIN", 74, 2, 883);


    //something is missing here
    //private final double displacement;
    private final String engineModel;
    //private final int numCylinders;
    //private final int powerOutput;
    private final CombustionEngine engine;

    CombustionEngines(String modelName,int powerOutput, int numCylinders, double displacement) {
        this.engineModel = modelName;
//        this.powerOutput = powerOutput;
//        this.numCylinders = numCylinders;   these are incase engine class is not used
//        this.displacement = displacement;
        this.engine = new CombustionEngine(powerOutput, numCylinders, displacement);

    }

    //some getters are missing here
    public String engineModel() { return engineModel; }
//    public int numCylinders() { return numCylinders; }
//    public int powerOutput() { return powerOutput; }     these are incase engine class is not used
//    public double displacement() { return displacement; }
    public int powerOutput() { return engine.powerOutput(); }
    public double displacement() { return engine.displacement(); }
    public int numCylinders() { return engine.numCylinders(); }


    public String toString() { return toString(0);}

    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Engine Model: ").append(engineModel()).append("\n");
        sb.append(engine.toString(indent +1));
        return sb.toString();
    }

}
