package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDatabase {
    
    public static String IPHOST="127.0.0.1";
    public static String HOST_DB="jdbc:mysql://"+IPHOST+":3306/rentalmobil404";
    public static String USERNAME_DB="root";
    public static String PASSWORD_DB="";
    public static int PORT=11111;
    public static String USER;
    
    public static Connection getKoneksi(String host, String port, String username, String password, String ahm) {
        String konString = "jdbc:mysql://" + host + ":" + port + "/" + ahm;
        Connection koneksi = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(konString, username, password);
            System.out.println("Koneksi Berhasil");
        } catch (Exception ex) {
            System.out.println("Error koneksi");
            koneksi = null;
        }
        return koneksi;
    }
    
    

}
