package entities;

public class Articulo {
	
	private int id;
	private String desc;
	private double precio;
	
	public Articulo(String desc_articulo, double precio) {
		this.desc = desc_articulo;
		this.precio = precio;
	}
	
	public Articulo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", desc=" + desc + ", precio=" + precio + "]";
	}
	
}
