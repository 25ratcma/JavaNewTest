package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.ElectricEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.interfaces.IElectricEngine;

public enum ElectricEngines implements IElectricEngine {
    //something is missing here
    ELECTRIC_75KW("Electric 75kW Motor", 75),
    ELECTRIC_150KW("Electric 150kW Motor", 150),
    ELECTRIC_200KW("Electric 200kW Motor", 200),
    ELECTRIC_250KW("Electric 250kW Motor", 250),
    ELECTRIC_350KW("Electric 350kW Motor", 350)

    ;


    //something is missing here
    private final String engineModel;
    //private final int powerOutput;
    private final ElectricEngine engine;

    ElectricEngines(String modelName, int powerOutput) {
        this.engineModel = modelName;
        this.engine = new ElectricEngine(powerOutput);

    }

    //some getters are missing here
    public String engineModel() { return engineModel; }
    public int powerOutput() { return engine.powerOutput(); }

    public String toString() { return toString(0);}

    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String tabs = "\t".repeat(indent);
        sb.append(tabs).append("Engine Model: ").append(engineModel()).append("\n");
        sb.append(engine.toString(indent +1));
        return sb.toString();
    }

}
