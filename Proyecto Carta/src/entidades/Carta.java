package entidades;

public class Carta {
	private Numero numero;
    private String palo;
    private String estado;   // Teniendo  a "N" = no barajada, y tambien "C" = copiada a barajado

    // Constructor con dos parametros y una asignacion:
    public Carta(Numero numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        this.estado = "N";
    }

    // Get and Set: 
    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Metodo que se usa mostrar Ejemplo: A-CR
    public String mostrar() {
        return numero.getNumeroCarta() + "-" + palo;
    }
}
