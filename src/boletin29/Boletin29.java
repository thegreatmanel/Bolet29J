/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FOLFO
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barcos> puerto = new ArrayList();
        Metodos met = new Metodos();
        JOptionPane.showMessageDialog(null, "Velero");
        met.addVel(puerto);
        JOptionPane.showMessageDialog(null, "Deportivo");
        met.addDep(puerto);
        JOptionPane.showMessageDialog(null, "Yate");
        met.addYat(puerto);
        for (Barcos barco : puerto) {
            met.imprimir(barco);
        }
    }
}