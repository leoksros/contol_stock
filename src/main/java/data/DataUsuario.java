package data;
import entities.Usuario;
import java.sql.*;

public class DataUsuario {
	
	public void create(Usuario user) {
		
		PreparedStatement stmt= null;
		ResultSet keyResultSet=null;
		
		try {
			stmt= DbConnector.getInstancia().getConn().
					prepareStatement(
							"insert into usuarios(usuario, nombre, apellido, email, password) values(?,?,?,?,?)",
							PreparedStatement.RETURN_GENERATED_KEYS
							);
			
			stmt.setString(1, user.getUsuario());
			stmt.setString(2, user.getNombre());
			stmt.setString(3, user.getApellido());
			stmt.setString(4, user.getEmail());
			stmt.setString(5, user.getPassword());

			stmt.executeUpdate();
			
			keyResultSet=stmt.getGeneratedKeys();
            if(keyResultSet!=null && keyResultSet.next()){
            	user.setId(keyResultSet.getInt(1));
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
