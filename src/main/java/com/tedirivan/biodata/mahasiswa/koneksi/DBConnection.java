/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tedirivan.biodata.mahasiswa.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    public static Connection getKoneksi(){
        Connection con = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mahasiswa?createDatabaseIfNotExist=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Jakarta&useSSL=false";
        String user = "root";
        String password = "root";
        if(con == null){
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Terjadi error!\nDengan Pesan :" 
                        + e.getMessage());
            }
        }
        return con;
    } 
    
}
