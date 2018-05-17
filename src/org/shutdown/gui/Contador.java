/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shutdown.gui;

import javax.swing.JLabel;

/**
 *
 * @author jvergara
 */
public class Contador extends Thread {

    private int contador;
    private JLabel lbl;

    public Contador(int contador, JLabel lbl) {
        this.contador = contador;
        this.lbl = lbl;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    @Override
    public void run() {
        while (contador >= 0) {
            lbl.setText(String.valueOf(contador));
            contador--;
            try {
                sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.err.println(interruptedException);
            }
        }
    }
}
