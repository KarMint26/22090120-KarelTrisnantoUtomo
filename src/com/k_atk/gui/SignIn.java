/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.k_atk.gui;

import com.k_atk.utills.ConnectionDatabase;
import java.sql.*;
import java.awt.Color;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author karel
 */
public class SignIn extends javax.swing.JFrame {
    protected static int count = 1;
    public Statement st; // memberikan statement perintah sql, select insert delete
    public ResultSet rs; // membaca data di dalam db, membaca record di db
    Connection cn = ConnectionDatabase.OpenConnection();

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        
        ImageIcon icon = new ImageIcon("src/com/k_atk/assets/img/icon/icon-48x48.png");
        setIconImage(icon.getImage());
        setTitle("K-ATK | CASHER APP FOR OFFICE STATIONARY");
        getContentPane().setBackground(new Color(255, 255, 255));
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPws = new javax.swing.JLabel();
        icPwd = new javax.swing.JLabel();
        txtPasswd = new javax.swing.JPasswordField();
        btnSignin = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k_atk/assets/img/hero/hero-login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 510));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k_atk/assets/img/icon/icon-48x48.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WELCOME TO K-ATK");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 112, 460, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CASHER APP FOR OFFICE STATIONARY");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 450, -1));

        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel6.setText("___________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 28));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k_atk/assets/img/icon/icons8_user_20px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        txtUsername.setBorder(null);
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 240, 30));

        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 285, -1, -1));

        txtPws.setText("___________________________________");
        jPanel2.add(txtPws, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 316, -1, 30));

        icPwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k_atk/assets/img/icon/icons8_eye_20px.png"))); // NOI18N
        icPwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icPwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icPwdMouseClicked(evt);
            }
        });
        jPanel2.add(icPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        txtPasswd.setBorder(null);
        jPanel2.add(txtPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 240, 30));

        btnSignin.setBackground(new java.awt.Color(0, 153, 153));
        btnSignin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignin.setForeground(new java.awt.Color(255, 255, 255));
        btnSignin.setText("SIGN IN");
        btnSignin.setBorder(null);
        btnSignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSigninMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSigninMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSigninMouseExited(evt);
            }
        });
        jPanel2.add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 290, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel9.setText("Copyright ©️ 2023 karel.dev, All Rights Reserved");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 430, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icPwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icPwdMouseClicked
        // TODO add your handling code here:
        icPwd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        if(count % 2 == 1){
            ImageIcon icon = new ImageIcon("src/com/k_atk/assets/img/icon/icons8_invisible_20px.png");
            icPwd.setIcon(icon);
            txtPasswd.setEchoChar((char)0);
            count++;
        } else {
            ImageIcon icon = new ImageIcon("src/com/k_atk/assets/img/icon/icons8_eye_20px.png");
            icPwd.setIcon(icon);
            txtPasswd.setEchoChar((char)42);
            count = 1;
        }
    }//GEN-LAST:event_icPwdMouseClicked

    private void btnSigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSigninMouseEntered
        // TODO add your handling code here:
        btnSignin.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_btnSigninMouseEntered

    private void btnSigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSigninMouseExited
        // TODO add your handling code here:
        btnSignin.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_btnSigninMouseExited

    private void btnSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSigninMouseClicked
        try {
            // TODO add your handling code here:
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM tb_user WHERE username = '" + txtUsername.getText() + "' AND password = '" + txtPasswd.getText() + "'");
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Sign In Successful", "Sign In", JOptionPane.INFORMATION_MESSAGE);
                MainApp main = new MainApp();
                main.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Sign In", JOptionPane.ERROR_MESSAGE);
                txtUsername.setText("");
                txtPasswd.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSigninMouseClicked

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignin;
    private javax.swing.JLabel icPwd;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPasswd;
    private javax.swing.JLabel txtPws;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
