package Ejercicio23;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        juego21 juego21 = new juego21();
        Scanner x = new Scanner(System.in);
        juego21.carta1Uno =    (int)(Math. random()*10+1);
        juego21.carta2Uno =    (int)(Math. random()*10+1);
        juego21.carta3Uno =    (int)(Math. random()*10+1);
        juego21.carta1Dos =    (int)(Math. random()*10+1);
        juego21.carta2Dos =    (int)(Math. random()*10+1);
        juego21.carta3Dos =    (int)(Math. random()*10+1);

        System.out.println(" Empezo el juego ");
        System.out.println(" Jugador 1 \n carta 1: "+ juego21.carta1Uno + " carta 2: "+ juego21.carta2Uno);
        System.out.println(" Jugador 2 \n carta 1: "+ juego21.carta1Dos + " carta 2: "+ juego21.carta2Dos);
        System.out.println(" Oprima cualquier tecla para ver resultados ");

        System.out.println("Jugador 1 \n carta: 1 "+ juego21.carta3Uno);
        System.out.println("Jugador 2 \n carta: 1 "+ juego21.carta3Dos);
        juego21.jugar();
    }
}
