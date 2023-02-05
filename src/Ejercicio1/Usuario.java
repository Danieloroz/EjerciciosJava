package Ejercicio1;

public class Usuario {

    public String usuarioBase;
    public String usuarioIngresado;
    public String claveBase;
    public String claveIngresada;
    public String estadoSistema;

    public String validarEstado(String claveIngresada){

        return this.claveIngresada = claveIngresada;
    }

    public String permitirAcceso(){

        if(claveIngresada.equals("clave")){
            return "Acceso concedido";
        }else{
            return "Acceso denegado";
        }
    }
}
