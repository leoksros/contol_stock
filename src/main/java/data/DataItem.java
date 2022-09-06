package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Item;

public class DataItem {
	
	public void create(Item item) {
		
		PreparedStatement stmt= null;
		ResultSet keyResultSet=null;
		
		try {
			stmt= DbConnector.getInstancia().getConn().
					prepareStatement(
							"insert into articulos_ventas(id_venta, id_articulo, cantidad) values(?,?,?)"
							);
			
			stmt.setInt(1, item.getId_articulo());
			stmt.setInt(2,item.getId_venta());
			stmt.setInt(3, item.getCant());

			stmt.executeUpdate();
			
			
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
