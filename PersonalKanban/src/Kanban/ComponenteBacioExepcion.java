package Kanban;

import java.awt.TextField;

public class ComponenteBacioExepcion extends Exception {
	private TextField componente;
	public ComponenteBacioExepcion(String mensaje,TextField c){
		super(mensaje);
		componente=c;
	}
	public TextField getComponente(){
		return componente;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
