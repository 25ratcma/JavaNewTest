package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.CombustionEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.interfaces.ICombustionEngine;

public enum CombustionEngines implements ICombustionEngine {
    //something is missing here
    BIG_BLOCK_74("Big Block 7.4L V8", 360, 8, 7.4),
    BLUE_FLAME_39("Blue Flame 3.9L I6", 150, 6, 3.9),
    CHEVY_COMPACT_18("Compact 1.8L I4", 140, 4, 1.8),
    CHEVY_METRO_30("Metro Sport 3.0L V6", 175, 6, 3.0),
    CHEVY_TITAN_62("Titan Concept 6.2L V8", 500, 8, 6.2),
    ECO_TEC_20("Ecotec 2.0L I4", 260, 4, 2.0),
    IRON_DUKE_25("Iron Duke 2.5L I4", 90, 4, 2.5),
    LS1_57("LS1 5.7L V8", 345, 8, 5.7),
    SMALL_BLOCK_57("Small Block 5.7L V8", 290, 8, 5.7),
    VORTEC_43("Vortec 4.3L V6", 200, 6, 4.3)

    ;


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
