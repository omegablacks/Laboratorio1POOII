

package Modelo;

public class Grupo {

private String id;
private byte capacidad;

    public Grupo() {
    }

    public Grupo(String id, byte capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(byte capacidad) {
        this.capacidad = capacidad;
    }



}
