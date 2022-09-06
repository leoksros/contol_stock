package entities;

import java.sql.Date;
import java.util.ArrayList;

public class Venta {
	
	private int id;
	private Date created_at;
	private Date updated_at;
	private double total;
	private Cliente cliente;
	private ArrayList<Item> items;
	
	public Venta(int id, Date created_at, Date updated_at, double total, Cliente cliente, ArrayList<Item> items) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.total = total;
		this.cliente = cliente;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	
	
	
	

}
