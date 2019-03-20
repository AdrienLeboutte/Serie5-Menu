package PackageSerie5;

import javax.swing.*;
import java.awt.*;

public class InfoIesn extends JPanel {

   JLabel texte;

    private JPanel panneau;

        public InfoIesn(int x, int y, int largeur, int hauteur) {

            this.setBounds(x, y, largeur, hauteur);

            String newTexte = "<html> <h1> Coordonnée de l'IESN </h1> " +
                    "<p>" +
                    "Telephone : 0486 / 45 78 36 <br/>" +
                    "Adresse : rue du bois jolie <br/>" +
                    "5000 Namur " +
                    "" +
                    "</p> </html>";

            texte = new JLabel(newTexte);

            this.setLayout(new FlowLayout());

            this.add(texte);


        }
}
