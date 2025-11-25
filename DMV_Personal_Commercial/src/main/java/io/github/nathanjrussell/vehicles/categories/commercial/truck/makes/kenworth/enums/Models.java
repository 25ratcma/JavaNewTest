package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.enums;

import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.enums.CumminsEngines;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.enums.PaccarEngines;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.interfaces.IEngine;

/*
  This is the Enum representing different Kenworth truck models.
  Each model is associated with a specific engine and frame type.
  The purpose of this is to provide a unified way to reference and display model information.
 */

/**
 * Enum representing different Kenworth truck models.
 *
 * <p>Each enum constant associates a human-readable model name with a specific
 * {@link IEngine engine} and {@link Frames frame type}. Provides accessors for
 * those properties and a formatted {@code toString(int)} that emits indented
 * details for model, frame, and engine.</p>
 */
public enum Models {
    /**
     * Kenworth C500 equipped with Paccar MX-15 engine on C500 frame.
     */
    C500_MX15("Kenworth C500 MX-15", PaccarEngines.PACCAR_MX15_149, Frames.C500_FRAME),

    /**
     * Kenworth C500 equipped with Cummins X15 engine on C500 frame.
     */
    C500_X15("Kenworth C500 X15", CumminsEngines.CUMMINS_X15_149, Frames.C500_FRAME),

    /**
     * Kenworth K100 Series with Paccar MX-13 engine on K100 frame.
     */
    K100_SERIES("Kenworth K100 Series", PaccarEngines.PACCAR_MX13_149, Frames.K100_FRAME),

    /**
     * Kenworth T680 with Paccar MX-13 engine on T680 frame.
     */
    T680_MX13("Kenworth T680 MX-13", PaccarEngines.PACCAR_MX13_129, Frames.T680_FRAME),

    /**
     * Kenworth T680 with Cummins X15 engine on T680 frame.
     */
    T680_X15("Kenworth T680 X15", CumminsEngines.CUMMINS_X15_149, Frames.T680_FRAME),

    /**
     * Kenworth T880 with Paccar MX-11 engine on T880 frame.
     */
    T880_MX11("Kenworth T880 MX-11", PaccarEngines.PACCAR_MX11_109, Frames.T880_FRAME),

    /**
     * Kenworth T880 with Cummins X15 engine on T880 frame.
     */
    T880_X15("Kenworth T880 X15", CumminsEngines.CUMMINS_X15_149, Frames.T880_FRAME),

    /**
     * Kenworth W900 with Paccar MX-13 engine on W900 frame.
     */
    W900_MX13("Kenworth W900 MX-13", PaccarEngines.PACCAR_MX13_129, Frames.W900_FRAME),

    /**
     * Kenworth W990 with Paccar MX-13 engine on W990 frame.
     */
    W990_MX13("Kenworth W990 MX-13", PaccarEngines.PACCAR_MX13_129, Frames.W990_FRAME),

    /**
     * Kenworth W990 with Cummins ISX12 engine on W990 frame.
     */
    W990_X15("Kenworth W990 X15", CumminsEngines.CUMMINS_ISX12_116, Frames.W990_FRAME);

    /**
     * Human-readable name of the model.
     */
    private final String modelName;
    /**
     * Engine associated with the model.
     */
    private final IEngine engine;
    /**
     * Frame type associated with the model.
     */
    private final Frames frameType;

    /**
     * Constructs a Models enum constant.
     *
     * @param modelName human-readable model name
     * @param engine    engine associated with the model
     * @param frameType frame type associated with the model
     */
    Models (String modelName, IEngine engine, Frames frameType) {
        this.engine = engine;
        this.frameType = frameType;
        this.modelName = modelName;
    }

    /**
     * Returns the engine associated with the model.
     *
     * @return the {@link IEngine} for this model
     */
    public IEngine getEngine() {
        return engine;
    }

    /**
     * Returns the frame type associated with the model.
     *
     * @return the {@link Frames} value for this model
     */
    public Frames getFrameType() {
        return frameType;
    }

    /**
     * Returns the human-readable model name.
     *
     * @return model name string
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Returns a detailed, indented string representation of the model.
     *
     * <p>The output includes the model name, indented frame details (one level deeper),
     * and engine details (one level deeper). Engine rendering is delegated to the concrete
     * engine enum based on the engine's manufacturer.</p>
     *
     * @param tabLevel indentation level to apply (number of tab characters)
     * @return formatted multi-line string describing the model
     */
    public String toString(int tabLevel) {
        StringBuilder sb = new StringBuilder();
        String tabs = "\t".repeat(tabLevel);
        // Model name
        sb.append(tabs).append("Model: ").append(getModelName()).append("\n");
        // Frame details (indented one level deeper)
        sb.append(frameType.toString(tabLevel + 1));
        // Not 100% sure this is correct
        // Engine details (indented one level deeper)
        switch (engine.manufacturer()) {
            case PACCAR -> sb.append(((PaccarEngines) engine).toString(tabLevel+1));
            case CUMMINS -> sb.append(((CumminsEngines) engine).toString(tabLevel+1));
        }
        return sb.toString();
    }
}
