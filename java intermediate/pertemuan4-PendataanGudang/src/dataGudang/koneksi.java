/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataGudang;

import java.sql.*;
/**
 *
 * @author satrio
 */
public class koneksi {
    private Statement data = null;
    private Connection koneksi = null;
    private String Url = "jdbc:mysql://localhost:3306/gudang_50421953";
    private String DBUser = "root";
    private String DBPassword="";
    
    public koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(Url,DBUser,DBPassword);
            data = this.koneksi.createStatement();
            System.out.println("Koneksi Berhasil");
        }catch(Throwable ex){
            System.out.println("error : "+ex);
            System.exit(1);
        }
    }
        public Connection getConnection(){
            return koneksi;
        }
        public Statement getStatement(){
            return data;
        }
    }
