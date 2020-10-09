import javax.swing.*;
import java.awt.*;
//COLOR PALETTE: https://www.color-hex.com/color-palette/57029
public class Window {
    JFrame frame = new JFrame("OrganizeYourself");
    public Window() {
        //size
        this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.frame.setSize(400, 400);

        //visibility
        //this.frame.setUndecorated(true);
        this.frame.setBackground(Color.decode("#aaaaaa"));
        this.frame.setVisible(true);

        //functionality
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.pack();

        //JScrollPane scrollPane = new JScrollPane(); // Creates a scrollable pane
    }
}
