package Ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lavadoras lavadoras = new lavadoras();
        Scanner lector = new Scanner(System.in);

        System.out.println(" Digite 1 para lavadora grande / digite 2 para lavadora pequeña ");
        lavadoras.setTipo(lector.nextInt());
        System.out.println(" Cuantas lavadoras desea alquilar? ");
        lavadoras.setCantidad(lector.nextInt());
        System.out.println(" Por cuanto tiempo desea alquilar? ");
        lavadoras.setHoras(lector.nextInt());

        lavadoras.valor();

        System.out.println(" El valor total es: " + lavadoras.valorTotal());
    }
}
