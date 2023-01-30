/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bms;

import java.sql.*;


/**
 *
 * @author KAMIL RAZA
 */
public class DB {
    Connection conn;
    ResultSet rs;
    Statement st;
    public DB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBMS", "root", "");
            System.out.println("DB is Connected");       
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        
        
    }
    
}
 class main {
 
     public static void main(String[] args){
     
     DB db=new DB();
     }
 }