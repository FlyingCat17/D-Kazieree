/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataProdukBarang;

import Main.Mainhome;
import java.awt.Color;
import db.konekdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Main.Mainhome;
import java.awt.event.KeyEvent;
/**
 *
 * @author LenataHoma
 */
public class form_tambahProdukBarang extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
        Main.Mainhome maiin = new Main.Mainhome();
    /**
     * Creates new form form_tambahProdukBarang
     */
    public form_tambahProdukBarang(){
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null);
        maiin.disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_WarningHargaBeliProduk = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panel_WarningHargaJualProduk = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panel_WarningKodeProduk = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel_WarningNamaProduk = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_WarningSatuanProduk = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panel_Berhasiltersimpan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_simpanTambahProdukBarang = new javax.swing.JLabel();
        btn_batalTambahProdukbarang = new javax.swing.JLabel();
        txt_hargajual = new javax.swing.JTextField();
        txt_hargabeli = new javax.swing.JTextField();
        txt_satuan = new javax.swing.JTextField();
        txt_namaProduk = new javax.swing.JTextField();
        txt_kodeProduk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_WarningHargaBeliProduk.setVisible(false);
        panel_WarningHargaBeliProduk.setEnabled(false);
        panel_WarningHargaBeliProduk.setOpaque(false);
        panel_WarningHargaBeliProduk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        panel_WarningHargaBeliProduk.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 205, 70, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/notif_warnhargabeliKosong.png"))); // NOI18N
        panel_WarningHargaBeliProduk.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 290));

        getContentPane().add(panel_WarningHargaBeliProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 420, 290));

        panel_WarningHargaJualProduk.setVisible(false);
        panel_WarningHargaJualProduk.setEnabled(false);
        panel_WarningHargaJualProduk.setOpaque(false);
        panel_WarningHargaJualProduk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        panel_WarningHargaJualProduk.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 205, 70, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/notif_warnhargajualKosong.png"))); // NOI18N
        panel_WarningHargaJualProduk.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 290));

        getContentPane().add(panel_WarningHargaJualProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 420, 290));

        panel_WarningKodeProduk.setVisible(false);
        panel_WarningKodeProduk.setEnabled(false);
        panel_WarningKodeProduk.setOpaque(false);
        panel_WarningKodeProduk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panel_WarningKodeProduk.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 205, 70, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/notif_warnkodeprodukKosong.png"))); // NOI18N
        panel_WarningKodeProduk.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 290));

        getContentPane().add(panel_WarningKodeProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 420, 290));

        panel_WarningNamaProduk.setVisible(false);
        panel_WarningNamaProduk.setEnabled(false);
        panel_WarningNamaProduk.setOpaque(false);
        panel_WarningNamaProduk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        panel_WarningNamaProduk.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 205, 70, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/notif_warnnamaprodukKosong.png"))); // NOI18N
        panel_WarningNamaProduk.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 290));

        getContentPane().add(panel_WarningNamaProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 420, 290));

        panel_WarningSatuanProduk.setVisible(false);
        panel_WarningSatuanProduk.setEnabled(false);
        panel_WarningSatuanProduk.setOpaque(false);
        panel_WarningSatuanProduk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        panel_WarningSatuanProduk.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 205, 70, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/notif_warndatasatuanKosong.png"))); // NOI18N
        panel_WarningSatuanProduk.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 290));

        getContentPane().add(panel_WarningSatuanProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 420, 290));

        panel_Berhasiltersimpan.setVisible(false);
        panel_Berhasiltersimpan.setEnabled(false);
        panel_Berhasiltersimpan.setOpaque(false);
        panel_Berhasiltersimpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        panel_Berhasiltersimpan.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 205, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/notif_berhasilTersimpan.png"))); // NOI18N
        panel_Berhasiltersimpan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 290));

        getContentPane().add(panel_Berhasiltersimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 420, 290));

        btn_simpanTambahProdukBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_simpanTambahProdukBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/btn_simpan.png"))); // NOI18N
        btn_simpanTambahProdukBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanTambahProdukBarangMouseClicked(evt);
            }
        });
        getContentPane().add(btn_simpanTambahProdukBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 450, 100, 40));

        btn_batalTambahProdukbarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_batalTambahProdukbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/btn_bstal.png"))); // NOI18N
        btn_batalTambahProdukbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_batalTambahProdukbarangMouseClicked(evt);
            }
        });
        getContentPane().add(btn_batalTambahProdukbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 100, 40));

        txt_hargajual.setFont(new java.awt.Font("Quicksand Medium", 0, 18)); // NOI18N
        txt_hargajual.setBorder(null);
        txt_hargajual.setOpaque(false);
        txt_hargajual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hargajualKeyTyped(evt);
            }
        });
        getContentPane().add(txt_hargajual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 398, 360, 38));

        txt_hargabeli.setFont(new java.awt.Font("Quicksand Medium", 0, 18)); // NOI18N
        txt_hargabeli.setBorder(null);
        txt_hargabeli.setOpaque(false);
        txt_hargabeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hargabeliKeyTyped(evt);
            }
        });
        getContentPane().add(txt_hargabeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 335, 360, 38));

        txt_satuan.setFont(new java.awt.Font("Quicksand Medium", 0, 18)); // NOI18N
        txt_satuan.setBorder(null);
        txt_satuan.setOpaque(false);
        getContentPane().add(txt_satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 272, 130, 38));

        txt_namaProduk.setFont(new java.awt.Font("Quicksand Medium", 0, 18)); // NOI18N
        txt_namaProduk.setBorder(null);
        txt_namaProduk.setOpaque(false);
        getContentPane().add(txt_namaProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 208, 360, 38));

        txt_kodeProduk.setFont(new java.awt.Font("Quicksand Medium", 0, 18)); // NOI18N
        txt_kodeProduk.setBorder(null);
        txt_kodeProduk.setOpaque(false);
        getContentPane().add(txt_kodeProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 144, 360, 38));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProdukBarang/form_tamabahProdukBarang (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanTambahProdukBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanTambahProdukBarangMouseClicked
        // TODO add your handling code here:
        String kp, np, sp, hb, hj;
        kp = txt_kodeProduk.getText().toString();
        np = txt_namaProduk.getText().toString();
        sp = txt_satuan.getText();
        hb = txt_hargabeli.getText();
        hj = txt_hargajual.getText();
        if (kp.equals("")) {
            panel_WarningKodeProduk.setVisible(true);
            btn_simpanTambahProdukBarang.setVisible(false);
            btn_batalTambahProdukbarang.setVisible(false);
        } else if(np.equals("")){
            panel_WarningNamaProduk.setVisible(true);
            btn_simpanTambahProdukBarang.setVisible(false);
            btn_batalTambahProdukbarang.setVisible(false);
        } else if(sp.equals("")){
            panel_WarningSatuanProduk.setVisible(true);
            btn_simpanTambahProdukBarang.setVisible(false);
            btn_batalTambahProdukbarang.setVisible(false);
        } else if(hb.equals("")){
            panel_WarningHargaBeliProduk.setVisible(true);
            btn_simpanTambahProdukBarang.setVisible(false);
            btn_batalTambahProdukbarang.setVisible(false);
        } else if(hj.equals("")){
            panel_WarningHargaJualProduk.setVisible(true);
            btn_simpanTambahProdukBarang.setVisible(false);
            btn_batalTambahProdukbarang.setVisible(false);
        } else {
        
            try {
                String addProdukBarang = "INSERT INTO tb_produk VALUES('"+kp+"','"
                +np+"','"+sp+"','"+hb+"','"+hj+"');";
                con = (Connection)konekdb.GetConnection();
                pst = con.prepareStatement(addProdukBarang);
                pst.execute();
                panel_Berhasiltersimpan.setVisible(true);
                txt_kodeProduk.setText("");
                txt_namaProduk.setText("");
                txt_satuan.setText("");
                txt_hargabeli.setText("");
                txt_hargajual.setText("");
                btn_batalTambahProdukbarang.setVisible(false);
                btn_simpanTambahProdukBarang.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }//GEN-LAST:event_btn_simpanTambahProdukBarangMouseClicked

    private void btn_batalTambahProdukbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalTambahProdukbarangMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Mainhome mn = new Mainhome();
//        panel_tambahProdukBarang.setVisible(false);
//        TabelProduk.setVisible(true);
//        jScrollPane1.setVisible(true);
//        loadTableProduk();
//        txt_kodeprodukTambahProdukBarang.setText("");
//        txt_tambahnamaprodukBarang.setText("");
//        txt_satuanTambahProdukBarang.setText("");
//        txt_hargabeliTambahProdukBarang.setText("");
//        txt_hargajualTambahProdukBarang.setText("");

    }//GEN-LAST:event_btn_batalTambahProdukbarangMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        panel_Berhasiltersimpan.setVisible(false);
        btn_batalTambahProdukbarang.setVisible(true);
        btn_simpanTambahProdukBarang.setVisible(true);
        txt_namaProduk.setText("");
        txt_kodeProduk.setText("");
        txt_satuan.setText("");
        txt_hargabeli.setText("");
        txt_hargajual.setText("");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        panel_WarningKodeProduk.setVisible(false);
        btn_batalTambahProdukbarang.setVisible(true);
        btn_simpanTambahProdukBarang.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        panel_WarningNamaProduk.setVisible(false);
        btn_batalTambahProdukbarang.setVisible(true);
        btn_simpanTambahProdukBarang.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        panel_WarningSatuanProduk.setVisible(false);
        btn_batalTambahProdukbarang.setVisible(true);
        btn_simpanTambahProdukBarang.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        panel_WarningHargaBeliProduk.setVisible(false);
        btn_batalTambahProdukbarang.setVisible(true);
        btn_simpanTambahProdukBarang.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        panel_WarningHargaJualProduk.setVisible(false);
        btn_batalTambahProdukbarang.setVisible(true);
        btn_simpanTambahProdukBarang.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void txt_hargabeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hargabeliKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (txt_hargabeli.getText().length()>=11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_hargabeliKeyTyped

    private void txt_hargajualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hargajualKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (txt_hargajual.getText().length()>=11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_hargajualKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_tambahProdukBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_tambahProdukBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_tambahProdukBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_tambahProdukBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_tambahProdukBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_batalTambahProdukbarang;
    private javax.swing.JLabel btn_simpanTambahProdukBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel_Berhasiltersimpan;
    private javax.swing.JPanel panel_WarningHargaBeliProduk;
    private javax.swing.JPanel panel_WarningHargaJualProduk;
    private javax.swing.JPanel panel_WarningKodeProduk;
    private javax.swing.JPanel panel_WarningNamaProduk;
    private javax.swing.JPanel panel_WarningSatuanProduk;
    private javax.swing.JTextField txt_hargabeli;
    private javax.swing.JTextField txt_hargajual;
    private javax.swing.JTextField txt_kodeProduk;
    private javax.swing.JTextField txt_namaProduk;
    private javax.swing.JTextField txt_satuan;
    // End of variables declaration//GEN-END:variables
}
