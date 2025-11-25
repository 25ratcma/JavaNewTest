package io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.enums;

/*
  This is the enum representing different frame types used in Kenworth trucks.
  Each frame type has a name and a description outlining its purpose and features.
 */

/**
 * Enum representing different frame types used in Kenworth trucks.
 *
 * <p>Each frame type has a human\-readable name and a description outlining its
 * purpose and typical application.</p>
 */
public enum Frames {
    /**
     * C500 Frame — Severe-duty Class 8 frame built for oilfield, logging, and extreme vocational work.
     */
    C500_FRAME("C500 Frame", "Severe-duty Class 8 frame built for oilfield, logging, and extreme vocational work."),
    /**
     * K100 Frame — Historic cab\-over\-engine frame offering maneuverability for tight urban and regional routes.
     */
    K100_FRAME("K100 Frame", "Historic cab-over-engine frame offering maneuverability for tight urban and regional routes."),
    /**
     * T600 Frame — Aerodynamic Class 8 highway tractor frame engineered for fuel efficiency and comfort.
     */
    T600_FRAME("T600 Frame", "Aerodynamic Class 8 highway tractor frame engineered for fuel efficiency and comfort."),
    /**
     * T680 Frame — Aerodynamic Class 8 highway tractor frame engineered for fuel efficiency and comfort.
     */
    T680_FRAME("T680 Frame", "Aerodynamic Class 8 highway tractor frame engineered for fuel efficiency and comfort."),

    /**
     * T880 Frame — Vocational Class 8 frame designed for dump, mixer, and heavy-duty hauling applications.
     */
    T880_FRAME("T800 Frame", "Vocational Class 8 frame designed for dump, mixer, and heavy-duty hauling applications."),
    /**
     * W900 Frame — Iconic long\-nose frame emphasizing strength, custom styling, and heavy\-haul durability.
     */
    W900_FRAME("W900 Frame", "Iconic long-nose frame emphasizing strength, custom styling, and heavy-haul durability."),
    /**
     * W990 Frame — Modern evolution of the W900 frame, blending classic style with contemporary performance.
     */
    W990_FRAME("W990 Frame", "Modern evolution of the W900 frame, blending classic style with contemporary performance.");

    /**
     * Human\-readable name of the frame.
     */
    private final String frameName;
    /**
     * Description of the frame and its intended application.
     */
    private final String frameDesc;

    /**
     * Constructs a Frames enum constant with the provided name and description.
     *
     * @param frameName human\-readable name of the frame
     * @param frameDesc description of the frame and its intended application
     */
    Frames (String frameName, String frameDesc) {
        this.frameName = frameName;
        this.frameDesc = frameDesc;
    }

    /**
     * Returns the name of the frame.
     *
     * @return the frame name
     */
    public String getFrameName() {
        return frameName;
    }

    /**
     * Returns the description of the frame.
     *
     * @return the frame description
     */
    public String getFrameDesc() {
        return frameDesc;
    }

    /**
     * Returns a default string representation of the frame with no indentation.
     *
     * @return formatted multi-line string describing the frame
     */
    public String toString() {
        return toString(0);
    }

    /**
     * Returns a formatted string representation of the frame with the specified indentation.
     *
     * <p>The output includes a frame header followed by the frame type and description,
     * with properties indented one level deeper than the provided indent.</p>
     *
     * @param indent number of tab levels to indent the output
     * @return formatted multi-line string describing the frame
     */
    public String toString (int indent) {
        String tabs = "\t".repeat(indent);
        StringBuilder sb = new StringBuilder();
        // Frame header
        sb.append(tabs).append("Frame Details:\n");
        // Indent one more level for frame properties
        tabs = tabs + "\t";
        sb.append(tabs).append("Frame Type: ").append(getFrameName()).append("\n");
        sb.append(tabs).append("Description: ").append(getFrameDesc()).append("\n");
        return sb.toString();
    }
}
