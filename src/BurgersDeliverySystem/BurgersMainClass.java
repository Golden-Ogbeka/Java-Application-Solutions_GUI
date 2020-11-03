/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BurgersDeliverySystem;

import javax.swing.JFrame;

/**
 *
 * @author Nedlog
 */
public class BurgersMainClass {
    public static void main(String[] args) {
        Login obj=new Login();
        obj.setVisible(true);
        obj.setSize(971, 500);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
