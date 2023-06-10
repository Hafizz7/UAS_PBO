/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas1_login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ACER
 */
public class pesanan_user extends javax.swing.JFrame {
    public String namee;
public void atur_kolom(){
        TableColumn column;
        datapesananuser.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = datapesananuser.getColumnModel().getColumn(0); 
        column.setPreferredWidth(30);
        column = datapesananuser.getColumnModel().getColumn(1); 
        column.setPreferredWidth(150);
        column = datapesananuser.getColumnModel().getColumn(2); 
        column.setPreferredWidth(80);        
        column = datapesananuser.getColumnModel().getColumn(3); 
        column.setPreferredWidth(130);
        column = datapesananuser.getColumnModel().getColumn(4); 
        column.setPreferredWidth(90);
        column = datapesananuser.getColumnModel().getColumn(5); 
        column.setPreferredWidth(90);
        column = datapesananuser.getColumnModel().getColumn(6); 
        column.setPreferredWidth(100);
        column = datapesananuser.getColumnModel().getColumn(7); 
        column.setPreferredWidth(180);
        
    }
    public void tampil_data(){            
        try{
            int no = 1;
            String username = Logininterface.usernamee;            
            String sql  = "Select * from pesanan_user where username = ?";        
            
            Connection conn = koneksi.koneksiDB();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();  
            if(username.equals("admin")){
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("NO");            
                model.addColumn("Nama Obat");
                model.addColumn("Username");
                model.addColumn("Jenis Obat");    
                model.addColumn("Dosis Obat");                
                model.addColumn("Jumlah Barang");               
                model.addColumn("Harga Obat"); 
                model.addColumn("Alamat Pemesanan"); 
                 
                String admin  = "Select * from pesanan_user"; 
                PreparedStatement stadmin = conn.prepareStatement(admin);
                st.setString(1, username);
                ResultSet rsadmin = stadmin.executeQuery(); 
                while(rsadmin.next()){
                    String harga_obat = rsadmin.getString("harga_obat");
                    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
                    String totalHargaRupiah = formatRupiah.format(Double.parseDouble(harga_obat));
                    String hargaa = totalHargaRupiah;
                    model.addRow(new Object[] {
                        no++,                        
                        rsadmin.getString("nama_obat"),
                        rsadmin.getString("username"),
                        rsadmin.getString("jenis_obat"),                
                        rsadmin.getString("dosis"),                        
                        rsadmin.getString("jumlah_barang"),   
                        hargaa,
                        rsadmin.getString("alamat_pesanan"),                        
                });
                  datapesananuser.setModel(model);            
                  atur_kolom();
              }    
                
            }
            else{
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("NO");            
                model.addColumn("Nama Obat");
                model.addColumn("Jenis Obat");    
                model.addColumn("Dosis Obat");
                model.addColumn("Expired Obat");
                model.addColumn("Jumlah Barang");               
                model.addColumn("Harga Obat"); 
                model.addColumn("Alamat Pemesanan");             
                while(rs.next()){
                    String harga_obat = rs.getString("harga_obat");
                    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
                    String totalHargaRupiah = formatRupiah.format(Double.parseDouble(harga_obat));
                    String hargaa = totalHargaRupiah;
                model.addRow(new Object[] {
                      no++,
                      rs.getString("nama_obat"),
                      rs.getString("jenis_obat"),                
                      rs.getString("dosis"),
                      rs.getString("expired_obat"),
                      rs.getString("jumlah_barang"), 
                      hargaa,
                      rs.getString("alamat_pesanan"),
                });
                  datapesananuser.setModel(model);            
                  atur_kolom();
              }    
            }              
        } 
        catch (Exception e) {            
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal mengambil data pemesanan", "Error", JOptionPane.ERROR_MESSAGE);
            }    
        }
    /**
     * Creates new form pesanan_user
     */
    public pesanan_user() {
        initComponents();
        if(Logininterface.usernamee.equals("admin")){
            txtjudul.setText("Daftar Penjualan Obat");
        }
        else{
            txtjudul.setText("Daftar Obat Batuk Yang Telah di Beli");
        }
        tampil_data();

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
        datapesananuser = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        txtjudul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datapesananuser.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(datapesananuser);

        btnHome.setText("Kembali");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        txtjudul.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        txtjudul.setText("Daftar Obat Batuk Yang Telah di Beli");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(txtjudul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtjudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        String username = Logininterface.usernamee;
        if(username.equals("admin")){
            Manage_data_obat manage = new Manage_data_obat();
            manage.setVisible(true);
            this.dispose();
        }
        else{
            menu_pesanan_user home = new menu_pesanan_user();
            home.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(pesanan_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pesanan_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pesanan_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pesanan_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pesanan_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JTable datapesananuser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtjudul;
    // End of variables declaration//GEN-END:variables
}
