package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.enums;

import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.enums.CombustionEngines;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.enums.ElectricEngines;
import io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.interfaces.IEngine;

/**
 * Enumeration of Harley-Davidson motorcycle models, each associated with a specific engine and frame type.
 */
public enum Models {
    TRIKE_A("Trike Model A", CombustionEngines.MILWAUKEE_EIGHT_107, Frames.CRUISER),
    TRIKE_B("Trike Model B", CombustionEngines.MILWAUKEE_EIGHT_114, Frames.CRUISER),
    SPORTSTER_S("Sportster Model S", CombustionEngines.MILWAUKEE_EIGHT_117, Frames.CRUISER),
    ADVENTURE_TOURER("Adventure Tourer", CombustionEngines.V_TWIN, Frames.ADVENTURE),
    EADVENTURE_TOURER("Electic Adventure Tourer", ElectricEngines.LIVEWIRE, Frames.ADVENTURE),
    ECITY_CRUISER("Electric City Cruiser", ElectricEngines.LIVEWIRE, Frames.CRUISER)
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
