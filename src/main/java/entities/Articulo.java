package entities;

public class Articulo {
	
	private int id;
	private String desc_articulo;
	private double precio;
	
	public Articulo(String desc_articulo, double precio) {
		this.desc_articulo = desc_articulo;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc_articulo() {
		return desc_articulo;
	}

	public void setDesc_articulo(String desc_articulo) {
		this.desc_articulo = desc_articulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	
}
