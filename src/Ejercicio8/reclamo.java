package Ejercicio8;

public class reclamo {

    public int numeroReclamo;
    private String nombrePersona;
    private String asunto;
    public String descripcionReclamo;
    private String estadoReclamo;

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(String estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }

    public String validarEstadoReclamo(){
        if(estadoReclamo == ("Recibido")){
            return " Reclamo recibido, actualmente siendo revisado ";
        }else{
            return " Reclamo pendiente ";
        }
    }

    public String mensajeRecepcionReclamo(){
        return " El reclamo numero " + numeroReclamo + " de la persona " + nombrePersona + ": " + descripcionReclamo + " ha sido recibido ";
    }
}
