package entidades;

public class Numero {
	
	private String numeroCarta;
    private int valor;

    // Constructor con todos los parametros: 
    public Numero(String numeroCarta, int valor) {
        this.numeroCarta = numeroCarta;
        this.valor = valor;
    }

    // Get and Set: 
    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Se usa este metodo Para mostrar info como ejemplo: A-11
    public String mostrar() {
        return numeroCarta + " - " + valor;
    }
}
