package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Prestamo> prestamos;
    private ArrayList<Cliente> clientes;

    public Banco() {
        prestamos = new ArrayList<Prestamo>();
        clientes = new ArrayList<Cliente>();
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    // Metodo de Buscaquedad de Cliente por cedula: 
    public Cliente buscarCliente(String cedula) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }

    // Metodo registrarCliente: 
    public void registrarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getCedula()) == null) {
            clientes.add(cliente);
            System.out.println("Cliente registrado :" + cliente.getNombre() + " " + cliente.getApellido() +
                    "[cedula=" + cliente.getCedula() + ", nombre=" + cliente.getNombre() +
                    ", apellido=" + cliente.getApellido() + "]");
        } else {
            System.out.println("Cliente ya existe :" + cliente.getCedula());
        }
    }

    // Agregar este metodo, asignarPrestamo: 
    public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {

        Cliente cliente = buscarCliente(cedulaCliente);

        if (cliente == null) {
            System.out.println("no es cliente del banco");
            return;
        }

        // Asociar préstamo al cliente y generar su tabla
        prestamo.setCliente(cliente);

        CalculadoraAmortizacion calc = new CalculadoraAmortizacion();
        calc.generarTabla(prestamo);

        prestamos.add(prestamo);
    }

    // Buscar préstamos por cédula
    public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente) {

        ArrayList<Prestamo> resultado = new ArrayList<Prestamo>();

        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo p = prestamos.get(i);
            if (p.getCliente() != null &&
                p.getCliente().getCedula().equals(cedulaCliente)) {
                resultado.add(p);
            }
        }

        if (resultado.isEmpty()) {
            return null;
        }

        return resultado;
    }
}
