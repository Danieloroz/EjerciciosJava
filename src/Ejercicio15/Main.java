package Ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        alcaldia alcaldia = new alcaldia();
        Scanner lector = new Scanner(System.in);

        System.out.println(" Ingrese su genero ");
        alcaldia.setGenero(lector.next());
        System.out.println(" Escriba su edad ");
        alcaldia.setEdad(lector.nextInt());

        System.out.println(alcaldia.todo());
    }
}
