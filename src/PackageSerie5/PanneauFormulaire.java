package PackageSerie5;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.*;

public class PanneauFormulaire extends JPanel {

    private JLabel matricule;
    private JLabel nom;
    private JLabel prenom;
    private JLabel dateNaissance;
    private JLabel section;
    private JLabel origine;


    private JTextField texteMatricule;
    private JTextField texteNom;
    private JTextField textePrenom;
    private JTextField texteDateNaissance;
    private JTextField texteSection;

    private JComboBox texteOrigine;

    private JCheckBox boursier;
    private JCheckBox etranger;

    private JRadioButton nouveauEtud;
    private JRadioButton reinscription;

    private ButtonGroup groupeInscrit;

    public PanneauFormulaire() {
        this.setLayout(new GridLayout(8, 2, 5, 5));

        matricule = new JLabel("Matricule");
        matricule.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(matricule);

        texteMatricule = new JTextField();
        texteMatricule.addFocusListener(new MatriculeListener());
        this.add(texteMatricule);

        nom = new JLabel("Nom");
        nom.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(nom);


        texteNom = new JTextField();
        this.add(texteNom);


        prenom = new JLabel("Prenom");
        prenom.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(prenom);


        textePrenom = new JTextField();
        this.add(textePrenom);


        dateNaissance = new JLabel("Date de Naissance");
        dateNaissance.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(dateNaissance);

        texteDateNaissance = new JTextField();
        this.add(texteDateNaissance);

        section = new JLabel("Section");
        section.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(section);


        texteSection = new JTextField();
        texteSection.setEnabled(false);
        this.add(texteSection);

        boursier = new JCheckBox("Boursier");
        boursier.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(boursier);

        etranger = new JCheckBox("Etranger");
        etranger.addItemListener(new EtrangéListener());
        this.add(etranger);


        origine = new JLabel("Origine");
        origine.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(origine);


        String[] textCombo = {"Europe", "Afrique", "Asie", "Amérique", "Océanie"};
        texteOrigine = new JComboBox(textCombo);
        texteOrigine.setEnabled(false);
        this.add(texteOrigine);


        nouveauEtud = new JRadioButton("Nouvel étudiant", false);
        nouveauEtud.setHorizontalAlignment(SwingConstants.CENTER);
        nouveauEtud.addActionListener(new RadioNouvelListener());
        this.add(nouveauEtud);

        reinscription = new JRadioButton("Reinscription", false);
        reinscription.addActionListener(new RadioDispenseListener());
        this.add(reinscription);

        groupeInscrit = new ButtonGroup();

        groupeInscrit.add(nouveauEtud);
        groupeInscrit.add(reinscription);


    }


    private class MatriculeListener implements FocusListener {
        @Override

        public void focusGained(FocusEvent e) {

        }

        public void focusLost(FocusEvent e) {
            try {
                switch (texteMatricule.getText(0, 1)) {
                    case "1":
                        texteSection.setText("Technologie de l'informatique");
                        break;
                    case "2":
                        texteSection.setText("Informatique de gestion");
                        break;
                    case "3":
                        texteSection.setText("Comptabilité");
                        break;
                    case "4":
                        texteSection.setText("Marketing");
                        break;
                    case "5":
                        texteSection.setText("Automatique");
                        break;
                    case "6":
                        texteSection.setText("Droit");
                        break;
                    case "7":
                        texteSection.setText("Regendat");
                        break;
                    default:
                        texteSection.setText("Matricule incorrecte");
                        break;
                }
            } catch (BadLocationException be) {
                be.printStackTrace();
            }
        }
    }


    private class RadioDispenseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (reinscription.isSelected()) {
                JOptionPane.showMessageDialog(PanneauFormulaire.this, "Va remettre tes dispenses au secraitariat !!");
            }
        }
    }


    private class RadioNouvelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (boursier.isSelected() && nouveauEtud.isSelected()) {
                JOptionPane.showMessageDialog(PanneauFormulaire.this, "Tu dois allez au secrétariat !");
            }
        }
    }


    private class EtrangéListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent evt) {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                texteOrigine.setEnabled(true);
            } else {
                texteOrigine.setEnabled(false);
            }
        }
    }


    @Override
    public String toString() {
        return "PanneauFormulaire{";

    }
}