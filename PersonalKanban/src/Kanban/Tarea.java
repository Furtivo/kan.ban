package Kanban;

import java.util.Date;

public class Tarea {
	private String descripcion;
	private int estado;
	private String categoria;
	private int prioridad;
	private String propietarios;
	private Date entrega;
	private Date creacion;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public String getPropietarios() {
		return propietarios;
	}
	public void setPropietarios(String propietarios) {
		this.propietarios = propietarios;
	}
	public Date getEntrega() {
		return entrega;
	}
	public void setEntrega(Date entrega) {
		this.entrega = entrega;
	}
	public Date getCreacion() {
		return creacion;
	}
	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}
	
	
}
