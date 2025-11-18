package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	
	// Constructor por defecto:
	public MaquinaDulces() {
	    this.saldo = 0;
	}
	
	// Metodo configurarMaquina: 
	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1 = new Celda(c1);
		celda2 = new Celda(c2);
		celda3 = new Celda(c3);
		celda4 = new Celda(c4);
	}

	// Metodo mostrarConfiguracion: 
	public void mostrarConfiguracion() {
		System.out.println("*********************************");
		System.out.println("Los Codigos de las celdas son: ");
		System.out.println("CELDA 1:" + celda1.getCodigo());
		System.out.println("CELDA 2:" + celda2.getCodigo());
		System.out.println("CELDA 3:" + celda3.getCodigo());
		System.out.println("CELDA 4:" + celda4.getCodigo());
		System.out.println("*********************************");
	}

	// Metodo buscarCelda: 
	public Celda buscarCelda(String codigoCelda) {
		if (celda1.getCodigo().equals(codigoCelda)) {
			return celda1;
		}
		if (celda2.getCodigo().equals(codigoCelda)) {
			return celda2;
		}
		if (celda3.getCodigo().equals(codigoCelda)) {
			return celda3;
		}
		if (celda4.getCodigo().equals(codigoCelda)) {
			return celda4;
		}
		return null;
	}

	// Metodo cargarProducto: 
	public void cargarProducto(Producto p, String cc, int c) {
		Celda celdaRecuperada = buscarCelda(cc);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(p, c);
		}
	}

	// Metodo mostrarProductos:
	public void mostrarProductos() {
	    
		// Revisar celda1
	    System.out.println("************CELDA " + celda1.getCodigo());
	    System.out.println("Stock: " + celda1.getStock());
	    if (celda1.getProducto() == null) {
	        System.out.println("La celda no tiene producto!!!");
	    } else {
	        System.out.println("Nombre Producto:" + celda1.getProducto().getNombre());
	        System.out.println("Precio Producto:" + celda1.getProducto().getPrecio());
	        System.out.println("Código Producto:" + celda1.getProducto().getCodigo());
	    }

	 // Revisar celda2
	    System.out.println("************CELDA " + celda2.getCodigo());
	    System.out.println("Stock: " + celda2.getStock());
	    if (celda2.getProducto() == null) {
	        System.out.println("La celda no tiene producto!!!");
	    } else {
	        System.out.println("Nombre Producto:" + celda2.getProducto().getNombre());
	        System.out.println("Precio Producto:" + celda2.getProducto().getPrecio());
	        System.out.println("Código Producto:" + celda2.getProducto().getCodigo());
	    }

	 // Revisar celda3
	    System.out.println("************CELDA " + celda3.getCodigo());
	    System.out.println("Stock: " + celda3.getStock());
	    if (celda3.getProducto() == null) {
	        System.out.println("La celda no tiene producto!!!");
	    } else {
	        System.out.println("Nombre Producto:" + celda3.getProducto().getNombre());
	        System.out.println("Precio Producto:" + celda3.getProducto().getPrecio());
	        System.out.println("Código Producto:" + celda3.getProducto().getCodigo());
	    }

	 // Revisar celda4
	    System.out.println("************CELDA " + celda4.getCodigo());
	    System.out.println("Stock: " + celda4.getStock());
	    if (celda4.getProducto() == null) {
	        System.out.println("La celda no tiene producto!!!");
	    } else {
	        System.out.println("Nombre Producto:" + celda4.getProducto().getNombre());
	        System.out.println("Precio Producto:" + celda4.getProducto().getPrecio());
	        System.out.println("Código Producto:" + celda4.getProducto().getCodigo());
	    }

	    System.out.println("Saldo: " + saldo);
	}

	// Metodo buscarProductoEnCelda:
	public Producto buscarProductoEnCelda(String codigoCelda) {

		Celda c = buscarCelda(codigoCelda);
		if (c != null) {
			return c.getProducto();
		}
		return null;
	}
	
	// Metodo consultarPrecio:
	public double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getProducto() != null) {
			return celda.getProducto().getPrecio();
		}
		return 0.0;
	}
	
	// Metodo buscarCeldaProducto:
	public Celda buscarCeldaProducto(String codigoProducto) {

	    // Revisar celda1
	    if (celda1.getProducto() != null &&
	        celda1.getProducto().getCodigo().equals(codigoProducto)) {
	        return celda1;
	    }

	    // Revisar celda2
	    if (celda2.getProducto() != null &&
	        celda2.getProducto().getCodigo().equals(codigoProducto)) {
	        return celda2;
	    }

	    // Revisar celda3
	    if (celda3.getProducto() != null &&
	        celda3.getProducto().getCodigo().equals(codigoProducto)) {
	        return celda3;
	    }

	    // Revisar celda4
	    if (celda4.getProducto() != null &&
	        celda4.getProducto().getCodigo().equals(codigoProducto)) {
	        return celda4;
	    }

	    // Si no encontró nada
	    return null;
	}
	
	// Metodo incrementarProductos:
	public void incrementarProductos(String codigoProducto, int cantidad) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            int nuevoStock = celdaEncontrada.getStock() + cantidad;
            celdaEncontrada.setStock(nuevoStock);
        }
    }
	
	// Metodo vender:
	public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
            celda.setStock(celda.getStock() - 1);
            saldo += celda.getProducto().getPrecio();
        }
    }

	// Metodo venderConCambio:
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
	
	
    // Get and Set : 
    
	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
