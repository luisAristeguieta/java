package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas = new ArrayList<Nota>();

	// Constructor con 3 parametros:
	public Estudiante(String nombre, String apellido, String cedula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	// Get and Set:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	// Metodos ejercicio:

	// Metodo agregarNota, para agregar se coloca que los valores de nuevanota no
	// sean null, que se encuentre entre 0 y 10, y el codigo de materia no
	// se repita. Con estas validaciones se asegura que hay un filtro para valores
	// null o que hacer con ellos.
	public void agregarNota(Nota nuevaNota) {
		if (nuevaNota == null || nuevaNota.getMateria() == null) {
			System.out.println("No se puede agregar: la nota o la materia es null");
			return;
		}

		double cal = nuevaNota.getCalificacion();
		if (cal < 0 || cal > 10) {
			System.out.println("No se puede agregar: la nota debe estar entre 0 y 10");
			return;
		}

		String codigoMateria = nuevaNota.getMateria().getCodigo();

		for (int i = 0; i < notas.size(); i++) {
			Nota n = notas.get(i);
			if (n.getMateria() != null && n.getMateria().getCodigo().equalsIgnoreCase(codigoMateria)) {

				System.out.println("No se puede agregar: ya existe una nota para la materia " + codigoMateria);
				return;
			}
		}

		notas.add(nuevaNota);
		System.out.println("Nota agregada correctamente para la materia " + codigoMateria);
	}

	// Metodo modificarNota:
	public void modificarNota(String codigoMateria, double nuevaNota) {
		if (nuevaNota < 0 || nuevaNota > 10) {
			System.out.println("Nota inválida, debe estar entre 0 y 10");
			return;
		}

		for (int i = 0; i < notas.size(); i++) {
			Nota n = notas.get(i);
			if (n.getMateria() != null && n.getMateria().getCodigo().equalsIgnoreCase(codigoMateria)) {

				n.setCalificacion(nuevaNota);
				System.out.println("Nota modificada para materia " + codigoMateria);
				return;
			}
		}

		System.out.println("No se encontró la materia con código " + codigoMateria);
	}

	// Metodo calcularPromedioNotasEstudiante:
	public double calcularPromedioNotasEstudiante() {

		// Si no hay notas validar y no calcular el promedio
		if (notas.size() == 0) {
			return 0;
		}

		double suma = 0;
		for (int i = 0; i < notas.size(); i++) {
			suma += notas.get(i).getCalificacion();
		}
		return suma / notas.size();
	}

	// Metodo mostrar:
	public void mostrar() {
		System.out.println("Estudiante[nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]");

		// Si no tiene notas:
		if (notas.size() == 0) {
			System.out.println("  Sin notas registradas.");
		} else {
			// Mostrar cada nota si tiene y no esta vacio el arreglo
			System.out.println("  Notas:");
			for (int i = 0; i < notas.size(); i++) {
				System.out.print("    - ");
				notas.get(i).mostrar();
			}

			double promedio = calcularPromedioNotasEstudiante();
			System.out.println("  Promedio: " + promedio);
		}
	}
}
