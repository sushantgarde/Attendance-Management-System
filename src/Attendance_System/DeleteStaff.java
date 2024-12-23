/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Attendance_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DeleteStaff extends javax.swing.JFrame {

    Connection conn = Connect.Connecttodb();
    PreparedStatement pst;
    ResultSet rs;
    
    /**
     * Creates new form DeleteStaff
     * 
     */
    public DeleteStaff() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtstaffid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtstaffname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtstaffbranch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtstaffattendance = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 40, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/detele.png"))); // NOI18N
        jLabel1.setText("Delete Staff Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 560, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Staff ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 240, 40));

        txtstaffid.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(txtstaffid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 250, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 70, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Staff Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 240, 40));

        txtstaffname.setEditable(false);
        txtstaffname.setBackground(new java.awt.Color(204, 204, 204));
        txtstaffname.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(txtstaffname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 250, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Staff Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 240, 40));

        txtstaffbranch.setEditable(false);
        txtstaffbranch.setBackground(new java.awt.Color(204, 204, 204));
        txtstaffbranch.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(txtstaffbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 250, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Staff Attendance");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 240, 40));

        txtstaffattendance.setEditable(false);
        txtstaffattendance.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtstaffattendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 270, 40));

        btndelete.setBackground(new java.awt.Color(255, 0, 51));
        btndelete.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btndelete.setForeground(new java.awt.Color(242, 242, 242));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, 130, 40));

        btnreset.setBackground(new java.awt.Color(255, 0, 51));
        btnreset.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnreset.setForeground(new java.awt.Color(242, 242, 242));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 680, 140, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/staff frame background.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1180, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(txtstaffid.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter id and then search0","Warning",2);
            txtstaffid.requestFocus();
        }
        else{
            try {
                pst = conn.prepareStatement("SELECT * FROM STAFF WHERE STAFF_ID=?");
                pst.setString(1, txtstaffid.getText());
                rs = pst.executeQuery();
                if(rs.next()){
                    txtstaffname.setText(rs.getString(2));
                    txtstaffbranch.setText(rs.getString(3));
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please enter the correct id?","Warning",2);
                    txtstaffid.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddAttendanceStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst = conn.prepareStatement("SELECT * FROM STAFFATTENDANCE WHERE STAFF_ID=?");
                pst.setString(1, txtstaffid.getText());
                rs = pst.executeQuery();
                if(rs.next()){
                    txtstaffattendance.setText(rs.getString(3));
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please enter the correct id?","Warning",2);
                    txtstaffid.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddAttendanceStaff.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            pst = conn.prepareStatement("DELETE FROM STAFF WHERE STAFF_ID=?");
            pst.setString(1, txtstaffid.getText());
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM STAFFATTENDANCE WHERE STAFF_ID=?");
            pst.setString(1, txtstaffid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Staff detail deleted sucessfully");
        } catch (SQLException ex) {
            Logger.getLogger(DeleteStaff.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txtstaffid.setText("");
        txtstaffname.setText("");
        txtstaffbranch.setText("");
        txtstaffattendance.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtstaffattendance;
    private javax.swing.JTextField txtstaffbranch;
    private javax.swing.JTextField txtstaffid;
    private javax.swing.JTextField txtstaffname;
    // End of variables declaration//GEN-END:variables
}