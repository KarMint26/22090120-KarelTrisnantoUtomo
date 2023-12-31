/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.k_atk.panel;

import static com.k_atk.panel.PnTransaksi.centerHeaderTable;
import com.k_atk.utills.ConnectionDatabase;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import javax.swing.SwingUtilities;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 *
 * @author karel
 */
public class PnCasher extends javax.swing.JPanel {
    public Statement st; // memberikan statement perintah sql, select insert delete
    public ResultSet rs; // membaca data di dalam db, membaca record di db
    Connection cn = ConnectionDatabase.OpenConnection();
    public static int hargaProd  = 0;
    public static int subTotal = 0;
    public static int stokProd = 0;
    public static int total = 0;
    public static String idProduk = "";
    public static String namaProd = "";

    /**
     * Creates new form PnCasher
     */
    public PnCasher() {
        initComponents();
        PnTransaksi.centerHeaderTable(tb_casher);
        txtId.requestFocus();
        centeringRow(tb_casher);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnHome = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtSubTotalBarang = new javax.swing.JTextField();
        stok_prod = new javax.swing.JLabel();
        btnTambah = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTotalBayar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_casher = new javax.swing.JTable();
        btnSearch = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnFinish = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        PnHome.setBackground(new java.awt.Color(255, 255, 255));
        PnHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        PnHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Nama Barang :");
        PnHome.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 75, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Id Barang :");
        PnHome.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Harga (Rp) :");
        PnHome.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 122, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("Quantity :");
        PnHome.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 168, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Sub-Total (Rp) :");
        PnHome.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 220, -1, -1));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txtId.setMargin(new java.awt.Insets(2, 16, 2, 6));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        PnHome.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 25, 140, 33));

        txtNamaBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNamaBarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txtNamaBarang.setPreferredSize(new java.awt.Dimension(71, 32));
        PnHome.add(txtNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 70, 364, -1));

        txtHarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHarga.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txtHarga.setPreferredSize(new java.awt.Dimension(64, 32));
        PnHome.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 117, 364, -1));

        txtQty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        PnHome.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 140, 30));

        txtSubTotalBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSubTotalBarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        PnHome.add(txtSubTotalBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 364, 30));

        stok_prod.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        stok_prod.setText("Stok :");
        PnHome.add(stok_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 106, 30));

        btnTambah.setBackground(new java.awt.Color(0, 51, 204));
        btnTambah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k_atk/assets/img/icon/icons8_shopping_cart_24px.png"))); // NOI18N
        jLabel15.setText("Tambah");

        javax.swing.GroupLayout btnTambahLayout = new javax.swing.GroupLayout(btnTambah);
        btnTambah.setLayout(btnTambahLayout);
        btnTambahLayout.setHorizontalGroup(
            btnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        btnTambahLayout.setVerticalGroup(
            btnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PnHome.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel16.setText("Total (Rp) :");
        PnHome.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 36, -1, -1));

        txtTotalBayar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTotalBayar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        PnHome.add(txtTotalBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 70, 190, 40));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel17.setText("Bayar (Rp) : ");
        PnHome.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 120, -1, -1));

        txtBayar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtBayar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        PnHome.add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 155, 190, 40));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel18.setText("Kembali (Rp) : ");
        PnHome.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));

        txtKembali.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtKembali.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        PnHome.add(txtKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 190, 40));

        tb_casher.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        tb_casher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang", "Harga", "Quantity", "Sub-Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_casher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tb_casher.setGridColor(new java.awt.Color(0, 0, 0));
        tb_casher.setRowHeight(30);
        tb_casher.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tb_casher.setShowGrid(true);
        jScrollPane1.setViewportView(tb_casher);

        PnHome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 854, 185));

        btnSearch.setBackground(new java.awt.Color(0, 51, 204));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k_atk/assets/img/icon/icons8_search_24px_1.png"))); // NOI18N

        javax.swing.GroupLayout btnSearchLayout = new javax.swing.GroupLayout(btnSearch);
        btnSearch.setLayout(btnSearchLayout);
        btnSearchLayout.setHorizontalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PnHome.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 25, -1, -1));

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k_atk/assets/img/icon/icons8_trash_24px.png"))); // NOI18N
        jLabel20.setText("Hapus");

        javax.swing.GroupLayout btnHapusLayout = new javax.swing.GroupLayout(btnHapus);
        btnHapus.setLayout(btnHapusLayout);
        btnHapusLayout.setHorizontalGroup(
            btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHapusLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel20)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnHapusLayout.setVerticalGroup(
            btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHapusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PnHome.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        btnFinish.setBackground(new java.awt.Color(204, 0, 255));
        btnFinish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinishMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinishMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinishMouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k_atk/assets/img/icon/icons8_checkmark_24px.png"))); // NOI18N
        jLabel21.setText("Selesai");

        javax.swing.GroupLayout btnFinishLayout = new javax.swing.GroupLayout(btnFinish);
        btnFinish.setLayout(btnFinishLayout);
        btnFinishLayout.setHorizontalGroup(
            btnFinishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFinishLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel21)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        btnFinishLayout.setVerticalGroup(
            btnFinishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFinishLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PnHome.add(btnFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        btnTambah.setBackground(new Color(0,0,153));
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        btnTambah.setBackground(new Color(0,51,204));
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        btnSearch.setBackground(new Color(0,0,153));
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        btnSearch.setBackground(new Color(0,51,204));
    }//GEN-LAST:event_btnSearchMouseExited

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        generateDataFromDB();
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        subTotal = Integer.parseInt(txtQty.getText()) * hargaProd;
        stokProd -= Integer.parseInt(txtQty.getText());
        refreshCasher();
    }//GEN-LAST:event_txtQtyActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        generateDataFromDB();
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        btnHapus.setBackground(new Color(204,0,0));
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        btnHapus.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnFinishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseEntered
        btnFinish.setBackground(new Color(204,0,204));
    }//GEN-LAST:event_btnFinishMouseEntered

    private void btnFinishMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseExited
        btnFinish.setBackground(new Color(204,0,255));
    }//GEN-LAST:event_btnFinishMouseExited

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        addDataTable();
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        deleteDataTable();
    }//GEN-LAST:event_btnHapusMouseClicked

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        if(Integer.parseInt(txtBayar.getText()) >= total){
            int kembalian = Integer.parseInt(txtBayar.getText()) - total;
            txtKembali.setText(String.valueOf(kembalian));
        } else {
            JOptionPane.showMessageDialog(null, "Tidak Cukup Uang Untuk Bayar",
                    "Cash", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtBayarActionPerformed

    private void btnFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseClicked
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Apakah Anda ingin menyelesaikan transaksi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            finishTransaksi();
        }
    }//GEN-LAST:event_btnFinishMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnHome;
    private javax.swing.JPanel btnFinish;
    private javax.swing.JPanel btnHapus;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JPanel btnTambah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel stok_prod;
    private javax.swing.JTable tb_casher;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSubTotalBarang;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables

    public static void centeringRow(JTable j){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < j.getColumnCount(); i++) {
            j.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        centerHeaderTable(j);
    }
    
    private String generateTransaksiID() {
        String transaksiID = "";
        try {
            Statement s = cn.createStatement();
            ResultSet rs = s.executeQuery("SELECT MAX(transaksi_id) AS max_id FROM tb_transaksi");
            if(rs.next()){
                String maxId = rs.getString("max_id");
            
                // Mengambil angka dari ID transaksi terakhir
                int id = Integer.parseInt(maxId.substring(maxId.length() - 3));
      
                // Menambahkan 1 untuk mendapatkan ID transaksi berikutnya
                id++;
      
                // Menghasilkan ID transaksi berikutnya
                if(id < 100){
                    transaksiID += "ID0" + id;
                } else {
                    transaksiID += "ID" + id;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return transaksiID;
    }

    
    private String generateTanggalTransaksi() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String tanggalTransaksi = formatter.format(date);
        return tanggalTransaksi;
    }

    
    private void refreshCasher(){
        txtSubTotalBarang.setText(String.valueOf(subTotal));
        stok_prod.setText("Stok : " + stokProd);
        total += subTotal;
        
        try {
            Statement s = cn.createStatement();
            String q = "UPDATE tb_produk SET stok_produk = " + stokProd + " WHERE produk_id = '" + idProduk + "'";
            s.executeUpdate(q);
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    private void generateDataFromDB() {
        try {
            String q = "SELECT * FROM tb_produk WHERE produk_id = '" + txtId.getText() + "'";
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery(q);
            while (r.next()) {
                txtNamaBarang.setText(r.getString("nama_produk"));
                txtHarga.setText(String.valueOf(r.getInt("harga_produk")));
                txtSubTotalBarang.setText(String.valueOf(r.getInt("harga_produk")));
                stok_prod.setText("Stok : " + String.valueOf(r.getInt("stok_produk")));
                hargaProd = r.getInt("harga_produk");
                stokProd = r.getInt("stok_produk");
                namaProd = r.getString("nama_produk");
            }
            idProduk = txtId.getText();
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }
        
        txtId.setText("");
        txtId.requestFocus();
    }
    
    private void addDataTable(){
        if(!txtQty.getText().equals("") && !txtNamaBarang.getText().equals("") && 
            !txtHarga.getText().equals("") && !txtSubTotalBarang.getText().equals("")){
            
            DefaultTableModel m = (DefaultTableModel) tb_casher.getModel();
            
            for (int i = 0; i < m.getRowCount(); i++) {
                if (m.getValueAt(i, 0).equals(idProduk) && m.getValueAt(i, 1).equals(namaProd)) {
                    int qty = Integer.parseInt(txtQty.getText()) + Integer.parseInt(m.getValueAt(i, 3).toString());
                    int newSubTotal = Integer.parseInt(m.getValueAt(i, 4).toString()) + subTotal;
                    m.setValueAt(qty, i, 3);
                    m.setValueAt(newSubTotal, i, 4);
                    txtTotalBayar.setText(String.valueOf(total));
                    txtNamaBarang.setText("");
                    txtHarga.setText("");
                    txtSubTotalBarang.setText("");
                    stok_prod.setText("Stok : ");
                    txtQty.setText("");
                    return;
                }
            }
            
            Object[] data = {idProduk, namaProd, hargaProd, txtQty.getText(), subTotal};
            m.addRow(data);
            txtTotalBayar.setText(String.valueOf(total));
            txtNamaBarang.setText("");
            txtHarga.setText("");
            txtSubTotalBarang.setText("");
            stok_prod.setText("Stok : ");
            txtQty.setText("");
            txtId.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Please Fill All Data", 
                    "Empty Text Field", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void deleteDataTable() {
        DefaultTableModel model = (DefaultTableModel) tb_casher.getModel();
        int selectedRow = tb_casher.getSelectedRow();
        String id = (String) model.getValueAt(selectedRow, 0);
        Integer subT = (Integer) model.getValueAt(selectedRow, 4);
        if (subT != null) {
            total -= subT;
        } else {
            // Handle the case when the text is empty
            System.err.println("Error: Subtotal text is empty.");
        }

        
        if (selectedRow != -1) { // Pastikan baris yang dipilih valid
            try {
                Statement s = cn.createStatement();
                String q = "UPDATE tb_produk SET stok_produk = (stok_produk" + "+" + model.getValueAt(selectedRow, 3) + 
                        ") WHERE produk_id = '" + id + "'";
                s.executeUpdate(q);
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            model.removeRow(selectedRow); // Hapus baris dari model
            txtTotalBayar.setText(String.valueOf(total));
        } else {
            // Sampaikan pesan kesalahan kepada pengguna jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.");
        }
    }
    
    private void finishTransaksi() {
        String idTransaksi = generateTransaksiID();
        String tanggalTransaksi = generateTanggalTransaksi();
        int totalBayar = Integer.parseInt(txtBayar.getText());
        int kembalianByr = Integer.parseInt(txtKembali.getText());
        
        DefaultTableModel mm = (DefaultTableModel) tb_casher.getModel();
        
        for (int i = 0; i < mm.getRowCount(); i++) {
            try {
                Statement s = cn.createStatement();
                String q = "INSERT INTO tb_struk VALUES (" + (i+1) + ", '" + mm.getValueAt(i, 1)
                        + "', " + mm.getValueAt(i, 2) + ", " + mm.getValueAt(i, 3)
                        + ", " + mm.getValueAt(i, 4) + ")";
                    
                s.executeUpdate(q);
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        try {
            Statement s = cn.createStatement();
            String q = "INSERT INTO tb_transaksi VALUES "
                    + "('" + idTransaksi + "', '" + tanggalTransaksi + "', " + total + ")";
            s.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Cetak JPanel ke file PDF.
        StrukDesign component = new StrukDesign(); // Ganti dengan nama variabel JPanel Anda.
        component.setTotalHarga(total);
        component.setTotalBayar(totalBayar);
        component.setKembalianBayar(kembalianByr);
        component.loadCasherData();
        
        // Asumsikan StrukDesign adalah JComponent Anda
        JFrame frame = new JFrame();
        frame.setContentPane(component);
        frame.pack();
        frame.setVisible(false);

        BufferedImage bufferedImage = SwingUtilities.getWindowAncestor(component).getGraphicsConfiguration().createCompatibleImage(component.getWidth(), component.getHeight());
        component.paint(bufferedImage.getGraphics());
        try {
            PdfWriter writer = new PdfWriter(new FileOutputStream("C:\\Users\\user\\Downloads\\hasilstruk\\struk.pdf"));
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            byte[] bytes = baos.toByteArray();
            ImageData imageData = ImageDataFactory.create(bytes);
            Image image = new Image(imageData);
            document.add(image);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        DefaultTableModel model = (DefaultTableModel) tb_casher.getModel();
        model.setRowCount(0);
        txtBayar.setText("");
        txtHarga.setText("");
        txtId.setText("");
        txtKembali.setText("");
        txtNamaBarang.setText("");
        txtQty.setText("");
        txtSubTotalBarang.setText("");
        txtTotalBayar.setText("");
        stok_prod.setText("Stok : ");
    }

}
