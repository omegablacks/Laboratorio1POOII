
package Modelo;

/**
 * @author Omegablacks
 */
public class DocCatedra extends Profesor{
    
private short nContratoSemes;
private byte nHorasSemanal;
private double valorHora;

    public DocCatedra() {
    super();
    }

    public DocCatedra(short nContratoSemes, byte nHorasSemanal, double valorHora, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.nContratoSemes = nContratoSemes;
        this.nHorasSemanal = nHorasSemanal;
        this.valorHora = valorHora;
    }

    public short getnContratoSemes() {
        return nContratoSemes;
    }
    public void setnContratoSemes(short nContratoSemes) {
        this.nContratoSemes = nContratoSemes;
    }

    public byte getnHorasSemanal() {
        return nHorasSemanal;
    }
    public void setnHorasSemanal(byte nHorasSemanal) {
        this.nHorasSemanal = nHorasSemanal;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }



}
