package PackageSerie5;

import javax.swing.*;
import java.awt.*;

public class PanneauBienvenue extends JPanel {

    private JLabel label;

    public PanneauBienvenue() {
        this.setBorder(BorderFactory.createLineBorder(Color.RED));
        label = new JLabel("<html><h1>Bienvenue sur l'application bidon de l'I.E.S.N</h1></html>");
        this.setLayout(new FlowLayout());
        this.add(label);
    }


}
