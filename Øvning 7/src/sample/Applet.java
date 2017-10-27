
import java.awt.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.*;
import java.applet.*;

public class Applet extends JApplet{
    public void init(){
        add(new Epple());
    }
}

class Epple extends JPanel{
    public void paintComponent(Graphics smiley) {
        smiley.drawOval(60, 60, 200, 220);
        smiley.fillOval(90, 120, 50, 50);
        smiley.fillOval(190, 120, 50, 50);
        smiley.drawArc(110, 130, 95, 95, 0, -180);
    }
}