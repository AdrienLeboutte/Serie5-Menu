package PackageSerie5;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {

    private Panneau panel;

    private Container conteneur;

    public Fenetre()
    {
        super("Menu");
        setBounds(100,100,500,500);

        panel = new Panneau();

        conteneur = this.getContentPane();

        conteneur.setLayout(new BorderLayout());

        conteneur.add(panel, BorderLayout.CENTER);





        setVisible(true);


    }




}
