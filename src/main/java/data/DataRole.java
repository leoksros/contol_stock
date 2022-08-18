package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.sql.Statement;
import entities.*;



public class DataRole {
	
	public LinkedList<Role> getAll(){
		Statement stmt = null;
		ResultSet rs = null;
		LinkedList<Role> roles = new LinkedList<>();
		
		try {
			stmt= DbConnector.getInstancia().getConn().createStatement();
			rs= stmt.executeQuery("select * from roles");
			if(rs!=null) {
				while(rs.next()) {
					Role r=new Role();
					r.setId(rs.getInt("id"));
					r.setDesc(rs.getString("desc"));
					roles.add(r);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(rs!=null) {rs.close();}
				if(stmt!=null) {stmt.close();}
				DbConnector.getInstancia().releaseConn();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return roles;
	}
	
	public void create(Role role) {
		
		PreparedStatement stmt= null;
		ResultSet keyResultSet=null;
		
		try {
			stmt= DbConnector.getInstancia().getConn().
					prepareStatement(
							"insert into roles (`desc`) values(?)",
							PreparedStatement.RETURN_GENERATED_KEYS
							);
			
			stmt.setString(1, role.getDesc());

			stmt.executeUpdate();
			
			keyResultSet=stmt.getGeneratedKeys();
            if(keyResultSet!=null && keyResultSet.next()){
            	role.setId(keyResultSet.getInt(1));
            }

			
		}  catch (SQLException e) {
            e.printStackTrace();
		} finally {
            try {
                if(keyResultSet!=null)keyResultSet.close();
                if(stmt!=null)stmt.close();
                DbConnector.getInstancia().releaseConn();
            } catch (SQLException e) {
            	e.printStackTrace();
            }
		}
		
	}	

}
