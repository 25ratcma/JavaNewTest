package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums;


/**
 * Enum representing different motorcycle frame types for Harley-Davidson motorcycles.
 */
public enum Frames {
    F900XR("F900XR", "A versatile frame designed for sporty touring and everyday riding."),
    GSXR("GSX-R", "A high-performance frame built for racing and aggressive riding styles."),
    GSXS("GSX-S", "A sport-oriented frame designed for agility and performance on paved roads."),
    R1250GS("R1250GS", "An adventure-touring frame suitable for both on-road and off-road riding."),
    S1000RR("S1000RR", "A superbike frame engineered for maximum speed and precision handling.")
    ;
    private final String frameName;
    private final String frameDesc;

    Frames(String frameName, String frameDesc) {
        this.frameName = frameName;
        this.frameDesc = frameDesc;
    }

    public String getFrameName() {
        return frameName;
    }

    public String getFrameDesc() {
        return frameDesc;
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int indent) {
        String tabs = "\t".repeat(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(tabs).append("Frame Details:\n");
        tabs = tabs + "\t";
        sb.append(tabs).append("Frame Type: ").append(getFrameName()).append("\n");
        sb.append(tabs).append("Description: ").append(getFrameDesc()).append("\n");
        return sb.toString();
    }
}
