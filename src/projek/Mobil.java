/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projek;
import java.sql.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author fahru
 */
public class Mobil extends javax.swing.JFrame {
public String tanggal_produksi;
    /**
     * Creates new form mobil
     */
    public Mobil() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        merek = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        jumlah_pintu = new javax.swing.JTextField();
        warna = new javax.swing.JTextField();
        tgl_produksi = new com.toedter.calendar.JDateChooser();
        tb_simpan = new javax.swing.JButton();
        tb_edit = new javax.swing.JButton();
        tb_hapus = new javax.swing.JButton();
        tb_batal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tb_cari = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id");

        jLabel2.setText("merek");

        jLabel3.setText("model");

        jLabel4.setText("tgl_produksi");

        jLabel5.setText("warna");

        jLabel6.setText("jumlah_pintu");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        merek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merekActionPerformed(evt);
            }
        });

        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });

        jumlah_pintu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_pintuActionPerformed(evt);
            }
        });

        warna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warnaActionPerformed(evt);
            }
        });

        tgl_produksi.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tgl_produksiPropertyChange(evt);
            }
        });

        tb_simpan.setText("simpan");
        tb_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_simpanActionPerformed(evt);
            }
        });

        tb_edit.setText("edit");
        tb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_editActionPerformed(evt);
            }
        });

        tb_hapus.setText("hapus");
        tb_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_hapusActionPerformed(evt);
            }
        });

        tb_batal.setText("batal");
        tb_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_batalActionPerformed(evt);
            }
        });

        jLabel7.setText("cari");

        tb_cari.setText("cari");
        tb_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_cariActionPerformed(evt);
            }
        });

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tb_cari))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(model))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id)
                                    .addComponent(merek, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tgl_produksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(warna)
                            .addComponent(jumlah_pintu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tb_simpan)
                        .addGap(18, 18, 18)
                        .addComponent(tb_edit)
                        .addGap(18, 18, 18)
                        .addComponent(tb_hapus)
                        .addGap(18, 18, 18)
                        .addComponent(tb_batal)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4))
                    .addComponent(tgl_produksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(merek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jumlah_pintu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_simpan)
                    .addComponent(tb_edit)
                    .addComponent(tb_hapus)
                    .addComponent(tb_batal))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tb_cari)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void warnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warnaActionPerformed

    private void merekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merekActionPerformed

    private void tb_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_cariActionPerformed
        try {
    java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
    String sql = "Select * from mobil where id='"+cari.getText()+"' or merek='"+cari.getText()+"'";
    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
    ResultSet rs = pst.executeQuery(sql);
    if (rs.next()){
        id.setText(rs.getString(1));
        merek.setText(rs.getString(2));
        model.setText(rs.getString(3));
        tgl_produksi.setDate(rs.getDate(4));
        warna.setText(rs.getString(5));
        jumlah_pintu.setText(rs.getString(6));
        JOptionPane.showMessageDialog(null,"Data mobil: "
        + cari.getText() + " ditemukan");
    }
} catch (Exception e){}
cari.requestFocus();
    }//GEN-LAST:event_tb_cariActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void tgl_produksiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tgl_produksiPropertyChange
        if (tgl_produksi.getDate()!=null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            tanggal_produksi=format.format (tgl_produksi.getDate());
        }
    
    }//GEN-LAST:event_tgl_produksiPropertyChange

    private void tb_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_simpanActionPerformed
        try{
            String sql="insert into mobil values('"
                    +id.getText()+"','"
                    +merek.getText()+"','"
                    +model.getText()+"','"
                    +tanggal_produksi+"','"
                    +warna.getText()+"','"
                    +jumlah_pintu.getText()+"')";
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
    }     
    
    public void tampil_data(){
    DefaultTableModel tabel = new DefaultTableModel();
    tabel.addColumn("id");
    tabel.addColumn("merek");
    tabel.addColumn("model");
    tabel.addColumn("tgl_produksi");
    tabel.addColumn("warna");
    tabel.addColumn("jumlah_pintu");
    try {
      java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
      String sql = "select*from mobil";
      java.sql.PreparedStatement pst = conn.prepareStatement(sql);
      ResultSet rs = pst.executeQuery(sql);
      while(rs.next ())      
        {
        tabel.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5),
            rs.getString(6)});
        }
       jTable1.setModel(tabel);
        }
    catch (Exception e){
    }
    }//GEN-LAST:event_tb_simpanActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelActionPerformed

    private void jumlah_pintuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_pintuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_pintuActionPerformed

    private void tb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_editActionPerformed
        try{
           java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
           String sql="update mobil set merek='" + merek.getText()+
                   "', model='"+model.getText()+
                   "', tgl_produksi='"+tanggal_produksi+
                   "', warna='"+warna.getText()+
                   "', jumlah_pintu='"+jumlah_pintu.getText()+
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

    private void tb_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_batalActionPerformed
        id.setText("");
        merek.setText("");
        model.setText("");
        tgl_produksi.setDate(null);
        warna.setText("");
        jumlah_pintu.setText("");
        id.requestFocus();
    }//GEN-LAST:event_tb_batalActionPerformed

    private void tb_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_hapusActionPerformed
        try{
            java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
            String sql = "delete from mobil where id='"+id.getText()+"' ";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate(); JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
            tampil_data();
            }
            catch (Exception e){
            JOptionPane.showMessageDialog(null,"Proses Penghapusan Gagal");
            System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_tb_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mobil().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlah_pintu;
    private javax.swing.JTextField merek;
    private javax.swing.JTextField model;
    private javax.swing.JButton tb_batal;
    private javax.swing.JButton tb_cari;
    private javax.swing.JButton tb_edit;
    private javax.swing.JButton tb_hapus;
    private javax.swing.JButton tb_simpan;
    private com.toedter.calendar.JDateChooser tgl_produksi;
    private javax.swing.JTextField warna;
    // End of variables declaration//GEN-END:variables
}
