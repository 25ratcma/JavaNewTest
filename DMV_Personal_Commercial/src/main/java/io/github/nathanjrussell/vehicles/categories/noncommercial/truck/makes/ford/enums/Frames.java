package io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.enums;


/**
 * Enum representing different truck frame types for ford trucks.
 */
public enum Frames {
    CD4("CD4 Platform", "Versatile front-wheel drive and all-wheel drive unibody frame for sedans and crossovers."),
    D_SERIES("D-Series", "Classic body-on-frame design used in early Ford trucks."),
    D4("D4 Platform", "SUV unibody platform supporting models like the Explorer and Flex."),
    FOX("Fox Platform", "Lightweight and adaptable unibody platform used in performance cars like the Mustang."),
    GE1("GE1 Platform", "Ford's dedicated electric vehicle frame, underpinning the Mustang Mach-E."),
    S550("S550 Platform", "Modern Mustang frame emphasizing rigidity and handling."),
    T_SERIES("T-Series", "Modern ladder frame engineered for Ford trucks and heavy-duty SUVs."),
    TE1("TE1 Platform", "Heavy-duty electric truck frame used for the F-150 Lightning."),
    U775("U775 Platform", "Strong body-on-frame platform used in the F-Series trucks.")
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
