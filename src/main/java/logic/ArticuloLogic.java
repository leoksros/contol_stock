package logic;

import data.DataArticulo;
import entities.Articulo;

public class ArticuloLogic {
	
	private DataArticulo dataArticulo;

	public ArticuloLogic() {
		dataArticulo = new DataArticulo();
	}
	
	public void create(Articulo art) {
		dataArticulo.create(art);
	}
	
	public void edit() {
		
	}
	
	public void view() {
		
	}
	
	public void delete() {
		
	}
}
