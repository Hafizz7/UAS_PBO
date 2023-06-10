/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas1_login;

import com.mysql.cj.xdevapi.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ACER
 */
public class Manage_data_obat extends javax.swing.JFrame { 
    int idObat;
    public void atur_kolom(){
        TableColumn column;
        dataobat.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = dataobat.getColumnModel().getColumn(0); 
        column.setPreferredWidth(30);
        column = dataobat.getColumnModel().getColumn(1); 
        column.setPreferredWidth(70);
        column = dataobat.getColumnModel().getColumn(2); 
        column.setPreferredWidth(90);
        column = dataobat.getColumnModel().getColumn(3); 
        column.setPreferredWidth(90);
        column = dataobat.getColumnModel().getColumn(4); 
        column.setPreferredWidth(80);
        column = dataobat.getColumnModel().getColumn(5); 
        column.setPreferredWidth(150); 
        column = dataobat.getColumnModel().getColumn(6); 
        column.setPreferredWidth(90);//ketersediaan
        column = dataobat.getColumnModel().getColumn(7); 
        column.setPreferredWidth(120);
        column = dataobat.getColumnModel().getColumn(8); 
        column.setPreferredWidth(70);
        column = dataobat.getColumnModel().getColumn(9); 
        column.setPreferredWidth(250);
    }
    public void lihatdata(){
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("NO");
    model.addColumn("ID Obat");
    model.addColumn("Nama Obat");
    model.addColumn("Harga Obat");
    model.addColumn("Stock Obat");
    model.addColumn("Jenis Obat");
    model.addColumn("Ketersediaan");
    model.addColumn("Dosis Obat");
    model.addColumn("Expired Obat");
    model.addColumn("Deskripsi Obat");
    try{
        int no = 1;
        String sql  = "Select * from dataobat";
        Connection conn = koneksi.koneksiDB();
        java.sql.Statement st = conn.createStatement();
        java.sql.ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
            int hargaObat = rs.getInt("harga_obat");
            String hargaRupiah = formatRupiah.format(hargaObat); 
            model.addRow(new Object[] {no++,rs.getString(1),rs.getString(2), hargaRupiah, rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
            dataobat.setModel(model);                            
        }
        atur_kolom();
    } 
    catch (Exception e) { 
        System.out.println(e.getMessage());
        System.out.println("Ambil Data Gagal");
        }    
    }
    /**
     * Creates new form Lihat_data
     */
    public Manage_data_obat() {
        initComponents();                
        lihatdata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataobat = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btndaftarpesanan = new javax.swing.JButton();
        btndaftarpesanan1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dataobat.setModel(new javax.swing.table.DefaultTableModel(
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
        dataobat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataobatMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dataobatMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(dataobat);

        btnSimpan.setText("Tambah");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel1.setText("Daftar Obat Batuk");

        btndaftarpesanan.setText("Lihat Daftar Pesanan");
        btndaftarpesanan.setPreferredSize(new java.awt.Dimension(72, 23));
        btndaftarpesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarpesananActionPerformed(evt);
            }
        });

        btndaftarpesanan1.setText("Logout");
        btndaftarpesanan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarpesanan1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel2.setText("Cari Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndaftarpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btndaftarpesanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndaftarpesanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndaftarpesanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Login.ambildata = 1;
        Admin coba = new Admin();        
        coba.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void dataobatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataobatMouseClicked
            
    }//GEN-LAST:event_dataobatMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         int selectedRow = dataobat.getSelectedRow();
         Login.ambildata = 2;
    if (selectedRow >= 0) {                
        idObat = Integer.parseInt(dataobat.getValueAt(selectedRow, 1).toString());
        String namaObat = dataobat.getValueAt(selectedRow, 1).toString();
        String jenisObat = dataobat.getValueAt(selectedRow, 2).toString();
        String ketersediaan = dataobat.getValueAt(selectedRow, 3).toString();
        String dosisObat = dataobat.getValueAt(selectedRow, 4).toString();
        String expiredObat = dataobat.getValueAt(selectedRow, 5).toString();
        String deskripsiObat = dataobat.getValueAt(selectedRow, 6).toString();                        
        // Buka Admin dengan objek Manage_data_obat yang sedang berjalan
        Admin admin = new Admin();                
        admin.setUpdate(idObat);
        admin.setVisible(true); 
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Tidak ada baris yang dipilih.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
            try (Connection connection = koneksi.koneksiDB()) {            
                String deleteQuery = "DELETE From dataobat WHERE id_obat=?";
                PreparedStatement statement = connection.prepareStatement(deleteQuery);            
                statement.setInt(1, idObat);            
                statement.executeUpdate();
                lihatdata();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal menghapus data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
                
    }//GEN-LAST:event_txtCariKeyPressed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void dataobatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataobatMouseReleased
        int selectedRow = dataobat.getSelectedRow();
        Login.ambildata = 2;         
        idObat = Integer.parseInt(dataobat.getValueAt(selectedRow, 1).toString());
    }//GEN-LAST:event_dataobatMouseReleased

    private void btndaftarpesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarpesananActionPerformed
        pesanan_user neww = new pesanan_user();
        neww.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndaftarpesananActionPerformed

    private void btndaftarpesanan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarpesanan1ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndaftarpesanan1ActionPerformed

    private void txtCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyTyped
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO");
        model.addColumn("ID Obat");
        model.addColumn("Nama Obat");
        model.addColumn("Harga Obat");
        model.addColumn("Stock Obat");
        model.addColumn("Jenis Obat");
        model.addColumn("Ketersediaan");
        model.addColumn("Dosis Obat");
        model.addColumn("Expired Obat");
        model.addColumn("Deskripsi Obat");

        try {
            int no = 1;
            String sql = "Select * From dataobat where nama_obat Like ? Or jenis_obat Like ? OR id_obat Like ?";
            Connection conn = koneksi.koneksiDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + txtCari.getText() + "%");
            statement.setString(2, "%" + txtCari.getText() + "%");
            statement.setString(3, "%" + txtCari.getText() + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
                int hargaObat = rs.getInt("harga_obat");
                String hargaRupiah = formatRupiah.format(hargaObat); 
                model.addRow(new Object[] {no++, rs.getString(1), rs.getString(2), hargaRupiah, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)});
                
            }   
            dataobat.setModel(model);
            atur_kolom();
            
        } 
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Ambil Data Gagal");
        }
    }//GEN-LAST:event_txtCariKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_data_obat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btndaftarpesanan;
    private javax.swing.JButton btndaftarpesanan1;
    private javax.swing.JTable dataobat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}