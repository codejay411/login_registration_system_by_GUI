/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginregistrationproject;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author jaypr
 */
// this class is responsible fro getting the mysql connection
public class MysqlConnect {
    Connection conn;
    public Connection getconn(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","root");
        JOptionPane.showMessageDialog(null,"database connection successfull");
        return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in Mysql connect getconn methods"+e);
        }
        return conn; 
    }
    
}
