package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	// Solo get siendo una coleccion sin set:
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	// Metodo buscarEstudiantePorCedula:
	public Estudiante buscarEstudiantePorCedula(String cedula) {
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante e = estudiantes.get(i);
			if (e.getCedula().equals(cedula)) {
				return e;
			}
		}
		return null;
	}

	// Metodo buscarEstudiantePorCedula:
	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		if (estudiante == null) {
			return null;
		}
		return buscarEstudiantePorCedula(estudiante.getCedula());
	}

	// Metodo matricularEstudiantes:
	// Realizan validaciones en los metodos agregar para que no exista errores en
	// valores null o que hacer.
	public void matricularEstudiantes(Estudiante estudiante) {
		if (estudiante == null) {
			System.out.println("No se puede matricular porque se tiene estudiante con valor null");
			return;
		}

		Estudiante yaExiste = buscarEstudiantePorCedula(estudiante.getCedula());
		if (yaExiste != null) {
			System.out.println("El estudiante con cédula " + estudiante.getCedula() + " ya está matriculado.");
			return;
		}

		estudiantes.add(estudiante);
		System.out.println("Estudiante " + estudiante.getNombre() + " matriculado correctamente.");
	}

	// Metodo calcularPromedioCurso:
	public double calcularPromedioCurso() {
		if (estudiantes.size() == 0) {
			return 0;
		}

		double sumaPromedios = 0;
		int cont = 0;

		for (int i = 0; i < estudiantes.size(); i++) {
			double promEst = estudiantes.get(i).calcularPromedioNotasEstudiante();
			sumaPromedios += promEst;
			cont++;
		}

		if (cont == 0) {
			return 0;
		}
		return sumaPromedios / cont;
	}

	public void mostrar() {
		System.out.println("Curso[totalEstudiantes=" + estudiantes.size() + "]");
		System.out.println("Detalle de estudiantes:");

		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println("********************************");
			estudiantes.get(i).mostrar();
		}

		System.out.println("********************************");
		System.out.println("Promedio general del curso: " + calcularPromedioCurso());
	}
}
