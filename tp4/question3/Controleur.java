package question3;

import question3.tp3.PileI;
import question3.tp3.PilePleineException;
import question3.tp3.PileVideException;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * D�crivez votre classe Controleur ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class Controleur extends JPanel {

    private JButton push, add, sub, mul, div, clear;
    private PileModele<Integer> pile;
    private JTextField donnee;

    public Controleur(PileModele<Integer> pile) {
        super();
        this.pile = pile;
        this.donnee = new JTextField(8);

        this.push = new JButton("push");
        this.add = new JButton("+");
        this.sub = new JButton("-");
        this.mul = new JButton("*");
        this.div = new JButton("/");
        this.clear = new JButton("[]");

        setLayout(new GridLayout(2, 1));
        add(donnee);
        donnee.addActionListener(null /* null est � remplacer */);
        JPanel boutons = new JPanel();
        boutons.setLayout(new FlowLayout());
        boutons.add(push);  push.addActionListener(null /* null est � remplacer */);
        boutons.add(add);   add.addActionListener(null /* null est � remplacer */);
        boutons.add(sub);   sub.addActionListener(null /* null est � remplacer */);
        boutons.add(mul);   mul.addActionListener(null /* null est � remplacer */);
        boutons.add(div);   div.addActionListener(null /* null est � remplacer */);
        boutons.add(clear); clear.addActionListener(null /* null est � remplacer */);
        add(boutons);
        boutons.setBackground(Color.red);
        actualiserInterface();
    }

    public void actualiserInterface() {
        // � compl�ter
    }

    private Integer operande() throws NumberFormatException {
        return Integer.parseInt(donnee.getText());
    }

    // � compl�ter
    // en cas d'exception comme division par z�ro, 
    // mauvais format de nombre suite � l'appel de la m�thode operande
    // la pile reste en l'�tat (intacte)

}