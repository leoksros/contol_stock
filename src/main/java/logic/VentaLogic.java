package logic;

import data.DataVenta;
import entities.Venta;

public class VentaLogic {
	
	private DataVenta dataVenta;

	public VentaLogic() {
		dataVenta = new DataVenta();
	}
	
	public void create(Venta venta) {
		dataVenta.create(venta);
	}
	
	public void edit() {
		
	}
	
	public void view() {
		
	}
	
	public void delete() {
		
	}
}
