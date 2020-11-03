/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschoolgui;

import javax.swing.JFrame;

/**
 *
 * @author Nedlog
 */
public class GUIAddition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIAdditionFrame af=new GUIAdditionFrame();
        af.setSize(400, 400);
        af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        af.setVisible(true);
        
    }
    
}
