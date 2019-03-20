package PackageSerie5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanneauBoutons extends JPanel {

    private Menu fenetreBoutonFormulaire;

    private PanneauFormulaire pf;

    private JButton retour;
    private JButton validation;
    private JButton reinitialisation;


    public PanneauBoutons(Menu fenetreBouton)
    {
        this.fenetreBoutonFormulaire = fenetreBouton;

        this.setLayout(new FlowLayout());

        retour = new JButton("Retour");

        validation = new JButton("Validation");

        reinitialisation = new JButton("Reinitialiser");

        retour.addActionListener(new RetourListener());
        validation.addActionListener(new ValidationListener());
        reinitialisation.addActionListener(new RéinitListener());

        this.add(retour);
        this.add(validation);
        this.add(reinitialisation);

    }



    private class RetourListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt){
            fenetreBoutonFormulaire.getCont().removeAll();
            fenetreBoutonFormulaire.getCont().add(new PanneauBienvenue(), BorderLayout.CENTER);
            fenetreBoutonFormulaire.getCont().repaint();
            fenetreBoutonFormulaire.setVisible(true);
        }
    }


    private class ValidationListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){

           new Etudiant(pf);

            JOptionPane.showMessageDialog(PanneauBoutons.this, "Confirmation de l'étudiant" );
        }
    }


    private class RéinitListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            fenetreBoutonFormulaire.getCont().removeAll();
            fenetreBoutonFormulaire.getCont().add(new FormulaireInscription(fenetreBoutonFormulaire),BorderLayout.CENTER);
            fenetreBoutonFormulaire.getCont().repaint();
            fenetreBoutonFormulaire.setVisible(true);
        }
    }


}
