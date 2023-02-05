package Ejercicio7;

public class envio {

    public int numeroGuia;
    private String fecha;
    private String tipoEmbalaje;
    public String cedulaCliente;
    private int peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private int costo;
    private String estadoEnvio;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public int calcularCostoXkilo(){
        return peso*4000;
    }

    public String verificarEntrega(){
        if(estadoEnvio ==("Enviado")){
            return " El estado del envio es: " + estadoEnvio + " hacia " + ciudadDestino + " desde " + ciudadOrigen + " por el cliente de cedula " + cedulaCliente + " , el numero de guia es " + numeroGuia;
        }else{
            return " El estado del envio es " + estadoEnvio;
        }
    }
}
