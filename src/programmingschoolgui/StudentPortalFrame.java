/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschoolgui;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Nedlog
 */
public class StudentPortalFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentPortalFrame
     */
    public StudentPortalFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMatNo = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtSName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProgram = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtMatNo);
        txtMatNo.setBounds(150, 100, 140, 30);
        getContentPane().add(txtFName);
        txtFName.setBounds(150, 160, 140, 30);
        getContentPane().add(txtSName);
        txtSName.setBounds(150, 220, 150, 30);

        jTable1.setBackground(new java.awt.Color(240, 240, 240));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 80, 452, 402);

        jPanel1.setBackground(new java.awt.Color(46, 207, 200));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("First Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 160, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Surname:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 220, 100, 30);

        lblOutput.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jPanel1.add(lblOutput);
        lblOutput.setBounds(20, 490, 350, 50);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Information Portal");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 10, 480, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Matric No:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 100, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Program:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 270, 90, 40);
        jPanel1.add(txtProgram);
        txtProgram.setBounds(150, 280, 160, 30);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 0, 0));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(100, 380, 110, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText(" DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 493, 130, 40);

        btnRetrieve.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnRetrieve.setForeground(new java.awt.Color(255, 0, 0));
        btnRetrieve.setText("Retrieve");
        btnRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetrieve);
        btnRetrieve.setBounds(600, 490, 120, 40);

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 0, 51));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose);
        btnClose.setBounds(760, 493, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        //Get the inout from the use through the textfields
        String matNo=txtMatNo.getText();
        String fName=txtFName.getText();
        String sName=txtSName.getText();
        String program=txtProgram.getText();
        //connect to the database
        try{
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentdb", "root", "");
        Statement st=(Statement) con.createStatement();
        String sql="INSERT INTO studentinfo VALUES('"+matNo+"','"+fName+"','"+sName+"','"+program+"')";
        st.executeUpdate(sql);
        lblOutput.setText("Information stored successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        txtMatNo.setText(null);
        txtFName.setText(null);
        txtSName.setText(null);
        txtProgram.setText(null);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed
        try{
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentdb", "root","");
        String sql="SELECT * FROM studentinfo";
        PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery(sql);
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentdb","root","");
            Statement st=(Statement) con.createStatement();
            String sql="DELETE FROM studentinfo WHERE matno='14cg017801'";
            PreparedStatement s= con.prepareStatement(sql);
            s.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
    
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
            java.util.logging.Logger.getLogger(StudentPortalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPortalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPortalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPortalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPortalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtMatNo;
    private javax.swing.JTextField txtProgram;
    private javax.swing.JTextField txtSName;
    // End of variables declaration//GEN-END:variables
}