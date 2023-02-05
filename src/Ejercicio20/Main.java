package Ejercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        empresa empresa = new empresa();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite el numero de serie de su carro");
        empresa.asignarNum(lector.nextInt());

        System.out.println(empresa.mensaje());

    }
}
