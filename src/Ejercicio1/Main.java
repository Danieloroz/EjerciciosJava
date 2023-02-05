package Ejercicio1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        Usuario usuario = new Usuario();

        usuario.validarEstado("clave");

        System.out.println("Buenas, " + usuario.permitirAcceso());
    }
}