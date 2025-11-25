package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.enums;


/**
 * Enum representing different motorcycle frame types for Harley-Davidson motorcycles.
 */
public enum Frames {
    ALPHA("Alpha Platform", "Lightweight, rigid frame engineered for modern performance sedans and coupes."),
    C_K_SERIES("C/K Series", "Classic full-size truck frame known for durability and versatility."),
    E2XX("E2XX", "Mid-size car platform providing a balance of comfort, efficiency, and handling."),
    GMT800("GMT800", "Robust ladder frame used in Chevy trucks and SUVs during the early 2000s."),
    GMT900("GMT900", "Improved full-size SUV and truck frame designed for strength and towing capacity."),
    T1XX("T1XX", "Current generation full-size SUV and truck frame offering enhanced safety and capability."),
    ZETA("Zeta Platform", "Performance-oriented unibody frame used in the Camaro and other sporty models.")
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
