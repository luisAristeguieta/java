package test;

import java.util.ArrayList;

import componentes.Celda;
import componentes.Producto;
import maquina.MaquinaDulces;

public class TestBuscarMenores {

    public static void main(String[] args) {

        MaquinaDulces maquina = new MaquinaDulces();

        maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));

        maquina.cargarProducto(new Producto("KE34", "Papitas", 0.85), "A1", 5);
        maquina.cargarProducto(new Producto("D456", "Doritos", 0.50), "A2", 4);
        maquina.cargarProducto(new Producto("PP20", "Jet", 0.25), "B1", 6);
        maquina.cargarProducto(new Producto("TD10", "DeTodito", 0.60), "B2", 3);
        maquina.cargarProducto(new Producto("XX12", "Maní", 1.10), "C1", 2);
        maquina.cargarProducto(new Producto("YY50", "Chocolate", 1.50), "C2", 1);

        ArrayList<Producto> menores = maquina.buscarMenores(1.00);

        System.out.println("Productos Menores: " + menores.size());
        for (Producto p : menores) {
            System.out.println("Nombre:" + p.getNombre() + " Precio:" + p.getPrecio());
        }
    }
}