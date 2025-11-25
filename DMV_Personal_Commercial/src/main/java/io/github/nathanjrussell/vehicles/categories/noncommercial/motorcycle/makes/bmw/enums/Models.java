package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.ElectricEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.enums.CombustionEngines;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.enums.ElectricEngines;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.interfaces.IEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Frames;

/**
 * Enumeration of bmw motorcycle models, each associated with a specific engine and frame type.
 */
public enum Models {
    C400GT("C400GT", ElectricEngines.ELECTRIC_31KW, io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Frames.F900XR),
    C400X("C400X", ElectricEngines.ELECTRIC_31KW, io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Frames.F900XR),
    F900XR("F900XR", CombustionEngines.TWIN_POWER_TURBO_100KW, io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Frames.F900XR),
    G310GS("G310GS", CombustionEngines.SINGLE_CYLINDER_44KW, io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Frames.R1250GS),
    R1250GS("R1250GS", CombustionEngines.BOXER_TWIN_70KW, io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Frames.F900XR),
    S1000RR("S1000RR", CombustionEngines.TWIN_POWER_TURBO_125KW, io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Frames.S1000RR)
    ;

    private final String modelName;
    private final IEngine engine;
    private final io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Frames frameType;

    Models(String modelName, IEngine engine, io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Frames frameType) {
        this.engine = engine;
        this.frameType = frameType;
        this.modelName = modelName;
    }

    public IEngine getEngine() {
        return engine;
    }

    public Frames getFrameType() {
        return frameType;
    }

    public String getModelName() {
        return modelName;
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int tabLevel) {
        StringBuilder sb = new StringBuilder();
        String tabs = "\t".repeat(tabLevel);
        sb.append(tabs).append("Model: ").append(getModelName()).append("\n");
        sb.append(frameType.toString(tabLevel + 1));
        switch (engine.engineCategory()) {
            case COMBUSTION -> sb.append(((CombustionEngines) engine).toString(tabLevel+1));
            case ELECTRIC -> sb.append(((ElectricEngines) engine).toString(tabLevel+1));
        }
        return sb.toString();
    }
}
