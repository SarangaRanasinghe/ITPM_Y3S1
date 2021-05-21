/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ITPMAssi extends javax.swing.JFrame {
 
     Connection con;      
    public ITPMAssi(){
       
    }
    public void dbconnection(){
        
     try{
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost:3307/itpmproject?zeroDateTimeBehavior=convertToNull", "root",""); 
     }catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
     }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        // TODO code application logic here
    }

    

}
