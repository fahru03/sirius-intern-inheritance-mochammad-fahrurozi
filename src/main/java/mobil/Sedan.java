/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projek;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;
/**
 *
 * @author fahru
 */
public class Sedan extends javax.swing.JFrame {

    /**
     * Creates new form sedan
     */
    public Sedan() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_mobil = new javax.swing.JComboBox<>();
        jenis_bahan_bakar = new javax.swing.JTextField();
        kapasitas_penumpang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tb_simpan = new javax.swing.JButton();
        tb_hapus = new javax.swing.JButton();
        tb_edit = new javax.swing.JButton();
        tb_batal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        tb_cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id");

        jLabel2.setText("jenis_bahan_bakar");

        jLabel3.setText("kapasitas penumpang");

        id_mobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));
        id_mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_mobilActionPerformed(evt);
            }
        });

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

        tb_simpan.setText("simpan");
        tb_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_simpanActionPerformed(evt);
            }
        });

        tb_hapus.setText("hapus");
        tb_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_hapusActionPerformed(evt);
            }
        });

        tb_edit.setText("edit");
        tb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_editActionPerformed(evt);
            }
        });

        tb_batal.setText("batal");
        tb_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_batalActionPerformed(evt);
            }
        });

        jLabel4.setText("search");

        jLabel5.setText("id_mobil");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        tb_cari.setText("cari");
        tb_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kapasitas_penumpang)
                            .addComponent(jenis_bahan_bakar)
                            .addComponent(id_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tb_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tb_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tb_hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tb_batal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_cari)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tb_cari)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jenis_bahan_bakar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(kapasitas_penumpang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tb_simpan)
                            .addComponent(tb_edit)
                            .addComponent(tb_hapus)
                            .addComponent(tb_batal))))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_editActionPerformed
         try{
           java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
           String sql="update sedan set id_mobil='" +id_mobil.getSelectedItem()+
                   "', jenis_bahan_bakar='"+jenis_bahan_bakar.getText()+
                   "', kapasitas_penumpang='"+kapasitas_penumpang.getText()+
                   "' where id='"+ id.getText()+"'";
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Data berhasil di ubah");
           tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Proses edit data gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_editActionPerformed

    private void tb_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_simpanActionPerformed
                                   
      try{
            String sql="insert into sedan values('"
                    +id.getText()+"','"
                    +id_mobil.getSelectedItem()+"','"
                    +jenis_bahan_bakar.getText()+"','"
                    +kapasitas_penumpang.getText()+"')";
                 java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_tb_simpanActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void id_mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_mobilActionPerformed
        try {
            String query = "SELECT * FROM mobil";
            Statement st =  projek.Koneksi.koneksiDB().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                id_mobil.addItem(rs.getString("id"));
            }
            
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_id_mobilActionPerformed

    private void tb_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_cariActionPerformed
         try {
    java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
    String sql = "Select * from sedan where id='"+cari.getText()+"' or jenis_bahan_bakar='"+cari.getText()+"'";
    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
    ResultSet rs = pst.executeQuery(sql);
    if (rs.next()){
        id.setText(rs.getString(1));
        id_mobil.setSelectedItem(rs.getString(2));
        jenis_bahan_bakar.setText(rs.getString(3));
        kapasitas_penumpang.setText(rs.getString(4));
        JOptionPane.showMessageDialog(null,"Data sedan: "
        + cari.getText() + " ditemukan");
    }
} catch (Exception e){}
cari.requestFocus();
    }//GEN-LAST:event_tb_cariActionPerformed

    private void tb_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_batalActionPerformed
        id.setText("");
        id_mobil.setSelectedItem("");
        jenis_bahan_bakar.setText("");
        kapasitas_penumpang.setText("");
        id.requestFocus();
    }//GEN-LAST:event_tb_batalActionPerformed

    private void tb_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_hapusActionPerformed
        try{
            java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
            String sql = "delete from sedan where id='"+id.getText()+"' ";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate(); JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
            tampil_data();
            }
            catch (Exception e){
            JOptionPane.showMessageDialog(null,"Proses Penghapusan Gagal");
            System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_tb_hapusActionPerformed

    
 public void tampil_data() {
    DefaultTableModel tabel = new DefaultTableModel();
    tabel.addColumn("id");
    tabel.addColumn("id_mobil");
    tabel.addColumn("jenis_bahan_bakar");
    tabel.addColumn("kapasitas_penumpang");

    try {
        Connection conn = (Connection) projek.Koneksi.koneksiDB();
        String sql = "select*from sedan";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            tabel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4)});
        }

        jTable1.setModel(tabel);
    } 
    catch (Exception e) {
    }
}





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
            java.util.logging.Logger.getLogger(Sedan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sedan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sedan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sedan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sedan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> id_mobil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jenis_bahan_bakar;
    private javax.swing.JTextField kapasitas_penumpang;
    private javax.swing.JButton tb_batal;
    private javax.swing.JButton tb_cari;
    private javax.swing.JButton tb_edit;
    private javax.swing.JButton tb_hapus;
    private javax.swing.JButton tb_simpan;
    // End of variables declaration//GEN-END:variables
}
