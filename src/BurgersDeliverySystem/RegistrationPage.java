/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BurgersDeliverySystem;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author Nedlog
 */
public class RegistrationPage extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationPage
     */
    public RegistrationPage() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbSex = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        passWord = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRATION");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 60, 190, 20);

        jLabel3.setText("USERNAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(36, 103, 70, 20);

        jLabel4.setText("LASTNAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(36, 149, 60, 14);

        jLabel5.setText("ADRESS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(36, 192, 100, 20);

        jLabel6.setText("PHONE NUMBER");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(36, 235, 90, 20);

        jLabel7.setText("SEX");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(36, 289, 40, 14);
        getContentPane().add(txtUserName);
        txtUserName.setBounds(193, 100, 140, 20);
        getContentPane().add(txtLastName);
        txtLastName.setBounds(193, 146, 140, 20);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(193, 189, 190, 20);
        getContentPane().add(txtPhoneNumber);
        txtPhoneNumber.setBounds(193, 232, 140, 20);

        jLabel8.setText("PASSWORD");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(36, 338, 90, 20);

        cmbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        cmbSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSex);
        cmbSex.setBounds(193, 286, 110, 20);

        jLabel9.setBackground(java.awt.Color.yellow);
        jLabel9.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TASTY BURGERS DELIVERY SYSTEM");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 970, 40);
        getContentPane().add(passWord);
        passWord.setBounds(190, 340, 200, 20);

        jPanel1.setBackground(java.awt.Color.red);
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BurgersDeliverySystem/Tasty burger.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(470, 10, 480, 357);

        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnback.setText("BACK ");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(60, 380, 110, 30);

        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuit.setText("EXIT");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuit);
        btnQuit.setBounds(680, 390, 120, 30);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(220, 380, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 970, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.setVisible(false);
        this.dispose();
        Login obj= new Login();
        obj.setVisible(true);
        obj.setSize(971, 500);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
            String username=txtUserName.getText().trim();
            String lastname=txtLastName.getText().trim();
            String address=txtAddress.getText().trim();
            String phonenumber=txtPhoneNumber.getText().trim();
            String sex=cmbSex.getSelectedItem().toString().trim();
            String password=new String(passWord.getPassword()).trim();
        if(username.isEmpty()||lastname.isEmpty()||address.isEmpty()||phonenumber.isEmpty()||password.isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields must be filled before proceeding");
        }
        else{
            try{
            
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/burgerapp", "root", "");
            Statement st=(Statement) con.createStatement();
            String sql="INSERT INTO registration VALUES('"+username+"','"+lastname+"','"+address+"','"+phonenumber+"','"+sex+"','"+password+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registration Successful");
            String sql2="INSERT INTO verification VALUES('"+username+"','"+password+"')";
            st.executeUpdate(sql2);
            this.setVisible(false);
            this.dispose();
            Login obj=new Login();
            obj.setVisible(true);
            obj.setSize(971, 500);
            con.close();
        }
            
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
            
    }//GEN-LAST:event_btnSubmitActionPerformed
        
    }
    
    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnQuitActionPerformed

    private void cmbSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox cmbSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
