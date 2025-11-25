package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.enums;
/*
 This is the enum representing different Freightliner truck frames.
 Each enum constant contains the frame's name and a description of its purpose and design.
 Useful for referencing frame types throughout the application.
 */

/**
 * Enum representing different Freightliner truck frames.
 * <p>
 * Each constant contains the frame's display name and a description of its purpose and design.
 * Useful for referencing frame types throughout the application.
 */
public enum Frames {
    /**
     * Aerodynamic long-haul highway tractor frame optimized for efficiency and driver comfort.
     */
    CASCADIA_FRAME("Cascadia Frame", "Aerodynamic long-haul highway tractor frame optimized for efficiency and driver comfort."),
    /**
     * Durable Class 8 frame built for regional hauling and heavy-duty applications.
     */
    COLUMBIA_FRAME("Columbia Frame", "Durable Class 8 frame built for regional hauling and heavy-duty applications."),
    /**
     * Heavy-duty vocational frame designed for logging, mining, and other severe applications.
     */
    CORONADO_FRAME("Coronado Frame", "Heavy-duty vocational frame designed for logging, mining, and other severe applications."),
    /**
     * Classic Freightliner frame for on-highway use, known for strength and serviceability.
     */
    FLD_FRAME("FLD Frame", "Classic Freightliner frame for on-highway use, known for strength and serviceability.");

    // Name of the frame
    private final String frameName;
    // Description of the frame's purpose and characteristics
    private final String frameDesc;

    /**
     * Constructs a Frames enum constant with the given name and description.
     *
     * @param frameName the display name of the frame
     * @param frameDesc a short description of the frame
     */
    Frames (String frameName, String frameDesc) {
        this.frameName = frameName;
        this.frameDesc = frameDesc;
    }

    /**
     * Returns the display name of the frame.
     *
     * @return the frame display name
     */
    public String getFrameName() {
        return frameName;
    }

    /**
     * Returns the description of the frame's purpose and characteristics.
     *
     * @return the frame description
     */
    public String getFrameDesc() {
        return frameDesc;
    }

    /**
     * Returns the string representation of the frame with default indentation (0).
     *
     * @return formatted frame details
     */
    public String toString() {
        return toString(0);
    }

    /**
     * Returns a formatted string representation of the frame with the specified indentation.
     *
     * @param indent the indentation level (number of leading tab characters)
     * @return multi-line string describing the frame with the given indentation
     */
    public String toString (int indent) {
        String tabs = "\t".repeat(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(tabs).append("Frame Details:\n");
        // Increase indentation for details
        tabs = tabs + "\t";
        sb.append(tabs).append("Frame Type: ").append(getFrameName()).append("\n");
        sb.append(tabs).append("Description: ").append(getFrameDesc()).append("\n");
        return sb.toString();
    }
}
