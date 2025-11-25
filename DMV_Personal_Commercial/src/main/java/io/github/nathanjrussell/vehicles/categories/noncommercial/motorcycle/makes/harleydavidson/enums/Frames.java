package io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.enums;


/**
 * Enum representing different motorcycle frame types for Harley-Davidson motorcycles.
 */
public enum Frames {
    CRUISER("Cruiser", "A motorcycle designed for long-distance riding with a relaxed riding position."),
    ADVENTURE("Adventure", "A motorcycle built for both on-road and off-road travel, suitable for long journeys."),
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
