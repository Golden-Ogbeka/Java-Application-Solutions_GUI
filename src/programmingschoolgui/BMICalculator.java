/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschoolgui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Nedlog
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BMICalculatorFrame obj=new BMICalculatorFrame();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(600, 400);
    }
    
}
