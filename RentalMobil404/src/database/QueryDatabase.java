package database;

import java.net.Socket;
import java.sql.*;

public class QueryDatabase {

    //membuat variabel
    Connection cn;
    Statement statement;
    public String SQL, url, username, password, Host;
    Socket client;
    public int Port;

    public QueryDatabase(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.Host=Host;
        this.Port=Port;  
    }

   
    public Connection koneksiDatabase() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection(url, username, password);

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        return cn;
    }

    public Connection closeKoneksi() {

        try {
            cn.close();
        } catch (Exception e) {
        }
        return cn;
    }

    public ResultSet eksekusiQuery(String sql) {
        koneksiDatabase();
        ResultSet resultSet = null;
        try {
            statement = cn.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
        }
        return resultSet;

    }

    public String eksekusiUpdate(String sql) {
        koneksiDatabase();
        String result = "";
        try {
            statement = cn.createStatement();
            statement.executeUpdate(sql);
             System.out.println(sql);
        } catch (SQLException ex) {
            result = ex.toString();
        }
        return result;
    }

    //untuk eksekusi query select semua kolom
    public ResultSet querySelectAll(String namaTabel) {
        SQL = "SELECT * FROM " + namaTabel;
        return this.eksekusiQuery(SQL);
    }

    //untuk eksekusi query select semua kolom dengan kondisi/ where
    public ResultSet querySelectAllWhere(String namaTabel, String kondisi) {
        SQL = "SELECT * FROM " + namaTabel + " WHERE " + kondisi;
        return this.eksekusiQuery(SQL);
    }

    //untuk eksekusi query select dengan kolom spesifik
    public ResultSet querySelect(String[] namaKolom, String namaTabel) {
        int i;
        SQL = "SELECT ";
        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i];
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }
        SQL += " FROM " + namaTabel;
        return this.eksekusiQuery(SQL);
    }

    //untuk eksekusi query select dengan kolom spesifik dengan kondisi/ where
    public ResultSet querySelectWhere(String[] namaKolom, String namaTabel, String kondisi) {
        int i;
        SQL = "SELECT ";
        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i];
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }
        SQL += " FROM " + namaTabel + " WHERE " + kondisi;
        return this.eksekusiQuery(SQL);
    }

    //eksekusi query insert
    public String queryInsert(String namaTabel, String[] isiTabel) {
        int i;
        SQL = "INSERT INTO " + namaTabel + " VALUES(";

        for (i = 0; i <= isiTabel.length - 1; i++) {
            SQL += "'" + isiTabel[i] + "'";
            if (i < isiTabel.length - 1) {
                SQL += ",";
            }
        }
        SQL += ")";
        return this.eksekusiUpdate(SQL);

    }
    
    //eksekusi query insert
    public String eksekusiQueryInsert(String namaTabel, String[] namaKolom, String[] isiTabel) {
        int i;
        SQL = "INSERT INTO " + namaTabel + "(";
        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i];
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }
        SQL += ") VALUES(";
        for (i = 0; i <= isiTabel.length - 1; i++) {
            SQL += "'" + isiTabel[i] + "'";
            if (i < isiTabel.length - 1) {
                SQL += ",";
            }
        }
        SQL += ")";
        return this.eksekusiUpdate(SQL);
    }
    
    //eksekusi query update
    public String queryUpdate(String namaTabel, String[] namaKolom, String[] isiTabel, String kondisi) {
        int i;
        SQL = "UPDATE " + namaTabel + " SET ";
        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i] + "='" + isiTabel[i] + "'";
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }
        SQL += " WHERE " + kondisi;
        return this.eksekusiUpdate(SQL);
    }

    //eksekusi query delete
    public String queryDelete(String namaTabel) {
        SQL = "DELETE FROM " + namaTabel;
        return this.eksekusiUpdate(SQL);
    }

    //eksekusi query delete dengan where
    public String queryDeleteWhere(String namaTabel, String kondisi) {
        SQL = "DELETE FROM " + namaTabel + " WHERE " + kondisi;
        return this.eksekusiUpdate(SQL);
    }
}
