package PackageSerie5;

import javax.swing.*;
import java.awt.*;

public class Panneau  extends JPanel {

    private JLabel message;

    public Panneau()
    {
        message = new JLabel("Voici le Menu");

        this.setLayout(new FlowLayout());

        this.add(message);
    }
}
