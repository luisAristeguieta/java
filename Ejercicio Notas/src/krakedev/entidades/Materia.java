package krakedev.entidades;

public class Materia {
    private String codigo;
    private String nombre;

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Materia:");
        System.out.println("  Código: " + codigo);
        System.out.println("  Nombre: " + nombre);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}