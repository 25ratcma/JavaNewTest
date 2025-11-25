package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.ElectricEngine;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.enums.CombustionEngines;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.enums.ElectricEngines;
import io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.interfaces.IEngine;

/**
 * Enumeration of Harley-Davidson motorcycle models, each associated with a specific engine and frame type.
 */
public enum Models {
    BOLT_EV("Bolt EV", ElectricEngines.ELECTRIC_150KW, Frames.E2XX),
    CAMARO_E("Camaro E", ElectricEngines.ELECTRIC_200KW, Frames.ALPHA),
    CAMARO_SS("Camaro SS", CombustionEngines.LS1_57, Frames.ZETA),
    CORVETTE_STINGRAY("Corvette Stingray", CombustionEngines.SMALL_BLOCK_57, Frames.ALPHA),
    SILVERADO_1500("Silverado 1500", CombustionEngines.VORTEC_43, Frames.T1XX),
    SILVERADO_EV("Silverado EV", ElectricEngines.ELECTRIC_350KW, Frames.T1XX),
    SUBURBAN("Suburban", CombustionEngines.BIG_BLOCK_74, Frames.GMT900)
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
