package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo = "A";
	private double saldo;
	
	// Aplica principio de encapsulamiento sin colocar setId:
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getId() {
		return id;
	}
	
	// Se crean constructores: 
	public Cuenta( String id) {
		this.id = id;
		this.tipo = "A";
	}
	
	public Cuenta( String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	// Crea metodo imprimir: 
	public void imprimir () {
		System.out.println("****************");
		System.out.println("CUENTA");
		System.out.println("Numero de Cuenta:" + getId());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Saldo: USD " + getSaldo());
		System.out.println("****************");
	}
	
	// Crea metodo imprimir mi estilo: 
	public void imprimirConMiEstilo () {
		System.out.println("════════════════════════");
		System.out.println("🏦 Cuenta Bancaria");
		System.out.println("Numero de Cuenta:" + getId());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Saldo: 💲 " + getSaldo());
		System.out.println("════════════════════════");
	}
	
}
