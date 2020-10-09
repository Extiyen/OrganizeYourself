/**
 * By default colour is set to dark gray
 */

import java.awt.*;

public class Status {
    private String name = "normal";
    private Color colour = Color.darkGray;

    public Status() {
    }

    public String getName() {
        return name;
    }

    public Color getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }
}
