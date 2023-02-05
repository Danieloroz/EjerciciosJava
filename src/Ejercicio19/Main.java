package Ejercicio19;

public class Main {
    public static void main(String[] args) {
        reparacion reparacion = new reparacion();

        reparacion.girarDisco = false;
        reparacion.numPitidos = 0;

        System.out.println(reparacion.validarReparacion());


    }

}
