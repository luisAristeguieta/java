package maquina;

import java.util.ArrayList;
import componentes.Celda;
import componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		this.celdas = new ArrayList<Celda>();
		this.setSaldo(0);
	}

	
	public ArrayList<Producto> buscarMenores(double limite) {
	    ArrayList<Producto> resultado = new ArrayList<Producto>();

	    for (int i = 0; i < celdas.size(); i++) {
			Celda c = celdas.get(i);
			if (c.getProducto() != null && c.getProducto().getPrecio() <= limite) {
	            resultado.add(c.getProducto());
	        }
	    }
	    return resultado;
	}
			
				
	public double venderConCambio(String codigoCelda, double dineroCliente) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
            double precio = celda.getProducto().getPrecio();
            celda.setStock(celda.getStock() - 1);
            saldo += precio;
            return dineroCliente - precio;
        }
        // Si algo falla, se devuelve todo el dinero.
        return dineroCliente;
    }

	
	public void vender(String codigoCelda){
		Celda c = buscarCelda(codigoCelda);
		if (c != null && c.getProducto() != null && c.getStock() > 0) {
            c.setStock(c.getStock() - 1);
            saldo += c.getProducto().getPrecio();
		}else {
			System.out.println("No existe producto o celda con el codigo ingresado.");
		}
		
	}
	
	
	public void incrementarProductos(String codigoProducto, int cantidadItens){
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if(celdaEncontrada!=null) {
		celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidadItens);
		}
	}
	
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda c = celdas.get(i);
			if (c != null && c.getProducto() != null && c.getProducto().getCodigo().equalsIgnoreCase(codigoProducto)) {
				return c;
			}
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda c = celdas.get(i);
			if (c.getCodigo().equals(codigoCelda)) {
				return c.getProducto().getPrecio();
			}
		}
		return 0.0;
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {

		for (int i = 0; i < celdas.size(); i++) {
			Celda c = celdas.get(i);
			if (c != null && c.getProducto() != null && c.getCodigo().equals(codigoCelda)) {
				return c.getProducto();
			}
		}
		return null;
	}

	public void mostrarProductos() {

		for (int i = 0; i < celdas.size(); i++) {
			Celda c = celdas.get(i);
			Producto p = c.getProducto();
			if (p != null) {
				System.out.println("Celda:" + c.getCodigo() + " " + "Stock: " + c.getStock() + " Producto:"
						+ c.getProducto().getNombre() + " Precio:" + c.getProducto().getPrecio());
			} else {
				System.out
						.println("Celda:" + c.getCodigo() + " " + "Stock: " + c.getStock() + " Sin Producto Asignado");
			}
		}
		System.out.println("Saldo: " + saldo);
	}

	public void cargarProducto(Producto producto, String codigoCelda, int stockInicial) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, stockInicial);
	}

	public Celda buscarCelda(String codigoCelda) {

		for (int i = 0; i < celdas.size(); i++) {
			Celda elemento = celdas.get(i);
			if (elemento.getCodigo().equalsIgnoreCase(codigoCelda)) {
				return elemento;
			}
		}
		return null;
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda c = celdas.get(i);
			System.out.println("Celda" + (i + 1) + ":" + c.getCodigo());
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
