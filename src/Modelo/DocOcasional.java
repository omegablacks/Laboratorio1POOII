
package Modelo;

/**
 * @author Omegablacks
 */
public class DocOcasional extends Profesor{
    
private double salarioBasico;

    public DocOcasional() {
    super();
    }

    public DocOcasional(double salarioBasico, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salarioBasico = salarioBasico;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }



}
