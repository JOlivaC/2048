/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.Comuns;

import javax.swing.JFrame;

/**
 *
 * @author JOAN
 */
public abstract class Finestra extends JFrame {
    public void Show(){
        this.setVisible(true);
    }
    public void tancar(){
        this.dispose();
        this.setVisible(false);
    }
}
