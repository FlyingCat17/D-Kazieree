/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPemasok;

import static Main.Mainhome.TabelStok;
import db.konekdb;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LenataHoma
 */
public class dataPemasok {
    Main.Mainhome mn = new Main.Mainhome();
    public void loadDataPemasok(){
        DefaultTableModel tb = new DefaultTableModel();
        mn.TabelPemasok.setBorder(null);
        mn.jScrollPane3.setBorder(null);
            tb.addColumn("ID Pemasok");
            tb.addColumn("Nama Pemasok");
            tb.addColumn("Usaha");
            tb.addColumn("Alamat Usaha");
            tb.addColumn("No Telpon");
            mn.TabelPemasok.setModel(tb);
            try {
                String sql = "SELECT * FROM tb_pemasok;";
                java.sql.Connection conn = (Connection)konekdb.GetConnection();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while(res.next())
                {
                    tb.addRow(new Object[]{
                        res.getString("id_pemasok"),
                        res.getString("nama_pemasok"),
                        res.getString("nama_usaha"),
                        res.getString("alamat_usaha"),
                        res.getString("no_telp_pemasok")
            });
                    
                mn.TabelPemasok.setModel(tb);
            }
         } catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("Gagal mendapatkan Data!");
         }
    }
}
