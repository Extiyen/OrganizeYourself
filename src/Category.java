/**
 * Currently name and colour are not set by default.
 * This will need to be set
 */

import java.awt.*;

public class Category {
    private Color colour;
    private String name;

    public Category() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        if (name == "")
            return "WARNING: NO CATEGORY SET";
        else
            return name;
    }
}
