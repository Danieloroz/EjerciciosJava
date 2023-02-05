package Ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gimnasio gimnasio = new gimnasio();
        Scanner lector = new Scanner(System.in);

        System.out.println(" Ingrese el tiempo deseado ");
        gimnasio.setTiempo(lector.nextInt());

        System.out.println(gimnasio.mensaje());
    }
}
