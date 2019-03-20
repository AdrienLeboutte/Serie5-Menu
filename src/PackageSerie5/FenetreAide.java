package PackageSerie5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FenetreAide extends JFrame {

    private Container conteneur ;

    private Panneau panel;

    private JLabel texte;

    private JButton bouttonRetour;

    public FenetreAide()
    {
        super("Aide");
        setBounds(100,100,500,500);
       // this.setLayout(new FlowLayout());

     //   panel = new Panneau();

        conteneur = this.getContentPane();

        String texteAide ="<html> " +
                "<h1>Voici le texte d'aide</h1>" +
                "</html>";

        texte = new JLabel(texteAide,JLabel.CENTER);
        bouttonRetour = new JButton("Retour à la fenetre principale");

        bouttonRetour.setBounds(10,10,1,10);

        conteneur.add(texte,BorderLayout.NORTH);
        conteneur.add(bouttonRetour, BorderLayout.SOUTH);

        bouttonRetour.addActionListener(new ActionRetour());




        setVisible(true);

    }


    private class ActionRetour implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            FenetreAide.this.dispose();;

        }
    }



}
