package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Articulo;

public class DataArticulo {
	public void create(Articulo art) {
		
		PreparedStatement stmt= null;
		ResultSet keyResultSet=null;
		
		try {
			stmt= DbConnector.getInstancia().getConn().
					prepareStatement(
							"insert into ventas(desc, precio) values(?,?)",
							PreparedStatement.RETURN_GENERATED_KEYS
							);
			
			stmt.setString(1, art.getDesc_articulo());
			stmt.setDouble(2,art.getPrecio());

			stmt.executeUpdate();
			
			keyResultSet=stmt.getGeneratedKeys();
            if(keyResultSet!=null && keyResultSet.next()){
            	art.setId(keyResultSet.getInt(1));
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
