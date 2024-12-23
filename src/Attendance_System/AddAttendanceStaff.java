/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Attendance_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AddAttendanceStaff extends javax.swing.JFrame {

    Connection conn = Connect.Connecttodb();
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form addAttendanceStaff
     */
    public AddAttendanceStaff() {
        initComponents();
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
        txttodaydate.setText(sfd.format(d));
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
        jLabel2 = new javax.swing.JLabel();
        txttodaydate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtstaffid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtstaffname = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addicon.png"))); // NOI18N
        jLabel1.setText("Add Staff Attendance");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 560, 110));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 240, 40));

        txttodaydate.setEditable(false);
        txttodaydate.setBackground(new java.awt.Color(204, 204, 204));
        txttodaydate.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(txttodaydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 250, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Staff ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 240, 40));

        txtstaffid.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(txtstaffid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 250, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Staff Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 240, 40));

        txtstaffname.setEditable(false);
        txtstaffname.setBackground(new java.awt.Color(204, 204, 204));
        txtstaffname.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(txtstaffname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 250, 40));

        btnadd.setBackground(new java.awt.Color(255, 0, 51));
        btnadd.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnadd.setForeground(new java.awt.Color(242, 242, 242));
        btnadd.setText("Add ");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, 130, 40));

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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 70, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/staff frame background.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txtstaffid.setText("");
        txtstaffname.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

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

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       try {
    // Step 1: Check if the record exists
    String checkSql = "SELECT COUNT(*) AS row_count FROM staffattendance WHERE staff_id = ? AND staff_date = ?";
    PreparedStatement checkPst = conn.prepareStatement(checkSql);
    checkPst.setString(1, txtstaffid.getText());
    checkPst.setString(2, txttodaydate.getText());

    ResultSet rs = checkPst.executeQuery();
    rs.next(); // Move to the first result
    int rowCount = rs.getInt("row_count");

    if (rowCount > 0) {
        // Step 2: Update the existing record
        String updateSql = "UPDATE staffattendance SET staff_attendance = staff_attendance + 1 WHERE staff_id = ? AND staff_date = ?";
        pst = conn.prepareStatement(updateSql);
        pst.setString(1, txtstaffid.getText());
        pst.setString(2, txttodaydate.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Attendance updated successfully.");
    } else {
        // Step 3: Insert a new record
        String insertSql = "INSERT INTO staffattendance (staff_id, staff_date, staff_attendance) VALUES (?, ?, 1)";
        pst = conn.prepareStatement(insertSql);
        pst.setString(1, txtstaffid.getText());
        pst.setString(2, txttodaydate.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "New attendance record added.");
    }

    // Clear input fields
    txtstaffid.setText("");
    txtstaffname.setText("");
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    Logger.getLogger(AddAttendanceStaff.class.getName()).log(Level.SEVERE, null, ex);
}
     
    }//GEN-LAST:event_btnaddActionPerformed

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
            java.util.logging.Logger.getLogger(AddAttendanceStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAttendanceStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAttendanceStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAttendanceStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAttendanceStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtstaffid;
    private javax.swing.JTextField txtstaffname;
    private javax.swing.JTextField txttodaydate;
    // End of variables declaration//GEN-END:variables
}