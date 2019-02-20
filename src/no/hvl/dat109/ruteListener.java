package no.hvl.dat109;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ruteListener implements ActionListener {

    public void actionPerformed(ActionEvent e){
        JButton ruteKlikk = (JButton)e.getSource();
        if (Brett.alterner%2 == 0 ){
            ruteKlikk.setText("X");
        }else{
            ruteKlikk.setText("O");
        }

        if (sjekkVinn() == true){
            JOptionPane.showConfirmDialog(null, "Game Over");
            Brett.restartBrett();
        }
        Brett.alterner ++;
    }
    public boolean sjekkVinn(){
        /**
         * tabell:
         * 0|1|2
         * 3|4|5
         * 6|7|8
         */
        //horisontal
        if (sjekkNeste(0,1) && sjekkNeste(1, 2)){
            return true;
        }else if (sjekkNeste(3, 4) && sjekkNeste(4, 5)){
            return true;
        }else if (sjekkNeste(6, 7) && sjekkNeste(7, 8)){
            return true;
        }
        //diagonal
        else if (sjekkNeste(0, 4) && sjekkNeste(4, 8)){
            return true;
        }else if (sjekkNeste(2, 4) && sjekkNeste(4, 6)){
            return true;
        }
        //vertikal
        else if (sjekkNeste(0, 3) && sjekkNeste(3, 6)){
            return true;
        }else if (sjekkNeste(1, 4) && sjekkNeste(4, 7)){
            return true;
        }else if (sjekkNeste(2, 5) && sjekkNeste(5, 8)){
            return true;
        }else {
            return false;
        }
    }

    public boolean sjekkNeste(int a, int b){
        if (Brett.ruter[a].getText().equals(Brett.ruter[b].getText()) && !Brett.ruter[a].getText().equals("")){
            return true;
        }else{
            return false;
        }
    }
}
