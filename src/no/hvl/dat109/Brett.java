package no.hvl.dat109;

import javax.swing.*;
import java.awt.*;

public class Brett extends JPanel {

    public static JButton ruter[] = new JButton[9];
    public static int alterner = 0; //hvis partall: markerer "O", hvis oddetall: markerer "X"

    public Brett(int alterner){
        this.alterner = alterner;
    }
    public Brett (){
        setLayout(new GridLayout(3, 3));
        startBrett();
    }

    public void startBrett(){
        for (int i = 0; i < 9; i++){
            ruter[i] = new JButton();
            ruter[i].setText("");
            ruter[i].addActionListener(new ruteListener());

            add(ruter[i]);
            }
    }

    public static void restartBrett() {
        for (int i = 0; i < 9; i++) {
            ruter[i].setText("");
        }
    }
}
