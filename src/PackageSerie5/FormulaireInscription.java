package PackageSerie5;

import javax.swing.*;
import java.awt.*;

public class FormulaireInscription extends JPanel {

    public  FormulaireInscription(Menu fenetre)
    {
        this.setLayout(new BorderLayout());

        this.add(new PanneauFormulaire(),BorderLayout.CENTER);


        this.add(new PanneauBoutons(fenetre),BorderLayout.SOUTH);



    }




}
