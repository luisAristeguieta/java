package componentes;

public class Producto {

	private String codigo;
	private String nombre;
	private double precio;
	
	public void incrementarPrecio ( double porcentaje) {
		double p = precio + (precio * (porcentaje/100));
		setPrecio(p);
	}
	
	public void disminuirPrecio ( double valor) {
		double p = precio - valor;
		setPrecio(p);
	}
	

	public Producto(String codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	
}
