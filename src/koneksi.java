
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arifin
 */
public class koneksi {

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 private Connection connect;  
   private final String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL  
   private final String jdbc = "jdbc:mysql://";  
   private final String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth : 192.168.100.100  
   private final String port = "3306/"; // Port ini port MySQL  
   private final String database = "data_siswamoklet"; // Ini Database yang akan digunakan  
   private final String url = jdbc + host + port + database;  
   private final String username = "root"; // username default mysql  
   private final String password = "";  
   public Connection getKoneksi() throws SQLException {  
     if (connect == null) {  
       try {  
         Class.forName(driverName);  
         System.out.println("Class Driver Ditemukan");  
         try {  
           connect = DriverManager.getConnection(url, username, password);  
           System.out.println("Koneksi Database Sukses");  
         } catch (SQLException se) {  
           System.out.println("Koneksi Database Gagal : " + se);  
           System.exit(0);  
         }  
       } catch (ClassNotFoundException cnfe) {  
         System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : " + cnfe);  
         System.exit(0);  
       }  
     }  
     return connect;  
   }   
   
}
