package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.ElectricEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.interfaces.IElectricEngine;

public enum ElectricEngines implements IElectricEngine {
    //something is missing here
    ELECTRIC_31KW("Electric 31kW Motor", 31)
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
