package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Directorio {

    private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    private Date ultimaModificacion;
    private ArrayList<Contacto> correctos = new ArrayList<Contacto>();
    private ArrayList<Contacto> incorrectos = new ArrayList<Contacto>();

    
    // Get nuevos: 
    
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public ArrayList<Contacto> getCorrectos() {
        return correctos;
    }

    public ArrayList<Contacto> getIncorrectos() {
        return incorrectos;
    }

    // Metodo depurar: 
    public void depurar() {
        for (int i = 0; i < contactos.size(); i++) {
            Contacto c = contactos.get(i);

            if (c.getDireccion() != null) {
                correctos.add(c);
            } else {
                incorrectos.add(c);
            }
        }
        contactos.clear();
    }
    
 
    // Metodo contarFijos: 
    public int contarFijos() {
        int contador = 0;

        for (int i = 0; i < contactos.size(); i++) {
            Contacto c = contactos.get(i);
            ArrayList<Telefono> telefonos = c.getTelefonos();

            boolean tieneFijoCorrecto = false;

            for (int j = 0; j < telefonos.size() && !tieneFijoCorrecto; j++) {
                Telefono t = telefonos.get(j);

                if (t.getTipo().equalsIgnoreCase("Convencional")
                        && t.getEstado().equalsIgnoreCase("C")) {
                    tieneFijoCorrecto = true;
                }
            }

            if (tieneFijoCorrecto) {
                contador++;
            }
        }

        return contador;
    }
    
    
    // Metodo contarPerdidos: 
    public int contarPerdidos() {
        int contador = 0;
        for (int i = 0; i < contactos.size(); i++) {
            Contacto c = contactos.get(i);
            if (c.getDireccion() == null) {
                contador++;
            }
        }
        return contador;
    }
    
    
    // Metodo buscarPorCedula:
    public Contacto buscarPorCedula(String cedula) {
        for (int i = 0; i < contactos.size(); i++) {
            Contacto c = contactos.get(i);
            if (c.getCedula().equalsIgnoreCase(cedula)) {
                return c;
            }
        }
        return null;
    }

    // Metodo agregarContacto, reescribe para evitar repetidos y actualiza fecha: 
    public boolean agregarContacto(Contacto c) {
        if (c == null) {
            System.out.println("El contacto no puede ser null");
            return false;
        }

        Contacto encontrado = buscarPorCedula(c.getCedula());

        if (encontrado != null) {
            return false;
        }
        contactos.add(c);
        ultimaModificacion = new Date(); 
        return true;
    }

    // Metodo consultarUltimaModificacion
    public String consultarUltimaModificacion() {
        if (ultimaModificacion == null) {
            return "Aún no hay modificaciones";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf.format(ultimaModificacion);
    }
}