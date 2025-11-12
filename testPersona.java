package com.krakedev;

public class testPersona {

	public static void main(String[] args) {
		Persona p; // 1.Declaracion de una variable llamado p de tipo Persona.
		p = new Persona(); // 2.Instanciar o crear un objeto Persona y referencie en p.
		// 3. Accedo a los atributos.
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);
		
		// Modificacion de atributos
		p.nombre = "ALbert";
		p.edad = 30;
		p.estatura=1.70;
		
		System.out.println("Objeto Nro 1");
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);
		
		// 4. Instancias mas objetos + asignar atributos;
		
		Persona p2 = new Persona();
		p2.nombre = "Juan";
		p2.edad = 28;
		p2.estatura= 1.80;
		
		System.out.println("Objeto Nro 2");
		System.out.println("Nombre: " + p2.nombre);
		System.out.println("Edad: " + p2.edad);
		System.out.println("Estatura: " + p2.estatura);

	}

}
