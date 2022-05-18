/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStok;

import java.awt.Color;
import db.konekdb;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LenataHoma
 */

public class KurangStok extends javax.swing.JDialog {
Main.Mainhome mn = new Main.Mainhome();
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form TambahStok
     */
    public KurangStok(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
        loadDataStok();
        
        
    }
    public void loadDataStok(){
        try {
            String load = "SELECT tb_produk.id_produk, tb_produk.nama_produk, tb_stokbarang.stok_produk FROM tb_produk, tb_stokbarang\n" +
                    "WHERE tb_produk.id_produk = tb_stokbarang.id_produk AND tb_stokbarang.id_produk = '"+txt__kodeProduk.getText()+"';";
            con = (Connection)konekdb.GetConnection();
            st = con.createStatement();
            rs = st.executeQuery(load);
            while (rs.next()) {                
                txt_namaProduk.setText(rs.getString("nama_produk"));
                txt_stokawal.setText(rs.getString("stok_produk"));
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasila = new javax.swing.JLabel();
        txt_tambahStok = new javax.swing.JTextField();
        txt_stokawal = new javax.swing.JTextField();
        txt_namaProduk = new javax.swing.JTextField();
        txt__kodeProduk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasila.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        getContentPane().add(hasila, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 325, 70, 40));

        txt_tambahStok.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        txt_tambahStok.setBorder(null);
        txt_tambahStok.setOpaque(false);
        txt_tambahStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tambahStokKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tambahStokKeyTyped(evt);
            }
        });
        getContentPane().add(txt_tambahStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 325, 70, 40));

        txt_stokawal.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        txt_stokawal.setBorder(null);
        txt_stokawal.setEnabled(false);
        txt_stokawal.setOpaque(false);
        getContentPane().add(txt_stokawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 260, 70, 40));

        txt_namaProduk.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        txt_namaProduk.setBorder(null);
        txt_namaProduk.setEnabled(false);
        txt_namaProduk.setOpaque(false);
        txt_namaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaProdukActionPerformed(evt);
            }
        });
        getContentPane().add(txt_namaProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 195, 360, 40));

        txt__kodeProduk.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        txt__kodeProduk.setBorder(null);
        txt__kodeProduk.setEnabled(false);
        txt__kodeProduk.setOpaque(false);
        getContentPane().add(txt__kodeProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 130, 360, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/btn_bstal.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataProduk/btn_simpan.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataStok/form_tambahProdukBarang (3).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        mn.loadTableStok();
        this.dispose();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txt_tambahStokKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tambahStokKeyReleased
        // TODO add your handling code here:
        if (txt_tambahStok.getText().equals("")) {
            System.out.println("Nothing");
            hasila.setText(null);
        } else {
            int hasil;
        int awal = Integer.parseInt(txt_stokawal.getText());
        int akhir = Integer.parseInt(txt_tambahStok.getText());
        hasil = awal - akhir;
        System.out.println("Hasil = " +hasil);
        String hasi11 = String.valueOf(hasil);
        hasila.setText(hasi11);
        }
        
    }//GEN-LAST:event_txt_tambahStokKeyReleased

    private void txt_tambahStokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tambahStokKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (txt_tambahStok.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_tambahStokKeyTyped

    private void txt_namaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaProdukActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        String a = hasila.getText();
        String b = txt__kodeProduk.getText();
        try {
            String s = "UPDATE `tb_stokbarang` SET `stok_produk`= '"+a+"' WHERE id_produk = '"+b+"';";
            con = (Connection)konekdb.GetConnection();
            pst = con.prepareStatement(s);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Ditambahkan");
            
        } catch (Exception e) {
            System.out.println("Error !");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(KurangStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KurangStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KurangStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KurangStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KurangStok dialog = new KurangStok(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hasila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField txt__kodeProduk;
    private javax.swing.JTextField txt_namaProduk;
    private javax.swing.JTextField txt_stokawal;
    private javax.swing.JTextField txt_tambahStok;
    // End of variables declaration//GEN-END:variables
}
