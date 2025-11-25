package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.enums;


import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums.CumminsEngines;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums.DetroitEngines;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.interfaces.IEngine;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums.EngineManufacturers;

/*
  This is the enum representing different Freightliner truck models.
  Each model includes the model name, the engine used, and the frame type.
  The purpose of this is to provide a unified way to reference truck models, their engines, and frames in the application.
 */
/**
 * Enum representing different Freightliner truck models.
 * <p>
 * Each enum constant contains the model display name, the engine used, and the associated frame type.
 * Provides convenience methods to access those fields and produce formatted string representations.
 */
public enum Models {
    /**
     * Cascadia models with their engines and frame references.
     */
    CASCADIA_DD13("Cascadia DD13", DetroitEngines.DETROIT_DD13_128, Frames.CASCADIA_FRAME),
    CASCADIA_DD15("Cascadia DD15", DetroitEngines.DETROIT_DD15_149, Frames.CASCADIA_FRAME),
    CASCADIA_DD16("Cascadia DD16", DetroitEngines.DETROIT_DD16_159, Frames.CASCADIA_FRAME),
    CASCADIA_X15("Cascadia X15", CumminsEngines.CUMMINS_X15_149, Frames.CASCADIA_FRAME),
    /**
     * Columbia models with their engines and frame references.
     */
    COLUMBIA_ISX15("Columbia ISX15", CumminsEngines.CUMMINS_ISX15_149, Frames.COLUMBIA_FRAME),
    COLUMBIA_SERIES60("Columbia Series 60", DetroitEngines.DETROIT_SERIES60_127, Frames.COLUMBIA_FRAME),
    /**
     * Coronado models with their engines and frame references.
     */
    CORONADO_DD16("Coronado DD16", DetroitEngines.DETROIT_DD16_159, Frames.CORONADO_FRAME),
    CORONADO_X15("Coronado X15", CumminsEngines.CUMMINS_X15_149, Frames.CORONADO_FRAME),
    /**
     * FLD models with their engines and frame references.
     */
    FLD_ISX15("FLD ISX15", CumminsEngines.CUMMINS_ISX15_149, Frames.FLD_FRAME),
    FLD_SERIES60("FLD Series 60", DetroitEngines.DETROIT_SERIES60_127, Frames.FLD_FRAME);

    // Name of the truck model
    private final String modelName;
    // Engine used in this truck model
    private final IEngine engine;
    // Frame type associated with this truck model
    private final Frames frameType;

    /**
     * Constructs a Models enum constant.
     *
     * @param modelName the display name of the model
     * @param engine    the engine used by the model
     * @param frameType the frame type for the model
     */
    Models (String modelName, IEngine engine, Frames frameType) {
        this.engine = engine;
        this.frameType = frameType;
        this.modelName = modelName;
    }

    /**
     * Returns the engine associated with this model.
     *
     * @return the {@link IEngine} for this model
     */
    public IEngine getEngine() {
        return engine;
    }
    /**
     * Returns the frame type associated with this model.
     *
     * @return the {@link Frames} value for this model
     */
    public Frames getFrameType() {
        return frameType;
    }
    /**
     * Returns the model display name.
     *
     * @return the model name string
     */
    public String getModelName() {
        return modelName;
    }
    /**
     * Returns the default string representation for this model with no indentation.
     *
     * @return formatted model details
     */
    public String toString() {
        return toString(0);
    }

    /**
     * Returns a formatted string representation of the model with the specified indentation level.
     * <p>
     * The output includes the model name, frame details, and engine details. Engine details are
     * appended by casting to the concrete engine enum based on the engine manufacturer.
     *
     * @param tabLevel the indentation level (number of leading tab characters)
     * @return formatted multi-line string describing the model
     */
    public String toString(int tabLevel) {
        StringBuilder sb = new StringBuilder();
        String tabs = "\t".repeat(tabLevel);
        // Model name
        sb.append(tabs).append("Model: ").append(getModelName()).append("\n");
        // Frame details
        sb.append(frameType.toString(tabLevel + 1));
        //Not 100% sure this is correct
        switch (engine.manufacturer()) {
            case DETROIT -> sb.append(((DetroitEngines) engine).toString(tabLevel+1));
            case CUMMINS -> sb.append(((CumminsEngines) engine).toString(tabLevel+1));
        }
        return sb.toString();
    }

}
