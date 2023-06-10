package tugas1_login;
import java.sql.SQLException;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextField;
import java.util.Date;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {        
        String memilih_ketersediaan;           
        private File selectedFile;
        private byte[] fileBytes = null;
        public void setUpdate(int idObat) {
            txtIdobat.setText(String.valueOf(idObat));            
        }    
        public Admin() {                         
            initComponents();     
            System.out.println("ambil data" + Login.ambildata);
            if(Login.ambildata == 2){                
                btnTambah.setText("Update");
                txtIdobat.setEditable(false);
            }
            else{
                btnTambah.setText("Simpan");
                txtIdobat.setEditable(true);                
            }
    }
     public Admin(int idObat) {
        
        initComponents();
        setUpdate(idObat);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbketersediaan1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();
        cbxJenisobat = new javax.swing.JComboBox<>();
        dateExpired = new com.toedter.calendar.JDateChooser();
        btnTambah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        cbxdosisobat = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtIdobat = new javax.swing.JTextField();
        txtNamaobat = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStokbarang = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel4.setText("Menu Admin");

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel2.setText("Nama Obat");

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Obat");

        jLabel5.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel5.setText("Ketersediaan");

        jLabel6.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel6.setText("Dosis Obat");

        jLabel7.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel7.setText("Expired");

        jLabel8.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel8.setText("Deskripsi Obat");

        buttonGroup1.add(rbketersediaan1);
        rbketersediaan1.setText("Tersedia");
        rbketersediaan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbketersediaan1ActionPerformed(evt);
            }
        });

        txtDeskripsi.setColumns(20);
        txtDeskripsi.setRows(5);
        jScrollPane2.setViewportView(txtDeskripsi);

        cbxJenisobat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pill", "Kapsul", "Cairan" }));

        btnTambah.setText("Simpan");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Tidak Tersedia");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        cbxdosisobat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagi - Siang - Malam", "Malam", "Pagi" }));

        jLabel9.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel9.setText("ID Obat");

        txtIdobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdobatActionPerformed(evt);
            }
        });
        txtIdobat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdobatKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdobatKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdobatKeyTyped(evt);
            }
        });

        txtNamaobat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaobatKeyPressed(evt);
            }
        });

        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel10.setText("Harga Obat");

        txtStokbarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStokbarangKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel11.setText("Stock Obat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdobat)
                            .addComponent(txtNamaobat, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtStokbarang, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbketersediaan1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(cbxJenisobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxdosisobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateExpired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdobat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStokbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxJenisobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rbketersediaan1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(cbxdosisobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateExpired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbketersediaan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbketersediaan1ActionPerformed
        memilih_ketersediaan = "Tersedia";
    }//GEN-LAST:event_rbketersediaan1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        memilih_ketersediaan = "Tidak Tersedia";
//        txtStokbarang.setText("0");
//        txtStokbarang.setEditable(false);
        

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // Membaca konten file dan menyimpannya dalam array byte        
        //String filename = selectedFile.getName();
        txtNamaobat.getText();        
        String pilihjenis = cbxJenisobat.getSelectedItem().toString();
        String pilihdosis = cbxdosisobat.getSelectedItem().toString();
        Date pilihtanggal = dateExpired.getDate();
        
        if (txtIdobat.getText().isEmpty() || txtNamaobat.getText().isEmpty() || pilihjenis.isEmpty() || memilih_ketersediaan == null  || pilihdosis.isEmpty() || 
                pilihtanggal == null || txtDeskripsi.getText().isEmpty() || txtHarga.getText().isEmpty() || txtStokbarang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harap isi semua kolom input.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{        
            try (Connection connection = koneksi.koneksiDB()) {
                if(Login.ambildata == 2){
                    btnTambah.setText("Update");                    
                    int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menambahkan data ini?", "Konfirmasi Tambah Data", JOptionPane.YES_NO_OPTION);
                    if (konfirmasi == JOptionPane.YES_OPTION) {
                        String updateQuery = "UPDATE dataobat SET nama_obat=?, harga_obat=?, stock_obat=?,jenis_obat=?, ketersediaan=?, dosis=?, expired_obat=?, deskripsi_obat=? WHERE id_obat=?";
                        PreparedStatement statement = connection.prepareStatement(updateQuery);                        
                        statement.setString(1, txtNamaobat.getText());
                        statement.setString(2, txtHarga.getText());
                        statement.setString(3, txtStokbarang.getText());
                        statement.setString(4, pilihjenis);
                        statement.setString(5, memilih_ketersediaan);
                        statement.setString(6, pilihdosis);
                        statement.setDate(7, new java.sql.Date(pilihtanggal.getTime()));
                        statement.setString(8, txtDeskripsi.getText());
                        statement.setString(9, txtIdobat.getText());
                        int rowsUpdated = statement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Berhasil Mengubah Data", "Success", JOptionPane.INFORMATION_MESSAGE);            
                    }
                }
                else{                
                    btnTambah.setText("Simpan");  
                    int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menambahkan data ini?", "Konfirmasi Tambah Data", JOptionPane.YES_NO_OPTION);
                    if (konfirmasi == JOptionPane.YES_OPTION) {
                        String insertQuery = "INSERT INTO dataobat (id_obat, nama_obat,harga_obat, stock_obat, jenis_obat, ketersediaan, dosis, expired_obat, deskripsi_obat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement statement = connection.prepareStatement(insertQuery);                
                        statement.setString(1, txtIdobat.getText());
                        statement.setString(2, txtNamaobat.getText());
                        statement.setString(3, txtHarga.getText());
                        statement.setString(4, txtStokbarang.getText());
                        statement.setString(5, pilihjenis);
                        statement.setString(6, memilih_ketersediaan);
                        statement.setString(7, pilihdosis);
                        statement.setDate(8, new java.sql.Date(pilihtanggal.getTime()));
                        statement.setString(9, txtDeskripsi.getText());
                        statement.executeUpdate();                   
                        JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data", "Success", JOptionPane.INFORMATION_MESSAGE);            
                    }
                }                        
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal mengupload data ke database", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Manage_data_obat obat = new Manage_data_obat();
        obat.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtIdobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdobatActionPerformed
        // TODO ad
       
    }//GEN-LAST:event_txtIdobatActionPerformed

    private void txtIdobatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdobatKeyPressed
//          char enter = evt.getKeyChar();
//          if(!(Character.isDigit(enter))){
//              evt.consume();
////              JOptionPane.showMessageDialog(null, "ID Obat Harus Berupa Angka.", "Inputan Salah", JOptionPane.INFORMATION_MESSAGE);
////              txtIdobat.setText("");
//          }
    }//GEN-LAST:event_txtIdobatKeyPressed

    private void txtNamaobatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaobatKeyPressed
        if(Login.ambildata == 2){
            
        }
        else{
            try {                
            String sql = "SELECT id_obat FROM dataobat WHERE id_obat = ?";
            Connection conn = koneksi.koneksiDB();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, txtIdobat.getText());
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "ID Obat sudah ada.", "Duplikat ID", JOptionPane.INFORMATION_MESSAGE);
                txtIdobat.requestFocus();                            
            }
    
        }
        catch (SQLException e) {
//            System.out.println(e.getMessage());
//            JOptionPane.showMessageDialog(null, "Gagal mengambil data pemesanan", "Error", JOptionPane.ERROR_MESSAGE);
           }
        }
        
    }//GEN-LAST:event_txtNamaobatKeyPressed

    private void txtIdobatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdobatKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdobatKeyReleased

    private void txtIdobatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdobatKeyTyped
        char enter = evt.getKeyChar();
          if(!(Character.isDigit(enter))){
              evt.consume();
              
          }
    }//GEN-LAST:event_txtIdobatKeyTyped

    private void txtHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyTyped
        char enter = evt.getKeyChar();
          if(!(Character.isDigit(enter))){
              evt.consume();
              
          }
    }//GEN-LAST:event_txtHargaKeyTyped

    private void txtStokbarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStokbarangKeyTyped
        char enter = evt.getKeyChar();
          if(!(Character.isDigit(enter))){
              evt.consume();
              JOptionPane.showMessageDialog(null, "Stock Obat Harus Berupa Angka.", "Inputan Salah", JOptionPane.INFORMATION_MESSAGE);              
          }
    }//GEN-LAST:event_txtStokbarangKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> cbxJenisobat;
    private javax.swing.JComboBox<String> cbxdosisobat;
    private com.toedter.calendar.JDateChooser dateExpired;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbketersediaan1;
    private javax.swing.JTextArea txtDeskripsi;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdobat;
    private javax.swing.JTextField txtNamaobat;
    private javax.swing.JTextField txtStokbarang;
    // End of variables declaration//GEN-END:variables
}
