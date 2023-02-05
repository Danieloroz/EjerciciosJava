package Ejercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sandwichOrder sandwichOrder = new sandwichOrder();
        Scanner lector = new Scanner(System.in);

        System.out.println("De que tamaño desea su sanduche?");
        sandwichOrder.setTamaño(lector.next());
        System.out.println("Qué proteina desea en su orden? Pavo o Tocineta");
        sandwichOrder.setProteina(lector.next());
        System.out.println("Desea queso?");
        sandwichOrder.setQueso(lector.next());
        System.out.println("Desea jalapeños? ");
        sandwichOrder.setJalapeños(lector.next());

        sandwichOrder.armado();

        System.out.println(sandwichOrder.mensaje());


    }

}
