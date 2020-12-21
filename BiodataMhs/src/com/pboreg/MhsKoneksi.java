package com.pboreg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MhsKoneksi {
    //buat attribut untuk koneksi
    private Connection conn;

    //buat deklarasi atribut untuk statement
    private Statement st;

    //definisikan username, password, dan alamat dari server mysql
    public MhsKoneksi() {
        try {
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/pbo-reguler";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int manipulasiData(String query){
        try {
            st = conn.createStatement();
            return st.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}
