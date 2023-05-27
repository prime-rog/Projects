package PJJ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class jdbc {
	jdbc(String s)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library" ,"root" , "root");
			Statement stm = con.createStatement(); //create statement
            String sql = s; //query
            ResultSet rs = stm.executeQuery(sql);
            
            if(rs.next())
            {
            	System.out.println("Successful");
            }
            else
            {
            	JOptionPane.showMessageDialog(null, "Username or Password mismatch ");
            }
            
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
