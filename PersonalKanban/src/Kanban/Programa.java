package Kanban;

public class Programa {

	public static void main(String[] args) {
		Tarea tarea = new Tarea();
		
		tarea.setDescripcion("Completar el programa");
		
		listadetareas lista = new listadetareas();
		if (lista.Agregar(tarea)){
			System.out.println("Agregada");
		}

	}

}
