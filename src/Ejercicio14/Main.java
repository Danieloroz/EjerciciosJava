package Ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numMayor numMayor = new numMayor();
        Scanner lector = new Scanner(System.in);

        System.out.println(" Ingrese tres numeros distintos ");
        numMayor.setNum1(lector.nextInt());
        numMayor.setNum2(lector.nextInt());
        numMayor.setNum3(lector.nextInt());

        System.out.println(numMayor.comprobar());
    }
}
