package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.CombustionEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.ElectricEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.enums.CombustionEngines;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.enums.ElectricEngines;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.interfaces.IEngine;

import java.awt.*;

/**
 * Enumeration of bmw motorcycle models, each associated with a specific engine and frame type.
 */
public enum Models {
    ESCAPE("Escape", CombustionEngines.DURATEC_23, Frames.CD4),
    F150_LIGHTNING("F-150 Lightning", ElectricEngines.ELECTRIC_358KW, Frames.TE1),
    F150_SUPERDUTY("F-150 Super Duty", CombustionEngines.GODZILLA_73, Frames.T_SERIES),
    F150_XLT("F-150 XLT", CombustionEngines.ECOBOOST_35, Frames.U775),
    FORD_FOCUS_ELECTRIC("Focus Electric", ElectricEngines.ELECTRIC_150KW, Frames.CD4),
    FUSION_SE("Fusion SE", CombustionEngines.ECOBOOST_20, Frames.CD4),
    MUSTANG_GT("Mustang GT", CombustionEngines.COYOTE_50, Frames.S550),
    MUSTANG_MACH_E("Mustang Mach-E", ElectricEngines.ELECTRIC_210KW, Frames.GE1),
    SHELBY_GT500("Shelby GT500", CombustionEngines.PREDATOR_52, Frames.S550)
    ;

    private final String modelName;
    private final IEngine engine;
    private final Frames frameType;

    Models(String modelName, IEngine engine, Frames frameType) {
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
