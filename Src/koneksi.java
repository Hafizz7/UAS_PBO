package tugas1_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    
    private static Connection conn;
    
    public static Connection koneksiDB() throws SQLException {
        try {
            String DB = "jdbc:mysql://localhost/dbobatbatuk";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB, user, pass);
//            System.out.println("Connected to database.");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return conn;
    }
    
}
