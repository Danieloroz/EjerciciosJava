package Ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        salario salario = new salario();
        Scanner lector = new Scanner(System.in);

        System.out.println(" Digite su nombre ");
        salario.setNombre(lector.next());

        System.out.println(" Ingrese el numero de horas trabajadas ");
        salario.setNumeroDeHoras(lector.nextInt());

        salario.calcularValorHoras();

        System.out.println(" Señor " + salario.nombre + " el numero de horas trabajadas es " + salario.numeroDeHoras + " , su salario es de " + salario.salarioTotal());
    }
}
