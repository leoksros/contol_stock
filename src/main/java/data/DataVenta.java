package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Venta;

public class DataVenta {
	
	public void create(Venta venta) {
		
		PreparedStatement stmt= null;
		ResultSet keyResultSet=null;
		
		try {
			stmt= DbConnector.getInstancia().getConn().
					prepareStatement(
							"insert into ventas(created_at, total, id_cliente) values(?,?,?)",
							PreparedStatement.RETURN_GENERATED_KEYS
							);
			
			stmt.setDate(1, venta.getCreated_at());
			stmt.setDouble(2,venta.getTotal());
			stmt.setInt(3, venta.getCliente().getId());

			stmt.executeUpdate();
			
			keyResultSet=stmt.getGeneratedKeys();
            if(keyResultSet!=null && keyResultSet.next()){
            	venta.setId(keyResultSet.getInt(1));
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
