package Ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fotocopia fotocopia = new fotocopia();
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de copias que desea imprimir");
        fotocopia.asignarCantidad(lector.nextInt());

        fotocopia.calculo();
        fotocopia.precioTotal();

        System.out.println(fotocopia.texto());


    }
}
