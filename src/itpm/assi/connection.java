package itpm.assi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Msi 9RDS
 */
public class connection {
public static Connection getConnection()
{
try {
Class.forName("com.mysql.cj.jdbc.Driver");
//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm project?zeroDateTimeBehavior=convertToNull","root","");
String url ="jdbc:mysql://itpm-mysql-database-server.mysql.database.azure.com:3309/itpm_project";
Connection conn = DriverManager.getConnection(url, "saranga_itpmy3s1@itpm-mysql-database-server", "zaq1XSW@sara");
System.out.println("Database Connection Successfull!!");
return conn;
} catch (Exception e) {
JOptionPane.showMessageDialog(null, e );
return null;
}
}
}