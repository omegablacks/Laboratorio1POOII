
package Modelo;

/**
 * @author Omegablacks
 */
public class DocPlanta extends Profesor{
    
private double salarioBasico;
private int puntosSalariales;
private double valorPunto;
private String categoria;
private int nResolucion;
private String fechaNombramiento;

    public DocPlanta() {
    super();
    }

    public DocPlanta(double salarioBasico, int puntosSalariales, double valorPunto, String categoria, int nResolucion, String fechaNombramiento, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salarioBasico = salarioBasico;
        this.puntosSalariales = puntosSalariales;
        this.valorPunto = valorPunto;
        this.categoria = categoria;
        this.nResolucion = nResolucion;
        this.fechaNombramiento = fechaNombramiento;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }
    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getPuntosSalariales() {
        return puntosSalariales;
    }
    public void setPuntosSalariales(int puntosSalariales) {
        this.puntosSalariales = puntosSalariales;
    }

    public double getValorPunto() {
        return valorPunto;
    }
    public void setValorPunto(double valorPunto) {
        this.valorPunto = valorPunto;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getnResolucion() {
        return nResolucion;
    }
    public void setnResolucion(int nResolucion) {
        this.nResolucion = nResolucion;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }
    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

public double calcularSalario(){
return this.getSalarioBasico() + (this.getPuntosSalariales() * this.getValorPunto());
}

}
