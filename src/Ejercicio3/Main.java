package Ejercicio3;

public class Main {

    public static void main(String[] args) {

        prestamoLibro prestamoLibro = new prestamoLibro();

        prestamoLibro.diasDePrestamo = 4;
        prestamoLibro.nombreLibro = "Cien años de soledad";
        prestamoLibro.fechaPrestamo = "04/02/23";
        prestamoLibro.estadoPrestamo = "vigente";
        prestamoLibro.codigoUsuario = 051;
        prestamoLibro.codPrestamo = 123;

        System.out.println("Estado: " + prestamoLibro.estadoPrestamo);

        System.out.println("Datos del prestamo: " + prestamoLibro.consultarDatosPrestamo());
    }
}
