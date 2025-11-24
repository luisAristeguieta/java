package entidades;

public class Palos {

	private String corazonRojo;
    private String corazonNegro;
    private String diamante;
    private String trebol;

    // Constructor sin parametros y con valores asignados : 
    public Palos() {
        this.corazonRojo = "CR";
        this.corazonNegro = "CN";
        this.diamante = "DI";
        this.trebol = "TR";
    }

    // Get and Set: 
    
    public String getCorazonRojo() {
        return corazonRojo;
    }

    public void setCorazonRojo(String corazonRojo) {
        this.corazonRojo = corazonRojo;
    }

    public String getCorazonNegro() {
        return corazonNegro;
    }

    public void setCorazonNegro(String corazonNegro) {
        this.corazonNegro = corazonNegro;
    }

    public String getDiamante() {
        return diamante;
    }

    public void setDiamante(String diamante) {
        this.diamante = diamante;
    }

    public String getTrebol() {
        return trebol;
    }

    public void setTrebol(String trebol) {
        this.trebol = trebol;
    }
}
