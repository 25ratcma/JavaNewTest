package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.CombustionEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.interfaces.ICombustionEngine;

public enum CombustionEngines implements ICombustionEngine {
    //something is missing here
    BOXER_TWIN_70KW("Boxer Twin 70kW", 95, 2, 1170),
    BOXER_TWIN_81KW("Boxer Twin 81kW", 110,2 , 1170),
    KATANA_1000CC("Katana 1000cc", 150, 4, 999),
    SINGLE_CYLINDER_44KW("Single Cylinder 44kW", 60, 1, 313),
    TWIN_POWER_TURBO_100KW("TwinPower Turbo 100kW", 136, 2, 853),
    TWIN_POWER_TURBO_125KW("TwinPower Turbo 125kW", 170, 2, 999);
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
