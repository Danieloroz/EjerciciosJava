package Ejercicio4;

public class semaforo {

    public String colorBombilla;
    public String encendidoApagado;

    public void cambiarColor(){
        if(colorBombilla == ("amarillo")){
            this.colorBombilla = "verde";
        }
    }

    public String apagarSemaforo(){
        if(encendidoApagado == ("no")){
            return "encendido";
        }else{
            return "apagado";
        }
    }

    public String encenderSemaforo(){
        if(encendidoApagado == ("si")){
            return "encendido";
        }else{
            return "apagado";
        }
    }

    public String mostrarMensajeAlVehiculo(){
        if(colorBombilla == ("verde")){
            return " El color del semaforo es " + colorBombilla + " , siga";
        }else if(colorBombilla == ("rojo")){
            return " El color del semaforo es " + colorBombilla + " , pare ";
        }else{
            return "null";
        }
    }
}
