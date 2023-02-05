package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        reclamo reclamo = new reclamo();

        reclamo.numeroReclamo = 200;
        reclamo.setNombrePersona("Daniel");
        reclamo.setAsunto("Producto en mal estado");
        reclamo.descripcionReclamo = " Recibi el producto en muy malas condiciones, la caja estaba maltratada ";
        reclamo.setEstadoReclamo("Recibido");

        System.out.println(reclamo.validarEstadoReclamo());
        System.out.println(reclamo.mensajeRecepcionReclamo());
    }
}
