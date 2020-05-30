package com.demo.database.mysql.implementations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.demo.app.* ;
import com.demo.entities.StudentEntity;
import com.demo.utilities.PosgresUtilities;
public class MySQLBaseDataAccessLayer{
	String sql = "insert into student (name, rollNo, cls) values(?,?,?)"; 	
	String sql1 = "SELECT * FROM student";	
	String sql2 = "UPDATE student SET name=?,cls=? WHERE rollNo=?";	
	String sql3 = "DELETE FROM student WHERE rollNo=?";
	Connection conn=null;
	PreparedStatement st=null;
	public void create(StudentEntity studentEntity)
	{
		conn=PosgresUtilities.getConnection();
		 try {
			st = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			st.setString(1,"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 int result=0;
		 //return result;
          
	}
}
