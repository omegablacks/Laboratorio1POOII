

package Modelo;


public class Programa {

private String codigo;
private String nombre;
private Profesor director;

    public Programa() {
    }

    public Programa(String codigo, String nombre, Profesor director) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.director = director;
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

    public Profesor getDirector() {
        return director;
    }

    public void setDirector(Profesor director) {
        this.director = director;
    }



}
