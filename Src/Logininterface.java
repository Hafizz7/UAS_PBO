package tugas1_login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//abstract class AbstractLogin {;
//    public abstract void register(String username, String password) throws SQLException;
//}

class Logininterface extends javax.swing.JFrame {
    static String usernamee;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPasswordField txtpassword;

    public javax.swing.JTextField getUsername() {
        return txtusername;
    }

    public void setUsername(javax.swing.JTextField username) {
        this.txtusername = username;
    }

    public javax.swing.JPasswordField getPassword() {
        return txtpassword;
    }

    public void setPassword(javax.swing.JPasswordField password) {
        this.txtpassword = password;
    }

    public Logininterface() {
        txtusername = new javax.swing.JTextField(); // Inisialisasi objek txtusername
    }

    public void login() throws SQLException {
        try {
            String username = txtusername.getText();
            String password = String.valueOf(txtpassword.getPassword());

            if (username.equals("admin") && password.equals("123")) {
                usernamee = "admin";
                Manage_data_obat coba = new Manage_data_obat();
                coba.setVisible(true);
                this.dispose();
            }
            else {                
                Connection conn = koneksi.koneksiDB();
                PreparedStatement st = conn.prepareStatement("SELECT * FROM login_user WHERE username = ? AND psw = ?");
                st.setString(1, username);
                st.setString(2, password);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    usernamee = rs.getString("username");                    
                    menu_pesanan_user coba2 = new menu_pesanan_user();
                    coba2.setVisible(true);                    
                } else {
                    JOptionPane.showMessageDialog(null, "Username / Password Tidak Ditemukan", "Error",JOptionPane.ERROR_MESSAGE);
                    Login login = new Login();
                    login.setVisible(true);                    
                }
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void register(String username, String password) throws SQLException {
         
        try {
            Connection conn = koneksi.koneksiDB();
            PreparedStatement st = conn.prepareStatement("INSERT INTO login_user (username, psw) VALUES (?, ?)");            
            st.setString(1, username);
            st.setString(2, password);
            if(username.equals("admin")){
                JOptionPane.showMessageDialog(null, "Username Telah Digunakan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else{
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
            }
            
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
