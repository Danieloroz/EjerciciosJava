package Ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        parImpar parImpar = new parImpar();
        Scanner lector = new Scanner(System.in);

        System.out.println(" Ingrese el numero deseado ");
        parImpar.setNumero(lector.nextInt());

        System.out.println(parImpar.calculo());
    }
}
