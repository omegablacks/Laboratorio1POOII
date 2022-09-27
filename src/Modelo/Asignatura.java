

package Modelo;

public class Asignatura {

private String codigo;
private String nombre;
private short creditos;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, short creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
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

    public short getCreditos() {
        return creditos;
    }

    public void setCreditos(short creditos) {
        this.creditos = creditos;
    }


}
