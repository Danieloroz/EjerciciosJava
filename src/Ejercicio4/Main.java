package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        semaforo semaforo = new semaforo();

        semaforo.colorBombilla = "verde";
        semaforo.encendidoApagado = "si";

        System.out.println(semaforo.mostrarMensajeAlVehiculo());
    }
}
