package Ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        triangulo traingulo = new triangulo();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite 3 numeros");
        traingulo.setNum1(lector.nextInt());
        traingulo.setNum2(lector.nextInt());
        traingulo.setNum3(lector.nextInt());

        traingulo.sumar();

        System.out.println(traingulo.resultado());
    }
}
