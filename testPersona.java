package com.krakedev;

public class testPersona {

	public static void main(String[] args) {
		Persona p; // 1.Declaracion de una variable llamado p de tipo Persona.
		p = new Persona(); // 2.Instanciar o crear un objeto Persona y referencie en p.
		// 3. Accedo a los atributos.
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());
		
		// Modificacion de atributos
		p.setNombre("ALbert");
		p.setEdad(30);
		p.setEstatura(1.70);
		
		System.out.println("Objeto Nro 1");
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());
		
		// 4. Instancias mas objetos + asignar atributos;
		
		Persona p2 = new Persona();
		p2.setNombre("Juan");
		p2.setEdad(28);
		p2.setEstatura(1.80);
		
		System.out.println("Objeto Nro 2");
		System.out.println("Nombre: " + p2.getNombre());
		System.out.println("Edad: " + p2.getEdad());
		System.out.println("Estatura: " + p2.getEstatura());

	}

}
