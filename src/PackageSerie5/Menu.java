package PackageSerie5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

    private JMenuBar menuBar;

    private JMenu applicationMenu;
    private JMenu etudiantMenu;
    private JMenu infos;

    private JMenuItem exit;
    private JMenuItem inscription;
    private JMenuItem IESN;
    private JMenuItem aide;

    private Container conteneur;

    Quitter sortie = new Quitter();

    //CoordonneeIESN infoIesn = new CoordonneeIESN();

    public Menu() {
        super("Menu");
        setBounds(100, 100, 500, 500);

        conteneur = this.getContentPane();

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        applicationMenu = new JMenu("Application");
        applicationMenu.setMnemonic('A');
        menuBar.add(applicationMenu);

        exit = new JMenuItem("Quitter");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        applicationMenu.add(exit);

        etudiantMenu = new JMenu("Etudiant");
        etudiantMenu.setMnemonic('E');
        menuBar.add(etudiantMenu);

        inscription = new JMenuItem("Inscription");
        etudiantMenu.add(inscription);

        infos = new JMenu("Infos");
        infos.setMnemonic('I');
        menuBar.add(infos);

        IESN = new JMenuItem("IESN");
        infos.add(IESN);

        aide = new JMenuItem("Aide");
        infos.add(aide);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        exit.addActionListener(sortie);

        IESN.addActionListener(new IESNListener());

        aide.addActionListener(new AideActionListener());

        inscription.addActionListener(new InscriptionListener());

        setVisible(true);
    }

    public Container getCont() {
        return conteneur;
    }

    private class IESNListener implements ActionListener { // classe interne

        public void actionPerformed(ActionEvent e) {

            conteneur.removeAll();
            conteneur.add(new InfoIesn(10, 10, 1080, 800));
            conteneur.repaint();
            conteneur.setVisible(true);

        }
    }

    private class AideActionListener implements  ActionListener{
        public  void actionPerformed(ActionEvent e){
            new FenetreAide();

        }
    }

    private  class  InscriptionListener implements  ActionListener{
        public  void  actionPerformed (ActionEvent e)
        {
            conteneur.removeAll();
            conteneur.add(new FormulaireInscription(Menu.this),BorderLayout.CENTER);
            conteneur.repaint();
            Menu.this.setVisible(true);
        }
    }
}

