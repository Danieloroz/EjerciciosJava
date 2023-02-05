package Ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        positivoNegativo positivoNegativo = new positivoNegativo();
        Scanner lector = new Scanner(System.in);

        System.out.println(" Digite el numero deseado ");
        positivoNegativo.setNumero(lector.nextByte());

        System.out.println(positivoNegativo.resultado());
    }
}
