package no.hvl.dat109;

import javax.swing.*;

public class Main{

    public static void main(String[] args) {

        JFrame vindu = new JFrame("Tripp Trapp Tresko!");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vindu.getContentPane().add(new Brett());
        vindu.setBounds(300, 200, 300, 300);
        vindu.setVisible(true);

    }


}
